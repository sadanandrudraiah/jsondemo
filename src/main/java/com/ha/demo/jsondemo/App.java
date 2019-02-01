package com.ha.demo.jsondemo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //convertObjToJSON();
        convertJSONToObj();
    }
    
    
    private static void convertJSONToObj()
    {
		ObjectMapper mapper = new ObjectMapper();
		

		try {

			// Convert JSON string from file to Object
			Staff staff = mapper.readValue(new File("staff.json"), Staff.class);
			System.out.println(staff);

			// Convert JSON string to Object
			String jsonInString = "{\"name\":\"Balaji\",\"age\":22,\"position\":\"Manager\"}";
			Staff staff1 = mapper.readValue(jsonInString, Staff.class);
			System.out.println(staff1);

			//Pretty print
			String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff1);
			System.out.println(prettyStaff1);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    private static void convertObjToJSON()
    {
    	ObjectMapper mapper = new ObjectMapper();
    	Staff staff = new Staff("Sada", 11, "Developer");
    	
		try {
			// Convert object to JSON string and save into a file directly
			mapper.writeValue(new File("staff.json"), staff);

			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(staff);
			System.out.println(jsonInString);

			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
			System.out.println(jsonInString);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}    	

    	
    }
}
