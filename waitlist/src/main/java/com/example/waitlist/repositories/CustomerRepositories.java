package com.example.waitlist.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.waitlist.models.Customers;

@Repository
public interface CustomerRepositories extends JpaRepository<Customers, Long>{
	
	Optional<Customers> findById(Long id);
 
	
}