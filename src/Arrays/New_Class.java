package Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class New_Class {
	@FindBy WebElement actions;
	public static void main(String[] args) {
		
		By signIn = By.xpath("//*[contains(text(),'Sign in')]");
		By userName = By.id("identifierId");
		By next = By.xpath("//*[contains(text(),'Next')]");
		By Password = By.xpath("//input[@type='password']");
		try {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.gmail.com");
		driver.findElement(signIn).click();
		WebElement username = driver.findElement(userName);
		WebElement password = driver.findElement(Password);
		username.sendKeys("rajasekharareddy1995");
		driver.findElement(next).click();
		password.sendKeys("9949991173");
		driver.findElement(next).click();
		driver.quit();
	
	}catch(Throwable e) {
		System.out.println(e.getMessage());
	}
		

	}
}

