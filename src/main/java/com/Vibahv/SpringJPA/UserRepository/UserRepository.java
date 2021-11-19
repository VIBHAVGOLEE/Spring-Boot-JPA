package com.Vibahv.SpringJPA.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vibahv.SpringJPA.Record.UserRecord;

public interface UserRepository extends JpaRepository<UserRecord, Long> {

}
