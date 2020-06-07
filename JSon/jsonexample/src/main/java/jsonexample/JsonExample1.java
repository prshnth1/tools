package jsonexample;


/*
 * This example shows about JSON Data Types
 * */
import org.json.simple.JSONObject;

public class JsonExample1 {
public static void main(String[] args) {
	JSONObject employee1Detail = new JSONObject();
	employee1Detail.put("age", 28);
	employee1Detail.put("Employee Name", "Employee1");
	employee1Detail.put("Current Employee", true);
	employee1Detail.put("Future Employer",null);
	
	
	System.out.println("Result");
	System.out.println(employee1Detail);
}
}
