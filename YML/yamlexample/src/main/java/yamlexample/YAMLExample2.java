package yamlexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

//Yaml Examples: on how to read a yaml File 


public class YAMLExample2 {
	public static void main(String[] args) throws FileNotFoundException {

	Yaml yaml = new Yaml();
	String filePath="C:\\AI\\Workspace\\office\\ToolsLearning\\yamlexample\\src\\main\\resources\\child.yaml";
	Placeholder placeholder = null;
	
	placeholder=yaml.loadAs(new FileInputStream(new File(filePath)) , Placeholder.class);
	System.out.println(placeholder);
	}
}
