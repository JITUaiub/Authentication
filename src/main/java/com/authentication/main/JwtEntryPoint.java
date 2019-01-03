package com.authentication.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class JwtEntryPoint implements AuthenticationEntryPoint {

	public void commence(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException authException)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Error -> Unauthorized");
//		
	}

	//private static final Logger logger = LoggerFactory
	//		.getLogger(JwtAuthEntryPoint.class);

//	@Override
//	public void commence(HttpServletRequest request,
//			HttpServletResponse response, AuthenticationException e)
//			throws IOException, ServletException {
//
////		logger.error("Unauthorized error. Message - {}", e.getMessage());
//		response.sendError(HttpServletResponse.SC_UNAUTHORIZED,
//				"Error -> Unauthorized");
//	}
}
