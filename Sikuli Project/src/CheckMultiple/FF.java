package CheckMultiple;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FF {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.free-play-mahjong.com/#&ui-state=dialog");
		
		Actions builder=new Actions(driver);
		WebElement button=driver.findElement(By.id("canvas"));
		Thread.sleep(10000);
		
		builder.moveToElement(button,60,620).click().build().perform();
		Thread.sleep(5000);
		
		builder.moveToElement(button,50,650).contextClick().build().perform();
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
	}

}
