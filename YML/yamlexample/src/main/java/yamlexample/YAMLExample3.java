package yamlexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

//Yaml Examples: on how to write a yaml File 


public class YAMLExample3 {
	public static void main(String[] args) throws IOException {

		Student student = createStudent();
		String filePath="C:\\AI\\Workspace\\office\\ToolsLearning\\yamlexample\\src\\main\\resources\\student.yaml";
		Yaml yaml = new Yaml();
		yaml.dump(student,new FileWriter(new File(filePath)));
		System.out.println("We are done!!!");
	}

	private static Student createStudent() {
		Student student = new Student();
		student.setLearn("Learning Astronomy");
		student.setAge(20);
		student.setInnovation("Yes The do");
		student.setSmile("Yes till they are student");
		student.setBestCreature(true);
		return student;
	}
}
