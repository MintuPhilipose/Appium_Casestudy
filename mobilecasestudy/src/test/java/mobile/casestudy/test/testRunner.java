package mobile.casestudy.test;
import org.testng.annotations.Test;



import mobile.casestudy.capability.*;
import mobile.casestudy.pom.*;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;

import org.testng.Assert;


import java.net.MalformedURLException;

import java.util.List;

import java.util.concurrent.TimeUnit;



import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;



public class testRunner extends capability{

	

	public static AndroidDriver <AndroidElement> driver=null;

	public static khanacademy_webstartup Khan_Webpg=null;
	public static khanacademy_course Khan_course=null;
	public static khanacademy_lang Khan_lang=null;
	

	@BeforeMethod

	public void beforeTest() throws MalformedURLException {

		

		System.out.println("*****************  In BeforeTest *************");

		driver=capability(deviceName,platformname,app_pkg,app_activity,chromedriver_exe);		

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        
		Khan_Webpg= new khanacademy_webstartup(driver);
		Khan_course= new khanacademy_course(driver);
		Khan_lang= new khanacademy_lang(driver);
	}

	

  @Test(enabled=false)

  public void TC01_Login() throws InterruptedException {

	  Thread.sleep(1000);
	  
	  if(Khan_Webpg.getCovid_msg_dismiss_lnk().isEnabled())
		  
	  { System.out.println("Sign");
	  
	  Khan_Webpg.getCovid_msg_dismiss_lnk().click();
	  Thread.sleep(200);
	  Khan_Webpg.getCovid_msg_dismiss_lnk().click();
	  }
	  

		  
	 Khan_Webpg.getSignIn_btn().click();
	  
	  System.out.println("Sign In");
	 
	  Khan_Webpg.signin_lnk().click();
	  
	  Khan_Webpg.getContinueWithGoogle_btn().click();
	  
	  Thread.sleep(15000);
	  Khan_Webpg.getAddaccount().click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	}

  

  @Test(enabled=false)
  public void TC02_CourseSelection() throws InterruptedException {

	 Thread.sleep(1000);
	  
	  TC01_Login();
      Thread.sleep(15000);
    
	 Khan_course.geteditcourse_btn().click();
	

	  Thread.sleep(5000);
	  
	  Khan_course.getclassselection("Class 3").click();
	  Khan_course.getcourse_choosebtn().click();
	  
	  
	 
	}

  

  @Test(enabled=false)
  public void TC03_LanguageSelection() throws InterruptedException {

	 Thread.sleep(1000);
	  
	  TC01_Login();
      Thread.sleep(15000);
      Khan_lang.getselectlang_btn().click();
      Thread.sleep(2000);
      Khan_lang.getcurrentselection("English").click();
      Thread.sleep(200);
      Khan_lang.getcurrentselection("English").click();
      Thread.sleep(500);
      Khan_lang.getbackbtn().click();
      Thread.sleep(500);
	}

  @Test(enabled=true)//Negative Scenario Print ErrorMessage when Challenge Not Loading
  public void TC04_TakeChallenge() throws InterruptedException {

	 Thread.sleep(1000);
	  
	  TC01_Login();
      Thread.sleep(15000);
      Khan_course.choosecourse("Class 4").click();
      Khan_course.takechallenge_btn().click();
     // Khan_course.start_btn().click();
      Thread.sleep(1000);
      
      if(Khan_course.errormsg().isDisplayed())
      {
    	  String expected="We encountered an error while attempting to make progress in this task; please try again later.";
    	  assert Khan_course.errormsg().getText().toString().equalsIgnoreCase(expected);
    	  
      }
	}

  @Test(enabled=false)
  public void TC05_RunVideo() throws InterruptedException {

	 Thread.sleep(1000);
	  
	  TC01_Login();
      Thread.sleep(15000);
      Khan_course.choosecourse("Class 4").click();
      Khan_course.choosesubcourse("Addition and subtraction").click();
      Khan_course.playbtn().click();
      Khan_course.homebtn().click();
      
	}


  

  @AfterMethod

  public void afterTest() {

  

		System.out.println("*****************  In AfterTest *************");

  }



}
