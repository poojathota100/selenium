package sel1;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\browsers\\chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
	}

}
