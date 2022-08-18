package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumWrapperFunctions {
	public static void SelectTextboxById(WebDriver driver, String id, String value) {
		WebElement element =  driver.findElement(By.id(id));
		element.sendKeys(value);
	}
	
	public static void SelectTextboxByName(WebDriver driver, String name, String value) {
		WebElement element =  driver.findElement(By.name(name));
		element.sendKeys(value);
	}
	
	public static void ClickOnButton(WebDriver driver, String className) {
		WebElement element = driver.findElement(By.className(className));
		element.click();
		
	}
}
