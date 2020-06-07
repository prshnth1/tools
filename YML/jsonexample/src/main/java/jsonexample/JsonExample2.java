package jsonexample;


import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
/*
 * This example shows how to create JSON Array
 * */
import org.json.simple.JSONObject;

public class JsonExample2 {
public static void main(String[] args) {
	
	//first Employee
	JSONObject employee1Detail = new JSONObject();
	employee1Detail.put("First Name", "FirstName1");
	employee1Detail.put("Last Name", "LastName1");
	employee1Detail.put("Department", "Dept1");
	
	JSONObject employee1Object = new JSONObject();
	employee1Object.put("employee", employee1Detail);
	
	
	

	//Second  Employee
	JSONObject employee2Detail = new JSONObject();
	employee2Detail.put("First Name", "FirstName2");
	employee2Detail.put("Last Name", "LastName2");
	employee2Detail.put("Department", "Dept2");
	
	JSONObject employee2Object = new JSONObject();
	employee2Object.put("employee", employee2Detail);
	
	
	JSONArray employeeList = new JSONArray();
	employeeList.add(employee1Object);
	employeeList.add(employee2Object);
	
	System.out.println(employeeList);
	
	//Write JSON file
	FileWriter file = null;
    try {
    	file = new FileWriter("employees.json");
        file.write(employeeList.toJSONString());
        file.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
