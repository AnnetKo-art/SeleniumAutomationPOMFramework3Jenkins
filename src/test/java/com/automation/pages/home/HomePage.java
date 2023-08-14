package com.automation.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.pages.base.BasePage;
//pages keep only webElements and functionalities
public class HomePage extends BasePage{
	
	@FindBy(xpath ="//h1[text()='Student Registration Form']") WebElement studentRegistration;

	public HomePage(WebDriver driver) {
		super(driver);
		//PageFactory.initElements(driver,this);// this - is the current page.
		// here we initializing,decloration elements with annotations using this function.
	}
	
	public String getTextFromStudentRegistrationFormText() {
		//return studentRegistration.getText(); // selenium basic command
				
		return getTextFromWebElement(studentRegistration, "stu regi form text");
	}

}
