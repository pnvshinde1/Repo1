package src.main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Recruitmentpage {
	
	
public WebDriver driver;
	
	Recruitmentpage(WebDriver driver){
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);

}
}