package com.example.waitlist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.waitlist.models.Customers;
import com.example.waitlist.repositories.CustomerRepositories;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class WaitlistController {
	
	@Autowired
	private CustomerRepositories userRepo;
	
	
	@GetMapping("/allCustomers")
	public List<Customers> getAllUsers() {
		return userRepo.findAll();
	}
	
	@PostMapping("/Customers")
	  Customers newUser(@RequestBody Customers newUser) {
	    return userRepo.save(newUser);
	  }
	
	@GetMapping("/Customers/{id}")
	  public Optional<Customers> findUser(@PathVariable Long id){
	    
	    return userRepo.findById(id);
	}
	

}
