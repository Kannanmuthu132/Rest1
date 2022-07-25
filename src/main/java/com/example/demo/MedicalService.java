package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalService {
	@Autowired
	
	MedicalDao md;
	public String add(MedicalEntity me) {
		return md.add(me);
	}
	public List<MedicalEntity> getdata() {
		return md.getdata();
	}

}
