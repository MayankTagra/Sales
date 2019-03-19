import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SS {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.247mahjong.com/");
		Actions builder=new Actions(driver);
		Thread.sleep(3000);
		//WebElement cas=driver.findElement(By.xpath("//div[@id='game']/canvas"));
	//	builder.moveToElement(cas).moveByOffset(100, 100).click().build().perform();
		
		WebElement framename=driver.findElement(By.id("game-frame"));
		driver.switchTo().frame(framename);
		driver.manage().window().maximize();
		
		
		
	WebElement home=driver.findElement(By.xpath("//div[@id='game']/canvas"));
	builder.moveToElement(home).click();
	
	Thread.sleep(10000);
	
	
	//builder.
	
	WebElement ff=driver.findElement(By.xpath("//div[@id='game']/canvas"));
	builder.moveToElement(ff,300,0).click().build().perform();
	
	
/*	
	WebElement back=driver.findElement(By.xpath("//div[@id='game']/canvas"));
	builder.moveToElement(back,150,20).click().build().perform();
	Thread.sleep(2999);
	
	*/
	
	
		
		
		
		driver.close();
		
		
		//builder.moveToElement(driver.findElement(By.x))
	}

}
