package mobile.case_study.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class case_studyDAO {

public Properties properties; 
	
	public case_studyDAO() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream(System.getProperty("user.dir")+"\\resources\\mobilecasestudy\\resources\\global.properties");
			System.out.println(System.getProperty("user.dir"));
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	
}
