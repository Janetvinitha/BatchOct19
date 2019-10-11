package myApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basepage {

	public static WebDriver driver;
	public String browser = "chrome";

	public Basepage() {
		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				driver = new ChromeDriver();

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");

		}
	}

	public String getTile1() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
}



//label[@for='layered_id_attribute_group_1']//
//label[@for='layered_id_attribute_group_2']//
//label[@for='layered_id_attribute_group_3']//