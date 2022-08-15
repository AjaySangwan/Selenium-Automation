import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.SeleniumWrapperFunctions;


public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16132\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait - 5seconds time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");

		SeleniumWrapperFunctions.SelectTextboxById(driver, "email", "ajaysangwan122@gmail.com");
		SeleniumWrapperFunctions.SelectTextboxByName(driver, "pass", "Link@20/97");
		SeleniumWrapperFunctions.ClickOnButton(driver, "_42ft");
		
		
		
		
	}

}
