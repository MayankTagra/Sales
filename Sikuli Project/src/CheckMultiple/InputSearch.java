package CheckMultiple;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class InputSearch {
	public static void main(String[] arsg) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1#");
		
		Actions builder=new Actions(driver);
	//	builder.sendKeys(driver.findElement(By.xpath("")))
		builder.sendKeys(driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='magic-box-input']/input")), "live").build().perform();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='magic-box-icon']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
