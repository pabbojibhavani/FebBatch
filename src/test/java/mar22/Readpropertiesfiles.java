package mar22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readpropertiesfiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties obj = new Properties();
		FileInputStream obj2 = new FileInputStream("D:\\Eclipse\\workspace\\FebBatch\\src\\main\\resources\\config.properties");
		
		obj.load(obj2);
		
		String username = obj.getProperty("username");
		String password = obj.getProperty("password");
		
		System.out.println(username);
		System.out.println(password);

	}

}
