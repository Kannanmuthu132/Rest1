package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicalController {
	@Autowired
	
	MedicalService ms;
	
	@PostMapping (value = "/addInfo")
	public String add(@RequestBody MedicalEntity me) {
		return ms.add(me);
	}
	@GetMapping (value="/readinfo")
	public List<MedicalEntity> getdata() {
		return ms.getdata();
	}

}
