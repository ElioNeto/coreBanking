package com.en.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.en.core.models.Users;
import com.en.core.services.UsersService;



@CrossOrigin("*")
@RestController
@RequestMapping(value = "/users")
public class UsersController {

	@Autowired
	private UsersService service;
	
	@GetMapping
	public ResponseEntity<List<Users>> listAll() {
		List<Users> list = service.listAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Users> findById(@PathVariable Integer id) {
		Users obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
