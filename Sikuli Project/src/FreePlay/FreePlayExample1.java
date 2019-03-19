package FreePlay;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.WebDriver;
import java.util.*;
public class FreePlayExample1 {
public static void main(String[] args) throws FindFailed, InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "c://chromeDriver//chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	Screen screen=new Screen();
	
	String path="E:\\Data_pool\\";
	Pattern undo=new Pattern(path+"Undo.PNG");
	Pattern shuffle=new Pattern(path+"Shuffle.PNG");
	Pattern NewDeal=new Pattern(path+"NewDeal.PNG");
	Pattern Onea=new Pattern(path+"1a.PNG");
	List<Pattern> li=new ArrayList();
	li.add(new Pattern(path+"Shift2.PNG"));
	li.add(new Pattern(path+"Shift3.PNG"));
	li.add(new Pattern(path+"Shift5.PNG"));
	li.add(new Pattern(path+"Shift6.PNG"));
	li.add(new Pattern(path+"Shift8.PNG"));
	li.add(new Pattern(path+"Shift9.PNG"));

	
	
	driver.get("https://www.free-play-mahjong.com/");
	Thread.sleep(9000);
	screen.wait(NewDeal,4000);
	screen.click();
	Thread.sleep(9000);
	for(Pattern p:li)
	{

	if(screen.find(p)!=null)
	{	
		screen.wait(p,1000);
		screen.click();
		screen.click();
		
	}
	else
	{
		System.out.println("Element not found");
		
	}
	
	}

	
	
	
	
	
	
	driver.close();
	
	
	

}
}
