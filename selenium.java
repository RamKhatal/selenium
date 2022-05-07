package pkg1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.AddWebDriverSpecHeaders;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Suepkar\\Driver\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//    driver.get("https://www.flipkart.com/");
//    Thread.sleep(2000);
//    driver.navigate().to("https://github.com/");
//    Thread.sleep(2000);
//    driver.navigate().refresh();
//    driver.navigate().back();
//    driver.navigate().forward();
//    driver.manage().window().maximize();
//    Thread.sleep(2000);
//    driver.manage().window().minimize();
//   driver.get("https://www.amazon.in/");
    
//    System.out.println(driver.getTitle());
//      driver.close(); // close current tab
//     driver.quit(); // close hole browser
//     Dimension p = new Dimension(960,540);
//     driver.manage().window().setSize(p);
//     Point p1 = new Point(-400,200);
//     driver.manage().window().setPosition(p1);
     
 	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagar Suepkar\\Driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.redbus.in/");
     Thread.sleep(2000);
//     driver.navigate().to("")
     driver.navigate().refresh();
     driver.navigate().back();
     driver.navigate().forward();
     driver.manage().window().maximize();
     driver.manage().window().minimize();
     Dimension p = new Dimension(770,550);
     driver.manage().window().setSize(p);
     Point pp = new Point(-100,200);
     driver.manage().window().setPosition(pp);
     
     }
}
  
