package com.authentication.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureRestController {
	
	@GetMapping("/secure")
	public String getReq(){
		return "Secure Rest Controller";
	}
}
