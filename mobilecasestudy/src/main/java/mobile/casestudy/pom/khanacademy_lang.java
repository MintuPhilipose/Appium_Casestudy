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

public class khanacademy_lang {

	public static AndroidDriver <AndroidElement> driver=null;

	

	public khanacademy_lang(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	
	
	

	

	public  WebElement getselectlang_btn() {
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(textMatches(\"Select language\").instance(0))")); 
	return	 driver.findElement(MobileBy.xpath("//*[@text='Select language' and @class='android.widget.TextView']"));
		
	}

	public WebElement getcurrentselection(String region) {
		return  driver.findElement(MobileBy.xpath("//*[contains(@text,'"+region+"') and @class='android.widget.TextView']"));
	}

	public WebElement setnewselection(String region) {
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.TextView\")).scrollIntoView(textMatches(\""+region+"\").instance(0))")); 
		
		return  driver.findElement(MobileBy.xpath("//*[contains(@text,'"+region+"') and @resource-id='org.khanacademy.android:id/radio_button_label']"));
	}

	public WebElement getbackbtn() {
		return driver.findElement(MobileBy.xpath("//*[@class='android.widget.ImageButton']"));
	}

	
	
	
	
	
	
}
