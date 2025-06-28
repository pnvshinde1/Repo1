package src.test.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Simple {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize(); 

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(10);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//*[@class='oxd-main-menu']//li//span[text()='Recruitment']")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='oxd-select-wrapper']//div)[1]")));

		//WebElement e1 = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//div)[1]"));

		Select t = new Select(driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//div)[1]")));

		t.selectByVisibleText("Account Assistant");

	}

}
