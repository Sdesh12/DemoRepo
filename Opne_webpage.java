package Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Opne_webpage {

public static void main(String[] args) throws InterruptedException, IOException {
		
	System.getProperty("webdriver.chrome.driver","C:\\Users\\AdmiN\\Documents\\Swaroop Java\\New folder\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	//to hit URL
	driver.get("https://www.saucedemo.com/");
	//Wait
	Thread.sleep(2000);
	//Maximize window
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
    //enter username	
	driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys("standard_user");
	
	Thread.sleep(2000);
	//enter password
    driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys("secret_sauce");
    
    Thread.sleep(2000);
    //click on submit button
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
    Thread.sleep(2000);
    //Handling dropdown
    WebElement Name=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
    
    Select S1=new Select(Name);
    
    S1.selectByIndex(2);
    
    Thread.sleep(5000);
    
    driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']")).click();
    
    Thread.sleep(2000);
    //enter name
    driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys("ABC");
    
    Thread.sleep(2000);  
    //enter last name
    driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys("XYZ");
    
    Thread.sleep(2000);
    //enter pin code
    driver.findElement(By.xpath("(//input[@class='input_error form_input'])[3]")).sendKeys("12345");
    
    Thread.sleep(2000);
    //click on submit
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
    Thread.sleep(2000);
    //Take screenshot
    File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    System.out.println(Source);
    File Destination=new File("C:\\Users\\AdmiN\\Documents\\Swaroop Java\\New folder\\apache poi jar\\exel file\\ss.jpg");
    FileHandler.copy(Source, Destination);
    
    Thread.sleep(2000);
    //click finish
    driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium cart_button']")).click();
    //close browser
    driver.close();
    
    
}
}