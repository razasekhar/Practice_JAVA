package Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_Class {
	@Test
	

	public static void main(String[] args) {
		
		try {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.gmail.com");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.quit();
	
	}catch(Throwable e) {
		System.out.println(e.getMessage());
	}
		

	}
}

