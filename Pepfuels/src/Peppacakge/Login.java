package Peppacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	

	public static void main(String[] args) {
	
  System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
  
   WebDriver driver=new ChromeDriver();
   driver.get("https://cp.pepfuels.com/fopadmin/login");
   driver.manage().window().maximize();
   WebElement Contactnumber=driver.findElement(By.id("loginContactNumber")); 
   Contactnumber.sendKeys("8826006480");
   
   WebElement Password=driver.findElement(By.id("loginPwd"));
   Password.sendKeys("t1234");
   
  WebElement Login=driver.findElement(By.id("submit"));
  Login.click();  
	}

	


}
