package com.automation.tests;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.home.HomePage;
import com.automation.pages.login.LoginPage;
import com.automation.utility.PropertiesUtility;

import io.github.bonigarcia.wdm.WebDriverManager;
//Validation and reading the property data should be in AutomationScript.
public class AutomationScripts extends BaseTest{

	@Test
	public void login_to_firebase_testscript() throws InterruptedException {
		log.info("inside the login_to_firebase_testscript test method");		
		PropertiesUtility pro=new PropertiesUtility();
		Properties appProp= pro.loadFile("applicationDataProperties");
	
		String userId=appProp.getProperty("login.valid.userid");
		String password=appProp.getProperty("login.valid.password");
		
		String expectedTitle = "Selenium";
		
		//Validation part
		LoginPage loginpage=new LoginPage(driver);
		String actualTitle= loginpage.getTitleOfThePAge();
		Assert.assertEquals(actualTitle, expectedTitle);
		loginpage.enterUsername(userId);
		loginpage.enterPassword(password);
		driver= loginpage.clickButton();
		
		String expectedText="Student Registration Form";
		HomePage homepage=new HomePage(driver);
		String actualText=homepage.getTextFromStudentRegistrationFormText();
		
		
		
		
		Assert.assertEquals(actualText, expectedText);
		//String actualTitle= loginpage.getTitleOfThePAge();
				//String actualTitle=getPageTitle();
		//loginpage.enterUsername(userId);
		//loginpage.enterPassword(password);
		//driver= loginpage.clickButton();
		
		//String expectedText="Student Registration Form";
		//HomePage homepage=new HomePage(driver);
		//String actualText= homepage.getTextFromStudentRegistrationFormText();
		
		
		//Assert.assertEquals(actualText, expectedText);
		
		
		
		
		
		
	
	}
	
	

}
