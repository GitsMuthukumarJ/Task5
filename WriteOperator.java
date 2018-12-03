//create separate package PropertiesFile
package PropertiesFile;

import java.util.Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//create class WriteOperator
public class WriteOperator {

	//main method
	public static void main(String[] args) {
		
		        try (OutputStream output = new FileOutputStream("config.properties")) {
		 
		            Properties prop = new Properties();
		            
		            //set property values
		            prop.setProperty("database", "localhost");
		            prop.setProperty("username", "Codingeek");
		            prop.setProperty("password", "Codingeek");
		 
		            prop.store(output, null);
		 
		            //using catch block
		        } catch (IOException exception) {
		            exception.printStackTrace();
		        } 
	}
		    }
