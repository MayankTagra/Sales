import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.WebDriver;
public class DataDrivenDocument2 {
	public static void main(String[] args) throws FindFailed, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		Screen sc=new Screen();
		String path="E:\\Data_pool\\";
		Pattern pattern=new Pattern(path+"Pattern2.PNG");
		
		driver.get("https://d3js.org/");
		sc.wait(pattern,2000);
		sc.click();
		Thread.sleep(3400);
		
		driver.close();
		
	}

}
