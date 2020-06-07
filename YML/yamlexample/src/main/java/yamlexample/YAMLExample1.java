package yamlexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

//Yaml Examples:
public class YAMLExample1 {
	public static void main(String[] args) throws FileNotFoundException {
		
		//To convert a String to Map
		stringToMap();
		
		//Covnerting multiple string line to HashMap
		multipleStringLinesToMap();

		//yml File to Map		
		yamlFileToMap();
		
		
	}

	private static void yamlFileToMap() throws FileNotFoundException {
		Yaml yaml =new Yaml();
		Map<String, String> map = yaml.load(new FileInputStream(new File("C:\\AI\\Workspace\\office\\ToolsLearning\\yamlexample\\src\\main\\resources\\basic.yaml")));
		System.out.println(map.get("name"));
		System.out.println(map);
	}

	//Covnerting multiple string line to HashMap
	private static void multipleStringLinesToMap() {
		//Read String as Object
		
		String str ="name: Joe\n"+"phone: 111-111-1111\n"+"address: Park Dr, Charlie Hill";
		Yaml yaml = new Yaml();
		Object object = yaml.load(str);
		
		//Object type as LinkedHashMap
		System.out.println("Object Type: "+object.getClass());

		Map<String, String> map = (Map<String, String>)object;
		System.out.println("Name: "+map.get("name"));
	}

	/*
	 * To convert a String to Map 
	 * Note the must and should be "Hello: 25" 
	 * else it will give error 
	 */
	private static void stringToMap() {
		Yaml yaml = new Yaml();
		String str ="Hello: 25";
		
		Map<String, Integer> map =yaml.load(str);
		Integer value = map.get("Hello");
		System.out.println(value);
	}
}
