package Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_Class {
	@Test

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.quit();
	}

}
