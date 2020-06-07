package yamlexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

//Yaml Examples: using json databind 

public class YAMLExample4 {
	public static void main(String[] args) throws IOException {

		ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
		User user = null;
		
		String filePath="C:\\AI\\Workspace\\office\\ToolsLearning\\yamlexample\\src\\main\\resources\\read_user.yaml";
		File file = new File(filePath);
		user = objectMapper.readValue(file, User.class);
		
		System.out.println(user.getName());
		System.out.println(user.getRoles());
		System.out.println(user.getAddress());
	}

}
