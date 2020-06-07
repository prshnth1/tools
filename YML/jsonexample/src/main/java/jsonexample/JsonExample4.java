package jsonexample;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 *  Parsing JSON file	
 */

public class JsonExample4 {
public static void main(String[] args) {

	JSONParser jsonParser = new JSONParser();
	
	FileReader  reader = null;
	    try {
	    	reader  = new FileReader("employees.json");
	    	
	    	//Read JSON file
	    	Object obj=jsonParser.parse(reader);
	    	JSONArray employeeList =(JSONArray) obj;
	    	System.out.println(employeeList);
	    	
	    	
	    	//Iterate over employee array
	    	employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
	    	
	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

private static void parseEmployeeObject(JSONObject employee) 
{
    //Get employee object within list
    JSONObject employeeObject = (JSONObject) employee.get("employee");
     
    //Get employee first name
    String firstName = (String) employeeObject.get("First Name");    
    System.out.println(firstName);
     
    //Get employee last name
    String lastName = (String) employeeObject.get("Last Name");  
    System.out.println(lastName);
     
    //Get employee website name
    String website = (String) employeeObject.get("Department");    
    System.out.println(website);
}
}
