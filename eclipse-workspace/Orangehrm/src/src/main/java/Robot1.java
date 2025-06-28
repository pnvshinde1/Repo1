package src.main.java;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;



public class Robot1 {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Morya\\eclipse\\chromedriver-win64\\chromedriver.exe");
		     
		ChromeOptions option= new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		//option.setAcceptInsecureCerts(true);
		
		WebDriver driver= new ChromeDriver(option);
		
		
		driver.get("https://qa-automation-practice.netlify.app/file-upload.html");
		
		driver.manage().window().maximize();		
		
		Thread.sleep(50);
		
	    driver.findElement(By.name("filename")).click();
	    
	    
	    
	  //input[@class='upload']
	    
	    //Robot r= new Robot();
	  
	    
	    
	    
	  // robot.keyPress(KeyEvent.VK_DOWN);
	   
	   
//	   Actions act= new Actions(driver);
//	   act.keyDown(Keys.SHIFT);
//	   act.keyDown(Keys.TAB);
//	   act.keyDown(Keys.TAB);
//	   act.keyDown(Keys.TAB);
//	   act.keyDown(Keys.ENTER);
//	   
	  // act.sendKeys(Keys.ENTER).perform();
       //.sendKeys(passwordField, "password");
       //.keyUp(Keys.SHIFT)
       //.perform();

// Press ENTER to submit the form
//actions.sendKeys(Keys.ENTER).perform();
	   
	   
	    
	   
	    
	    
	   // keyPress(int keycode): Simulates a key press of the specified keycode.
//	    keyRelease(int keycode): Simulates a key release of the specified keycode.
//	    keyPress(KeyEvent.VK_SHIFT): Simulates a key press of the Shift key.
//	    keyRelease(KeyEvent.VK_SHIFT): Simulates a key release of the Shift key.
//	    keyPress(KeyEvent.VK_CONTROL): Simulates a key press of the Ctrl key.
	   // keyRelease(KeyEvent.VK_CONTROL): Simulates a key release of the Ctrl key.
	    
	    
//	    Robot r = new Robot();
//
//        r.keyPress(KeyEvent.VK_SHIFT);
//        r.keyPress(KeyEvent.VK_F10);
//        r.keyRelease(KeyEvent.VK_F10);
//        r.keyRelease(KeyEvent.VK_SHIFT);
//
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
//
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);
//        // ABOVE ENTER WORKS FINE! THEN A NEW WINDOW IS OPENED
//
//        // HERE IT STOPS WORKING!
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);
//
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);
//
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);
//
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}

}
