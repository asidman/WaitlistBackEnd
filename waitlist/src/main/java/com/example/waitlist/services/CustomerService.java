package com.example.waitlist.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.waitlist.models.Customers;
import com.example.waitlist.repositories.CustomerRepositories;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepositories userRepo;
	
		
	public List<Customers>getAllUsers(){
		List<Customers> users = new ArrayList<>();
		userRepo.findAll()
		.forEach(users::add);
		return users;
	}
	
	
	public void addUser(Customers id) {
		userRepo.save(id);
	}
	

}
