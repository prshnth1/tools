package com.luv2code.springboot.demo.mycoolapp.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AddressBookResources {

	ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap();
	
	@GetMapping("/{id}")
	public Contact getContact(@PathVariable String id) {
		return contacts.get(id);
	}
	
	@GetMapping("/")
	public List<Contact> getAllContacts(){
		return new ArrayList<Contact>(contacts.values());
	}
	
	@PostMapping("/")
	public Contact addContact(@RequestBody Contact contact) {
		contacts.put(contact.getId(), contact);
		return contact;
	}
	
	@PutMapping("/")
	public Contact modifyContact(@RequestBody Contact contact) {
		contacts.put(contact.getId(), contact);
		return contact;
	}
	
	@DeleteMapping("/{id}")
	public String delContactContact(@PathVariable String id) {
		contacts.remove(id);
		return "Contact with the id "+id+" removed from db";
	}
}
