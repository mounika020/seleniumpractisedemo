package seleniumpractisedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testsample {
@Test
public static void startbrowser(){
	System.setProperty("webdriver.chrome.driver", "./Lib/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}
}
