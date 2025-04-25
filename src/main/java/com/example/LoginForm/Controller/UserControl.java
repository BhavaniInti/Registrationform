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

import DTOPack.UserDTO;
import Entity.UserDetails;
import Service.UserService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class UserControl {
	@Autowired
	UserService uo;
	
	@PostMapping("/register")
	public ResponseEntity<String> AddData(@RequestBody UserDTO u){
		System.out.println(u);
		UserDetails us=new UserDetails();
		us.setFirstname(u.getFirstname());
		us.setLastname(u.getLastname());
		us.setEmail(u.getEmail());
		us.setPhoneNumber(u.getPhone());
		us.setCourse(u.getCourse());
		us.setGender(u.getGender());
		uo.datauser(us);
		return ResponseEntity.ok("User added successfully")          ;
		
	}
	

}
