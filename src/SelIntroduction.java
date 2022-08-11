import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver ->Methods
		//Firefox
		//WebDriver methods + class methods
		
		//chromedriver.exe -> chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16132\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// webdriver.chrome.driver -> value of path
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/AjaySangwan/Selenium-Automation");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	//  driver.quit();

	}

}
