package WEEK2ASSIGNMENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BROWSER {
  public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver =new ChromeDriver(); //"C"hrome"D"river = caps =default
	 driver.get("http://leaftaps.com/opentaps/control/main");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");//send"k"eys = caps
	 driver.findElement(By.className("decorativeSubmit")).click();//class "N"ame = caps
	 String text =driver.findElement(By.tagName("h2")).getText();//get"T"ext
	 System.out.println(text);
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Create Lead")).click();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("JAMEEL");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MOHAMED");
	 driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345");
	 driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");	 
	 driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("JAMEEL");
	 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("JAM");
	 driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MR");
	 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("AUTOMATION TESTER");
	 driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000000"); 
	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("INSPECTOR");
	 driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");
	 driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91+");
     driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("001");
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("JAMEEL123@gmail.com");
	 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456789");
	 driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("MOHAMED");
	 driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("JAMEEL");
	 driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("MOHAMED");
	 driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("5/12,PERUNGALATHUR,6500083");
	 driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("5/112,PERUNGALATHUR,6500083");
	 driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
	 driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600");
	 driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600658");

			 
	 
	 
	 
	 
	 
		 
	 
}
}
	
