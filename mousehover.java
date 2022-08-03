package sel1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mousehover {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    
	  
	   WebElement mainmenu=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
	   Actions mousehover=new Actions(driver);
	   mousehover.moveToElement(mainmenu).perform();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[2]/a")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"s0-28-9-0-1[0]-0-1[0]-0-12-list\"]/li[2]/a/div/img")).click();
	   WebElement ddown=driver.findElement(By.name("_sacat"));
	   Select select=new Select(ddown);
	   select.selectByValue("2984");
	   driver.findElement(By.id("gh-btn")).click();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//*[@id=\"gh-p-1\"]/a")).click();
	   
	   driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("electonics");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
	   
	   
	   
	  
	 
	   
	   
	   
	   
	   
	   
	   
	   
	    
	    
	}
	}