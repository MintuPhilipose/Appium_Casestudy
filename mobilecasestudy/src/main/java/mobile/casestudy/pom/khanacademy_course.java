package mobile.casestudy.pom;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class khanacademy_course {

	public static AndroidDriver <AndroidElement> driver=null;

	

	public khanacademy_course(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	
	
	
	
	
	public  WebElement takechallenge_btn() {
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(textMatches(\"Take Course Challenge\").instance(0))")); 
	return	 driver.findElement(MobileBy.xpath("//*[@text='Take Course Challenge' and @class='android.widget.TextView']"));
		
	}


	public  WebElement start_btn() {
		 
	return	driver.findElement(MobileBy.xpath("//*[contains(@text,'go')]"));
		
	}

	

	public  WebElement geteditcourse_btn() {
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(textMatches(\"Edit\").instance(0))")); 
	return	 driver.findElement(MobileBy.xpath("//*[@text='Edit' and @class='android.widget.TextView']"));
		
	}

	public WebElement getclassselection(String classname) {
		return  driver.findElement(MobileBy.xpath("//*[contains(@text,'"+classname+"') and @class='android.widget.TextView']"));
	}

	public WebElement choosecourse(String classname) {
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(textContains(\""+classname+"\").instance(0))")); 
		return  driver.findElement(MobileBy.xpath("//*[contains(@text,'"+classname+"') and @class='android.widget.TextView']"));
	}
	
	public WebElement choosesubcourse(String coursename) {
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(textContains(\""+coursename+"\").instance(0))")); 
		return  driver.findElement(MobileBy.xpath("//*[contains(@text,'"+coursename+"') and @class='android.widget.TextView']"));
	}
	
	public AndroidElement playbtn() {
		List<AndroidElement> l1 =driver.findElements(MobileBy.xpath("//*[@class='android.widget.ImageView']"));
		return  l1.get(1);
	}

	
	public WebElement homebtn() {
		return driver.findElement(MobileBy.xpath("//*[@resource-id='org.khanacademy.android:id/tab_bar_button_home']"));
	}
	
	public WebElement errormsg() {
		return driver.findElement(MobileBy.xpath("//*[@resource-id='android:id/message']"));
	}
	

	public WebElement getcourse_choosebtn() {
		return driver.findElement(MobileBy.xpath("//*[contains(@text,'Done') and @class='android.widget.TextView']"));
	}

	
	
	
	
	
	
}
