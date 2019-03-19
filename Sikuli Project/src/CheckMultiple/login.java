package CheckMultiple;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		
		Actions builder=new Actions(driver);
	//	builder.moveToElement(By.xpath("//div[@class='utility-bar']//div[@class='global-nav-login-flydown global-login']//a[@class='dropdown-toggle disabled']"))
		
	builder.moveToElement(driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='global-nav-login-flydown global-login']//a[@class='dropdown-toggle disabled']")))
	.build().perform();
	
	driver.findElement(By.xpath("//h2[@id='login']//a")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	int count=driver.findElements(By.xpath("//div[@class=\"  text-size-legal line-height-default        \"]//p")).size();
	System.out.println(count);
	
	for(int i=0;i<count;i++)
	{
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='global-nav-login-flydown global-login']//a[@class='dropdown-toggle disabled']")))
		.build().perform();
		driver.findElements(By.xpath("//div[@class=\\\"  text-size-legal line-height-default        \\\"]//p")).get(i).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		
	}
	driver.close();
	
		
	}

}
