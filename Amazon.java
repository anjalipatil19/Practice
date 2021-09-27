package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Amazon {
	WebDriver driver;
  @Test
  public void AmazonTest() {
	  //driver.get("https://www.amazon.com/");
	  //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Formal shoes for women");
	  //driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	  //driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[1]/span/a/div/img")).click();
	  driver.get("https://www.makemytrip.com/railways/");
	  //driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div/input")).click();
	  //driver.findElement(By.className("lbl_input makeFlex column latoBold")).click();
	  driver.findElement(By.id("fromCity")).sendKeys("Mumbai");
	  
	  //river.driver.findElement(By.className("makeFlex")).click();
	  driver.findElement(By.xpath("//*[text()='KYN']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
	  System.setProperty("webdriver.chrome.driver", "driver2/chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() throws Exception{
	  System.out.println("After test");
	  Thread.sleep(7000);
	  driver.quit();  
  }

}
