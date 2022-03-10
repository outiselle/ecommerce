package it.rea.ecommerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import it.rea.ecommerce.entity.User;
import it.rea.ecommerce.payload.dto.UserDto;
import it.rea.ecommerce.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired 
	private UserService userService;
	
	@PostMapping("/user/signin")
	public ResponseEntity<?> signin (@Valid @RequestBody UserDto signin){
		
		try {
			userService.registerNewUser(signin);
		} catch (Exception e) {
			return new ResponseEntity<String>("An account for that username/email already exists.", HttpStatus.FORBIDDEN); 
		}
		return new ResponseEntity<String>("registration complete", HttpStatus.OK);
	}

}
