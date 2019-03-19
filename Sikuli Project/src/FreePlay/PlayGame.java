package FreePlay;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.WebDriver;
import java.util.*;


public class PlayGame {
	public static void main(String[] args) throws FindFailed, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
			Screen sc=new Screen();
			driver.get("https://www.free-play-mahjong.com/");
			
			String path="E:\\Data_pool\\";
			
			List<Pattern> li=new ArrayList();
			
			li.add(new Pattern(path+"Ship2.PNG"));
			li.add(new Pattern(path+"Ship3.PNG"));
			li.add(new Pattern(path+"Ship5.PNG"));
			li.add(new Pattern(path+"Ship6.PNG"));
			li.add(new Pattern(path+"Ship8.PNG"));
			li.add(new Pattern(path+"Ship9.PNG"));
			
			for(Pattern pi:li)
			{
			
			if(sc.exists(pi) != null)
			{
				sc.wait(pi,200);
				sc.click();
				
			}
			else
			{
				System.out.println("Image not Found");
			}
		//String path="E:\\Data_pool\\";
			}
		
			Thread.sleep(3400);
			driver.close();
			
		
			
		
	
		
	
	}

}
