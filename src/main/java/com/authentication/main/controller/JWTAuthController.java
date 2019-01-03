package com.authentication.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.main.JwtTokenProvider;
import com.authentication.main.model.JwtResponse;
import com.authentication.main.model.LoginForm;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class JWTAuthController {
	
	@Autowired
    AuthenticationManager authenticationManager;
	@Autowired
    JwtTokenProvider jwtProvider;
	
	@PostMapping("/auth")
	public ResponseEntity<?> getMap(@RequestBody LoginForm loginRequest) {
		Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtProvider.generateJwtToken(authentication);
        return ResponseEntity.ok(new JwtResponse(jwt));
	}
}
