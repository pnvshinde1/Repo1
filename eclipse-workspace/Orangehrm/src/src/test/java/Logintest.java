package src.test.java;

import org.openqa.selenium.WebDriver;

import src.main.java.Baseclass;
import src.main.java.Loginpage;

public class Logintest extends Baseclass {

	public static void main(String args[]) {

		Logintest l3 = new Logintest();

		l3.setup();

		WebDriver driver = null;
		Loginpage l1 = new Loginpage(driver);

		l1.logincheck();

	}

}
