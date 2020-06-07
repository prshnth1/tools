package com.example1;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import yamlexample.User;

public class TestYaml {
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

	ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
	Placeholder placeholder = null;
	
	String filePath="C:\\AI\\Workspace\\office\\ToolsLearning\\yamlexample\\src\\main\\resources\\person.yaml";
	File file = new File(filePath);
	placeholder = objectMapper.readValue(file, Placeholder.class);
	
	System.out.println(placeholder.getPerson().getFirstname());
	System.out.println(placeholder.getPerson().getLastname());
	System.out.println(placeholder.getPerson().getRating());	
	System.out.println(placeholder.getPerson().getMarks());
	System.out.println(placeholder.getPerson().getBirthday());
	System.out.println(placeholder.getPerson().getFavnum());
	System.out.println(placeholder.getPerson().isMale());
	System.out.println(placeholder.getPerson().getAge());
	System.out.println(placeholder.getPerson().getHobbies());
	System.out.println(placeholder.getPerson().getMovies());
	System.out.println(placeholder.getPerson().getFriends());
	System.out.println(placeholder.getPerson().getSummary());
	System.out.println(placeholder.getPerson().getSignature());

}
}
