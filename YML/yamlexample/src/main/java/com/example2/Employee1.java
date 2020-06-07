package com.example2;

import java.util.List;

public class Employee1 {

	private String name;
	
	private int age;
	
	private String official;
	
	private List<String> hobbies = null;
	
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
	
	public String getOfficial() {
		return official;
	}
	
	public void setOfficial(String official) {
		this.official = official;
	}
	
	public List<String> getHobbies() {
		return hobbies;
	}
	
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	
}
