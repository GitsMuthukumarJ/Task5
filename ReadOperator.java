//create separate package PropertiesFile
package PropertiesFile;

import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

//create class ReadOperator
public class ReadOperator {
//main method
	public static void main(String[] args) {
//create new object Properties
		        Properties prop = new Properties();
		 //using try block for InputStream
		        try (InputStream input = new FileInputStream("config.properties")) {
		 
		           
		            prop.load(input);
		 
		          
		            System.out.println("Database - " + prop.getProperty("database"));
		            System.out.println("Username - " + prop.getProperty("Username"));
		            System.out.println("Password - " + prop.getProperty("password"));
		 
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		    }

	}
