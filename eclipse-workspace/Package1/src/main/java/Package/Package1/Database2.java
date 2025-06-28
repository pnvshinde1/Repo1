package Package.Package1;


import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SeleniumDatabaseTesting {
public static final String USERNAME = "nehapramodvaidya";
public static final String AUTOMATE_KEY = Your_key";
public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
public static void main(String[] args) throws Exception {
DesiredCapabilities caps = new DesiredCapabilities();

caps.setCapability("os", "Windows");
caps.setCapability("os_version", "10");
caps.setCapability("browser", "Chrome");
caps.setCapability("browser_version", "80");

caps.setCapability("name", "nehapramodvaidya's First Test");}
// Connection object
static Connection con = null;
// Statement object
private static Statement stmt;
// Constant for Database URL
public static String DB_URL = "jdbc:mysql://localhost/onlinebanking";
//Database Username
public static String DB_USER = "Your_Database_Username";
// Database Password
public static String DB_PASSWORD = "Your_Database_Password";

@BeforeTest
public void setUp() throws Exception {
try{
// Database connection
String dbClass = "com.mysql.cj.jdbc.Driver";
Class.forName(dbClass).newInstance();
// Get connection to DB
Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
// Statement object to send the SQL statement to the Database
stmt = con.createStatement();
}
catch (Exception e)
{
e.printStackTrace();
}
}

@Test
public void test() {
try{
String query = "select * from user";
// Get the contents of userinfo table from DB
ResultSet res = stmt.executeQuery(query);
// Print the result untill all the records are printed
// res.next() returns true if there is any next record else returns false
while (res.next())
{
System.out.print(res.getString(1));
System.out.print(" " + res.getString(2));
System.out.print(" " + res.getString(3));
System.out.println(" " + res.getString(4));
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
