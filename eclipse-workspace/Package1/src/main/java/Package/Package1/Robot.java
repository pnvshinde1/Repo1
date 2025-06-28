package Package.Package1;
    import org.openqa.selenium.*;

	import org.openqa.selenium.chrome.ChromeDriver;

	import java.awt.*;
    import java.awt.datatransfer.StringSelection;
    import java.awt.event.*;

	import java.io.File;




	public class Robot {

	public static void main(String[] args) throws AWTException, InterruptedException {




	// Set up the WebDriver and navigate to the page

	System.setProperty("webdriver.chrome.driver","path/to/chromedriver");

	WebDriver driver = new ChromeDriver();

	driver.get("http://example.com/upload");  // URL of the page with file upload button




	// Find the "Choose File" button and click it using Selenium

	WebElement uploadButton = driver.findElement(By.id("file-upload"));

	uploadButton.click();




	// Wait for the file upload dialog to appear

	Thread.sleep(2000);  // Wait a couple of seconds for the file dialog to open




	// Create a Robot instance to handle the file upload dialog

	Robot robot = new Robot();




	// Simulate keyboard events to type the file path

	String filePath = "C:\\path\\to\\your\\file.txt";  // Replace with your file path

	StringSelection stringSelection = new StringSelection(filePath);

	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);




	//Simulate pressing Ctrl + V to paste the file path

	robot.keyPress(KeyEvent.VK_CONTROL);

	robot.keyPress(KeyEvent.VK_V);

	robot.keyRelease(KeyEvent.VK_V);

	robot.keyRelease(KeyEvent.VK_CONTROL);




	// Press Enter to select the file

	robot.keyPress(KeyEvent.VK_ENTER);

	robot.keyRelease(KeyEvent.VK_ENTER);




	// Optionally, wait for the file to upload

	Thread.sleep(3000);




	// Close the browser

	driver.quit();

	}

	}
	
	
	
	
	
	
	
