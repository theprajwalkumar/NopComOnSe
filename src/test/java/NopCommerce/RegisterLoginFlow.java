package NopCommerce;

import java.io.File;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RegisterLoginFlow {
	public static void main(String[] args) throws Exception {
		   //ScreenRecorderUtil.startRecord("main");
			
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Which flow you want to follow? Login/Register");
			String Output=sc.next();
			switch (Output) {
			case "Login":
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://demo.nopcommerce.com/");
				Thread.sleep(3000);
				
				WebElement Currency=driver.findElement(By.id("customerCurrency"));
				Select cc=new Select(Currency);
				cc.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
				
				Thread.sleep(3000);
				
				WebElement Login=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
				Login.click();
				
				Thread.sleep(3000);
				
				WebElement Email=driver.findElement(By.xpath("//*[@id=\"Email\"]"));
				Email.sendKeys("prajwalprakash002@gmail.com");
				
				WebElement Password=driver.findElement(By.xpath("//*[@id=\"Password\"]"));
				Password.sendKeys("1234567890");
				
				WebElement LoginB=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
				LoginB.click();
				
				Thread.sleep(3000);
				
				
				WebElement Wishlist=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[3]"));
				Wishlist.click();
				
				Thread.sleep(3000);
				
				WebElement Button=driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-4\"]"));
				Button.click();
				
				Thread.sleep(3000);
				
				WebElement Wish=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]"));
				Thread.sleep(3000);
				Wish.click();
				
				WebElement Email1=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/form/div[2]/button[3]"));
				Email1.click();
				
				Thread.sleep(3000);
				
				WebElement FriendEmail=driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]"));
				FriendEmail.sendKeys("prajwalprakash20@gmail.com");
				
				Thread.sleep(3000);
				
				//WebElement YourEmail=driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]"));
				//YourEmail.sendKeys("prajwalprakash20@gmail.com");
				
				Thread.sleep(3000);
				
				WebElement PersonalMessage=driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]"));
				PersonalMessage.sendKeys("This is optional");
				
				Thread.sleep(3000);
				
				WebElement SendEmail=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/div[2]/button"));
				SendEmail.click();
				
				TakesScreenshot sc1 =((TakesScreenshot)driver);
				File src = sc1.getScreenshotAs(OutputType.FILE);
				File f2 = new File("/Users/prajwal/Downloads/ScreenshotsEclipse/LoginNop.png");
				FileUtils.copyFile(src, f2);
				
				Thread.sleep(3000);
				driver.close();

				
				
				break;
				
			case "Register":
				

				WebDriverManager.chromedriver().setup();
				WebDriver driver1=new ChromeDriver();
				driver1.get("https://demo.nopcommerce.com/");
				Thread.sleep(3000);
				
				WebElement Currency1=driver1.findElement(By.id("customerCurrency"));
				Select ccc=new Select(Currency1);
				ccc.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
				
				Thread.sleep(3000);
				
				WebElement Register=driver1.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
				Register.click();
				
				Thread.sleep(3000);
				
				WebElement Gender=driver1.findElement(By.xpath("//*[@id=\"gender-male\"]"));
				Gender.click();
				
				WebElement FirstName=driver1.findElement(By.xpath("//*[@id=\"FirstName\"]"));
				FirstName.sendKeys("Prajwal");
				
				WebElement LastName=driver1.findElement(By.xpath("//*[@id=\"LastName\"]"));
				LastName.sendKeys("Kumar");
				
				Thread.sleep(3000);
				
				WebElement Date=driver1.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]"));
				Select dd=new Select(Date);
				dd.selectByValue("20");
				
				Thread.sleep(3000);
				
				WebElement Month=driver1.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]"));
				Select mm=new Select(Month);
				mm.selectByValue("6");
				
				Thread.sleep(3000);
				
				WebElement Year=driver1.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]"));
				Select yy=new Select(Year);
				yy.selectByValue("1998");
				
				WebElement EmailID=driver1.findElement(By.xpath("//*[@id=\"Email\"]"));
				EmailID.sendKeys("prajwalprakash0002@gmail.com");
				
				WebElement Password1=driver1.findElement(By.xpath("//*[@id=\"Password\"]"));
				Password1.sendKeys("1234567890");
				
				WebElement ConfirmPassword=driver1.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
				ConfirmPassword.sendKeys("1234567890");
				
				WebElement RegisterB=driver1.findElement(By.xpath("//*[@id=\"register-button\"]"));
				RegisterB.click();
				
				WebElement ContinueB=driver1.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[2]/a"));
				ContinueB.click();
				
				Thread.sleep(3000);
				
				
				WebElement Wishlist1=driver1.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[3]"));
				Wishlist1.click();
				
				Thread.sleep(5000);
				
				WebElement Button1=driver1.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-4\"]"));
				Button1.click();
				
				Thread.sleep(3000);
				
				WebElement Wish1=driver1.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]"));
				Thread.sleep(3000);
				Wish1.click();
				
				WebElement Email11=driver1.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/form/div[2]/button[3]"));
				Email11.click();
				
				Thread.sleep(3000);
				
				WebElement FriendEmail1=driver1.findElement(By.xpath("//*[@id=\"FriendEmail\"]"));
				FriendEmail1.sendKeys("prajwalprakash20@gmail.com");
				
				Thread.sleep(3000);
				
				//WebElement YourEmail=driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]"));
				//YourEmail.sendKeys("prajwalprakash20@gmail.com");
				
				Thread.sleep(3000);
				
				WebElement PersonalMessage1=driver1.findElement(By.xpath("//*[@id=\"PersonalMessage\"]"));
				PersonalMessage1.sendKeys("This is optional");
				
				Thread.sleep(3000);
				
				WebElement SendEmail1=driver1.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/div[2]/button"));
				SendEmail1.click();
				
				TakesScreenshot sc2 =((TakesScreenshot)driver1);
				File src1 = sc2.getScreenshotAs(OutputType.FILE);
				File f3 = new File("/Users/prajwal/Downloads/ScreenshotsEclipse/RegisterNop.png");
				FileUtils.copyFile(src1, f3);
				
				Thread.sleep(3000);
				driver1.close();
				
				
				break;


				
				


			default:
				
				System.err.println("Invalid Input");
				break;
			}
			
			
			
			
			
		}

}

//Testcases on Laptop
//Verify the length and the breadth of the laptop matches with the specification given.
//Verify that all the keys are stable and accurate in the keyboard according to the specification.
//Verify that when there is no battery , laptop indicates No Battery Alert on the screen 
//Verify that when the laptop is turned on user is able to see the Welcome Screen
//Verify that the laptop has Ram of 8gb and 256ssd as per the specification.




