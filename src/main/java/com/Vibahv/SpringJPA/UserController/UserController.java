package com.Vibahv.SpringJPA.UserController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Vibahv.SpringJPA.Record.UserRecord;
import com.Vibahv.SpringJPA.UserService.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userservice;
	
	@GetMapping("/data")    
	public List<UserRecord> getAllUser()  
	{    
	return userservice.GetAll();    
	}       
	@PostMapping("/data")    
	public void addUser(@RequestBody UserRecord userRecord)  
	{    
	userservice.AddUser(userRecord);    
	}  
	
	@PutMapping("/data")
	public UserRecord update(@RequestBody UserRecord userrecord) {
		return userservice.update(userrecord);
	}
	@GetMapping("/data/{id}")
	public Optional<UserRecord> findid(@PathVariable Long id) {
		return userservice.findid(id);
	}
	
	@DeleteMapping("/data/{id}")
	public void delete(@PathVariable Long id) {
		userservice.delete(id);
	}
}
