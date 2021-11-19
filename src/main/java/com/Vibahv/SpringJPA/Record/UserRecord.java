package com.Vibahv.SpringJPA.Record;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRecord {
	@Id
	long id;
	String Name;
	public long getId() {
		return id;
	}
	public UserRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserRecord [id=" + id + ", Name=" + Name + "]";
	}
	public UserRecord(long id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	

}
