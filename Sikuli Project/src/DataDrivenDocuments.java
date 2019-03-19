import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.WebDriver;

public class DataDrivenDocuments {
	public static void main(String[] args) throws FindFailed, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		Screen screen=new Screen();
		String path="E:\\Data_pool\\";
		Pattern pattern=new Pattern(path+"Pattern.PNG");
		driver.get("https://d3js.org/");
		screen.wait(pattern,2000);
		screen.click();
		Thread.sleep(60000);
		
		driver.close();
		
		
		
		
		
	}

}
