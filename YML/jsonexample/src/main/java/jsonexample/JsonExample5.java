package jsonexample;

/*
 *  Shows Json validation with schema
 */

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Test;

public class JsonExample5 {
	public static void main(String[] args) {
		
	}
	

    @Test
    public void givenInvalidInput_whenValidating_thenInvalid() {

   
        JSONObject jsonSchema = new JSONObject(new JSONTokener(JsonExample5.class.getResourceAsStream("/schema.json")));
        JSONObject jsonSubject = new JSONObject(new JSONTokener(JsonExample5.class.getResourceAsStream("/productValidation.json")));
        
        Schema schema = SchemaLoader.load(jsonSchema);
        schema.validate(jsonSubject);
    }

    @Test
    public void givenValidInput_whenValidating_thenValid() {

    	JSONObject jsonSchema = new JSONObject(new JSONTokener(JsonExample5.class.getResourceAsStream("/schema.json")));
        JSONObject jsonSubject = new JSONObject(new JSONTokener(JsonExample5.class.getResourceAsStream("/productInValid.json")));
        
        Schema schema = SchemaLoader.load(jsonSchema);
        schema.validate(jsonSubject);
    }

}
