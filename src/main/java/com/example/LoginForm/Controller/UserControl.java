package com.example.LoginForm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.UserDetails;
import Service.UserService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/register")
public class UserControl {
	@Autowired
	UserService us;
	
	@PostMapping("/adduser")
	public ResponseEntity<String> AddData(@RequestBody UserDetails u){
		us.datauser(u);
		return ResponseEntity.ok("User added successfully")          ;
		
	}
	

}
