package WEEK2ASSIGNMENTS;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FACEBOOKLOGIN {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("email")).sendKeys("jameel@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("jackey45");
		driver.findElement(By.name("login")).click();
	
		



	}

}
