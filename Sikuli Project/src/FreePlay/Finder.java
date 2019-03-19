package FreePlay;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.WebDriver;



public class Finder {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Screen sc=new Screen();
		driver.get("https://www.free-play-mahjong.com/#&ui-state=dialog");
		String path="E:\\Data_pool\\";
		Pattern p1=new Pattern(path+"c1.PNG");
		Pattern p2=new Pattern(path+"CSmall1.PNG");
		
		//Finder find=new Finder(p1.getImage());
	}

}
