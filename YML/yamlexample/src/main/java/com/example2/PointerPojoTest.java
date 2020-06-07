package com.example2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.yaml.snakeyaml.Yaml;

import com.example1.Placeholder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class PointerPojoTest {

public static void main(String[] args) throws FileNotFoundException {
	Yaml yaml = new Yaml();
	String filePath="C:\\AI\\Workspace\\office\\ToolsLearning\\yamlexample\\src\\main\\resources\\pointer.yaml";
	
	PointerPojo pointerPojo = null;
	
	pointerPojo=yaml.loadAs(new FileInputStream(new File(filePath)) , PointerPojo.class);
	System.out.println(pointerPojo.getEmployee1().getName());
	System.out.println(pointerPojo.getEmployee1().getAge());
	System.out.println(pointerPojo.getEmployee1().getHobbies());
	System.out.println(pointerPojo.getEmployee1().getOfficial());
	
	System.out.println();
	
	System.out.println(pointerPojo.getEmployee2().getName());
	System.out.println(pointerPojo.getEmployee2().getAge());
	System.out.println(pointerPojo.getEmployee2().getHobbies());
	System.out.println(pointerPojo.getEmployee2().getOfficial());
	
	
}
}
