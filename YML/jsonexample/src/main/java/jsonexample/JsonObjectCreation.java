package jsonexample;

import org.json.simple.JSONObject;

public class JsonObjectCreation {
public static void main(String[] args) {
	 JSONObject obj = new JSONObject();

     obj.put("name", "foo");
     obj.put("num", new Integer(100));
     obj.put("balance", new Double(1000.21));
     obj.put("is_vip", new Boolean(true));

     System.out.println(obj);
     
     JSONObject employee = new JSONObject();
     employee.put("Employee Name", 1);
     
     System.out.println(employee);
}
}

