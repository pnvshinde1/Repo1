package src.main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Properties {


	public Loginpage login;
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "pasword")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement logintab;
	
	WebDriver driver;

	public Loginpage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void logincheck() {

		username.sendKeys(s1);

		password.sendKeys(s2);

		logintab.click();

	}

}
//POM  Webelements find out & declare methods of functionalities 

