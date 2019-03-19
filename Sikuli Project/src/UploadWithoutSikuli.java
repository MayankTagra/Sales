import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

public class UploadWithoutSikuli {
	public static void main(String[] args)
	{	
		System.setProperty("webdriver.chrome.driver", "c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Actions builder=new Actions(driver);
		
		
	//	builder.moveToElement()
		
	}

}
