package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MedicalDao {
	@Autowired
	
	MedicalRepo mr;
	public String add(MedicalEntity me) {
		mr.save(me);
		return "Data Added";
		
	}
	public List<MedicalEntity> getdata() {
	
		return mr.findAll();
	}

}
