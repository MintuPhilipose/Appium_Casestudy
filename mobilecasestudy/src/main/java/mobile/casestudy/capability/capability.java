package mobile.casestudy.capability;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import mobile.case_study.dao.*;


public class capability {
	
	protected static String deviceName;
	protected static String platformname;
	protected static String app_pkg;
	protected static String app_activity;
	protected static String chromedriver_exe;
	
	
	public static AndroidDriver<AndroidElement>capability(String deviceName,String platformname,String app_pkg,String app_activity,String chromedriver_exe) throws MalformedURLException
	
	{
		case_studyDAO dao= new case_studyDAO();
		
		deviceName=dao.properties.getProperty("DeviceName");
		platformname=dao.properties.getProperty("platformname");
		app_pkg=dao.properties.getProperty("App_Pkg");
		app_activity=dao.properties.getProperty("App_Activity");
		chromedriver_exe=dao.properties.getProperty("Chromedriver_Path");
		
		System.out.println(deviceName+","+platformname+","+app_pkg+","+app_activity+","+chromedriver_exe);
		
		
		//To Connect Grid
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platformname);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, app_pkg);
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, app_activity);
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, chromedriver_exe);
		
		AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL ("http://127.0.0.1:4723/wd/hub"),cap);
	    return driver;
	
	}
	
	

}
