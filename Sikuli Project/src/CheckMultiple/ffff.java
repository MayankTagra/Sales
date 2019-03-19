package CheckMultiple;


import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import java.util.*;
public class ffff {
	public static void main(String[] args) throws FindFailed, InterruptedException
	{
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.findElement(By.xpath("//div[@class='utility-bar']//span[@class='hidden-xs']")).click();
		String path="e:\\Data_pool\\";
		Screen sc=new Screen();
		Pattern pt=new Pattern(path+"Open.PNG");
		Pattern pt1=new Pattern(path+"Cancel.PNG");
		sc.wait(pt,3000);
		sc.click();
		Thread.sleep(4000);
		driver.close();
	/*	
		try
		{
			driver.switchTo().alert();
			System.out.println("No Alert is present");
		}
		catch(NoAlertPresentException e)
		{
			System.out.println("No alert Found");
		}
	
		ArrayList<String> li=new ArrayList<>();
		Set<String> win=driver.getWindowHandles();
		Iterator<String> itr=win.iterator();
		while(itr.hasNext())
		{
			li.add(itr.next());
		}
		System.out.println(li);
		Thread.sleep(34000);
		driver.close();
		*/
		
		
		
		
		
		
		
		
	}

}
