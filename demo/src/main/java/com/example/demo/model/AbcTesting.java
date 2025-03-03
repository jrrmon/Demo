package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ABC_TESTING")
public class AbcTesting {

	@Id
	private String id;
	private String name;
	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public AbcTesting(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public AbcTesting() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AbcTesting [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
