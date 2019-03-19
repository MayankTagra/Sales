package CheckMultiple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSample {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "c:\\chromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.free-play-mahjong.com/#&ui-state=dialog");
	//driver.manage().window().maximize();
	Actions builder=new Actions(driver);
	WebElement Games=driver.findElement(By.id("canvas"));
	
	builder.moveToElement(Games,43,730).click().build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='popup-game']//a[@href='#game-ui']")).click();
	Thread.sleep(5300);
	WebElement newDeal=driver.findElement(By.id("canvas"));
	builder.moveToElement(newDeal,150,740).click().build().perform();
	Thread.sleep(8400);
	
	WebElement shuffle=driver.findElement(By.id("canvas"));
	
	builder.moveToElement(shuffle,210,740).click().build().perform();
	
//	WebElement shuffle=driver.findElement(By.id("canvas"));
	//builder.moveToElement(shuffle,370,750);
	Thread.sleep(4000);
	WebElement undo=driver.findElement(By.id("canvas"));
	builder.moveToElement(undo,310,740).click().build().perform();
	Thread.sleep(5000);
	WebElement Hint=driver.findElement(By.id("canvas"));
	builder.moveToElement(Hint,380,740).click().perform();
	Thread.sleep(3400);
	

	driver.close();
	
	
}
}
