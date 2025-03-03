package com.example.demo.model;

/**
 * @author Jeremy
 *
 */
public class Greeting {

	private String greet;
	private String name;
	private String text;
	public String getGreet() {
		return greet;
	}
	public void setGreet(String greet) {
		this.greet = greet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Greeting(String greet, String name, String text) {
		super();
		this.greet = greet;
		this.name = name;
		this.text = text;
	}
	public Greeting() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Greeting [greet=" + greet + ", name=" + name + ", text=" + text + "]";
	}
	
	
	
	
	
}
