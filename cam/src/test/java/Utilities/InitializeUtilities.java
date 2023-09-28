package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class InitializeUtilities {

	Properties pro;
	public InitializeUtilities(){
		File file=new File("D:\\javanew\\cam\\src\\test\\java\\Utilities\\configurationData.properties");
		try {
			FileInputStream fin = new FileInputStream(file);
			pro=new Properties();
			pro.load(fin);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
//Get Login details
	public String getIP() {
		return pro.getProperty("camera_ip");
	}
	public String getUsername() {
		return pro.getProperty("username");
	}
	public String getPassword() {
		return pro.getProperty("password");
	}
}
