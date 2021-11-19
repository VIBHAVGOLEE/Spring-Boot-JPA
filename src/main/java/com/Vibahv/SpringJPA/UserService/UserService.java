package com.Vibahv.SpringJPA.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vibahv.SpringJPA.Record.UserRecord;
import com.Vibahv.SpringJPA.UserRepository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepository;
	
	public List<UserRecord> GetAll(){
		List<UserRecord>userRecords = new ArrayList<>(); 
		userrepository.findAll().forEach(userRecords::add);   
		return userRecords;
	}
	
	public void AddUser(UserRecord userrecord) {
		userrepository.save(userrecord);
	}
	
	public UserRecord update(UserRecord userrecord) {
		userrepository.save(userrecord);
		return userrecord;
	}
	
	public Optional<UserRecord> findid(Long id) {
		return userrepository.findById(id);
	}
	
	public void delete(Long id) {
		userrepository.deleteById(id);
	}

}
