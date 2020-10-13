package driver;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {
	public static void main(String[] args) throws IOException {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("www.google.com");
	}
}
