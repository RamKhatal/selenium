package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Suepkar\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.get("https://www.flipkart.com/");
		    Thread.sleep(2000);
		    
		    
		    // WebElement element = driver.FindElement(By.xpath(""))
		    // [1] xpath by attribute
		    // tagname[@attribute ='attribute value']
		    WebElement emailInpute = driver.findElement(By.xpath("//Inpute[@type='text']"));
		    WebElement passwordInpute = driver.findElement(By.xpath("//Inpute[@type='password']"));
		    
		    //xpath by text function
		    
		    WebElement CreateAccountLink = driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']"));
		    
		    //xpath by contains
		    
		    WebElement CreateAccount = driver.findElement(By.xpath("//a[contains(text(),'Create an account')]"));
		}
		

}


// absolute xpath
//html/body/div[2]/div[1]/div/div/div/div/div/form/div/input