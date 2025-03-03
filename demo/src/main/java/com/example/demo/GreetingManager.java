package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AbcTesting;
import com.example.demo.model.Greeting;
import com.example.demo.repository.AbcTestingRepository;

@Service
public class GreetingManager {

	@Autowired
	AbcTestingRepository rp;
	
	public Greeting helloWorld(String name) {
		
		String greets = "Hello, ";
		
//		String[] list = greets.split(", ");
		
		String sentence = "Welcome to Spring Boot!";
		
		return new Greeting(greets, name, sentence);
		
	}
	
	public List<AbcTesting> testSql() {
		
		List<AbcTesting> listAbc = rp.getAbcTesting();
		return listAbc;
	}
	
}
