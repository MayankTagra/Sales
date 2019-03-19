package CheckMultiple;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;


public class ConatctUs {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","c:\\chromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.salesforce.com/in/?ir=1");
	driver.findElement(By.xpath("//div[@class='utility-bar']//a[@href='#']")).click();
	
	driver.findElement(By.xpath("//div[@class='liveagent-data']/following-sibling::a")).click();
	
	Thread.sleep(2300);
	Thread.sleep(5000);
	
	driver.findElement(By.id("FirstName")).sendKeys("Mayank");
	driver.findElement(By.id("LastName")).sendKeys("Tagra");
	driver.findElement(By.id("Email")).sendKeys("mayanktagra1@gmail.com");
	driver.findElement(By.id("Phone")).sendKeys("9898989898");
	driver.findElement(By.xpath("//div[@class='buttonWrapper embeddedServiceSidebarForm']//span")).click();
	Thread.sleep(60000);
	Actions builder=new Actions(driver);
	builder.moveToElement(driver.findElement(By.xpath("//textarea[@class='chasitorText  textarea']"))).sendKeys("Hello")
	.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(5600);
	builder.moveToElement(driver.findElement(By.xpath("//textarea[@class='chasitorText  textarea']"))).sendKeys("Want to know About SalesForce")
	.sendKeys(Keys.ENTER).build().perform();
	
	
	
	//driver.findElement(By.xpath("//textarea[@class='chasitorText  textarea']")).sendKeys("Hello").;
	
	driver.findElement(By.xpath("//div[@class='chatOptions fade fade-2x']//a[1]")).click();
	driver.findElement(By.xpath("//div[@class='chatOptions fade fade-2x']//a[2]")).click();
	driver.findElement(By.xpath("//button[@class='closeButton headerItem']")).click();
	Thread.sleep(67000);
	
	}

}
