package Package.Package1;

import java.awt.Window;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.chrome.ChromeDriver;


public class Testalberta {

	
	public static void main(String args[]) { 
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Morya\\eclipse\\msedgedriver.exe");
	
	//ChromeOptions options= new ChromeOptions();
	
	//options.addArguments("remote-allow-origins=*");
	
     EdgeOptions options= new EdgeOptions();
	
	options.addArguments("--remote-allow-origins=*");
	options.addArguments("--start-maximized");
	
	
	WebDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize(); 

	driver.get("https://www.google.com");
	
	
	
	
	boolean w1= driver.findElement(By.xpath("//label[text()='Item']")).isSelected();  // checkbox, radio button
	
	WebElement s1= driver.findElement(By.className("fhgjfkhgjfkghjfh")).sendKeys("20.25");  // Enterbox
	
	
	Select s2 = new Select(s1);
	
	
	s2.selectByIndex(0);
	s2.selectByValue("ITEMS");
	
	s2.selectByVisibleText("ITEM GROUP");   // dropdown
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));   // implicitly wait 
	
	WebDriverWait wait= new WebDriverWait(driver, 5);
	
	WebElement e1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("56")));   // explicitly wait 
	
	
	//Actions a8= new Actions(driver.findElement(By.id("58")));
	
	//a8.contextClick().build().perform();  // right click 
	
	
	
	
	WebElement source = driver.findElement(By.className("fljghfjh"));
	
	WebElement target= driver.findElement(By.id("23"));
	
	//a8.clickAndHold().moveToElement(target).build().perform();
	
	//a8.moveToElement(target);
	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 
	// js.executeAsyncScript(Window.BOTTOM_ALIGNMENT args);
	 
	 
	 
	 WebElement slider = driver.findElement(By.className("fljghfjh"));
	 
	 
	 driver.getWindowHandle();   // Single window handle 
	 
	 driver.getWindowHandles();   // Multiple window handles 
	 
	 driver.switchTo().alert().accept();
	 
	 driver.switchTo().alert().dismiss();   // For handling the pop ups error message 
	 
	 driver.switchTo().frame(4);
	 
	 driver.switchTo().defaultContent();    // To handle iframes 
	 
	 driver.findElement(By.id("FDfdf"));
	 
	 
	 
	 
	 
	 
	 public void takesscreenshot() {
	 File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 
	 
	 
	 
	 
	 
	 FileUtils.copyFile(src,"C:\\Users\\Morya\\Pictures\\Screenshots.png");    // screenshot capture
	 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
	//a8.moveToElement(slider).dragAndDrop(slider, 200).build().perform();
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	private static void ScreenshotAs(OutputType<File> file) {
		// TODO Auto-generated method stub
		
	}
}
