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

public class khanacademy_webstartup {

	public static AndroidDriver <AndroidElement> driver=null;

	

	public khanacademy_webstartup(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	//@FindBy(xpath="//android.widget.Button[@content-desc=\"Dismiss\"]/android.widget.TextView")
	//private WebElement covid_msg_dismiss_lnk;
	
	@FindBy(xpath="//*[text()='Dismiss']")
	private WebElement covid_msg_dismiss_lnk;
	
	@FindBy(xpath="//*[@class='android.widget.Button']")
	private WebElement SignIn_btn;
	
	@FindBy(xpath="//*android.view.ViewGroup[@content-desc=\"Continue with Google\"]/android.view.ViewGroup")
	private WebElement ContinueWithGoogle_btn;
	
	@FindBy(id="com.google.android.gms:id/account_name")
	private WebElement addaccount;
	
	@FindBy(xpath="//*[@class='android.view.View']")
	private WebElement emailid_txt;
	
	@FindBy(xpath="//[text()='Next']")
	private WebElement Nxt_btn;



	public WebElement getAddaccount() {
		return addaccount;
	}

	public WebElement signin_lnk() {
		return driver.findElementByAndroidUIAutomator("text(\"Sign in\")");
	}
	public WebElement getCovid_msg_dismiss_lnk() {
		return driver.findElementByAndroidUIAutomator("text(\"Dismiss\")");
	}

	public WebElement getSignIn_btn() {
		return SignIn_btn;
	}

	public WebElement getContinueWithGoogle_btn() {
		return driver.findElementByAndroidUIAutomator("text(\"Continue with Google\")");
	}

	public WebElement getEmailid_txt() {
		
		List<AndroidElement> list= driver.findElements(MobileBy.id("view_container"));
		System.out.println(list.get(0).getText());
		
		return list.get(0);
	}

	public WebElement getNxt_btn() {
		return Nxt_btn;
	}
	
	
	
	
	
}
