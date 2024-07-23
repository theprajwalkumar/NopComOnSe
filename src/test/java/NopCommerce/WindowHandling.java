package NopCommerce;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		Thread.sleep(3000);
		
		
		WebElement AdminA=driver.findElement(By.xpath("//*[@id=\"ph-topic\"]/div[2]/div/div[1]/div[2]/div/div/a[1]"));
		AdminA.click();
		
		Set<String>handles=driver.getWindowHandles();
		Iterator it=handles.iterator();
		
		String parentid=(String) it.next();
		String childid=(String) it.next();
		
		driver.switchTo().window(childid);
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentid);
		
		Thread.sleep(3000);
		System.out.println("This is the Child Id"+childid);
		System.out.println("This is the Parent ID"+parentid);
		
		driver.quit();

	}


}


