package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AbcTesting;
import com.example.demo.model.Greeting;

@RestController
public class GreetingController {

	@Autowired
	GreetingManager manager;
	
	@GetMapping("/greet/{name}")
	public Greeting greets(@PathVariable String name) {
		
		try {
			Greeting greeting = new Greeting();
			
			greeting = manager.helloWorld(name);
			
			return greeting;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Greeting();
		}
		
	}
	
	@GetMapping("greet/abc")
	public List<AbcTesting> getAbcTesting(){
		List<AbcTesting> listAbc = manager.testSql();
		return listAbc;
	}
	
}
