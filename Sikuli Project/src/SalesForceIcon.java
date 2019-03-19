import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.WebDriver;

public class SalesForceIcon {
	public static void main(String[] args) throws FindFailed, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		Screen sc=new Screen();
		String path="E://Data_pool//";
		Pattern pattern=new Pattern(path+"SalesForce.PNG");
		driver.get("https://www.salesforce.com/in/");
		sc.wait(pattern,2000);
		
		sc.click();
		Thread.sleep(3400);
		driver.close();
		
		
	}

}
