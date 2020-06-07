
package com.example1;

import java.util.List;

public class Person {
	
	private String firstname;
	
	private String lastname;

	private String rating;
	
	private double marks;
	
	private String birthday;
	
	private boolean male;
	
	private double favnum;
	
	private int age=0;
	
	private List<String> hobbies = null;
	
	private List<String> movies = null;
	
	private List<Friend> friends = null;
	
	private String summary =null;
	
	private String signature = null;
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public double getFavnum() {
		return favnum;
	}

	public void setFavnum(double favnum) {
		this.favnum = favnum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public List<String> getMovies() {
		return movies;
	}

	public void setMovies(List<String> movies) {
		this.movies = movies;
	}

	public List<Friend> getFriends() {
		return friends;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
	
}