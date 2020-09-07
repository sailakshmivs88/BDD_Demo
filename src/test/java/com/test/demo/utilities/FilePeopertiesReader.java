package com.test.demo.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FilePeopertiesReader {
public static String propReader(String key)  {
	

	Properties prop=new Properties();
	File f=new File("C://Users//Sai//eclipse-workspace//BDD_Automation//src//test//resources//TestData//Browser-config.properties");
	FileInputStream fr;
	try {
		fr = new FileInputStream(f);
	
		prop.load(fr);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return prop.get(key).toString();
}
}
