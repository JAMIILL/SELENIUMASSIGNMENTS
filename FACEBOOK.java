package WEEK2ASSIGNMENTS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FACEBOOK {

	
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver =new ChromeDriver(); 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.findElement(By.linkText("Create New Account") ).click();
		 driver.findElement(By.name("firstname")).sendKeys("jam");
		 driver.findElement(By.name("lastname") ).sendKeys("moh");
		 driver.findElement(By.name("reg_email__") ).sendKeys("1234567689");
		 driver.findElement(By.id("password_step_input") ).sendKeys("jam@123");
		WebElement day = driver.findElement(By.id("day") );
		Select obj = new Select(day);
		obj.selectByValue("3");
		WebElement month = driver.findElement(By.id("month") );
		Select obj1 = new Select(month);
		obj1.selectByVisibleText("Mar");
		WebElement year = driver.findElement(By.id("year") );
		Select obj2 = new Select(year);
		obj2.selectByVisibleText("2019");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]" )).click();
	
		//driver.findElement(By.xpath("//input[@class=\"_8esa\")).click();"
		
	//("//input[@class='decorativeSubmit']"))
		//class="_58mt"
		//input[@name='submitButton']
		
		
		
		

	}

}
