package FreePlay;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.google.common.collect.Iterators;

import java.util.Iterator;
import java.util.*;


import org.openqa.selenium.WebDriver;

public class Ras {
	public static void main(String[] args) throws FindFailed, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Screen sc=new Screen();
		driver.get("https://www.free-play-mahjong.com/");
		String path="E:\\Data_pool\\";
	//	Pattern p=new Pattern(path+"Ship5.PNG");
		List<Pattern> li=new ArrayList();
		li.add(new Pattern(path+"c1.PNG"));		
		li.add(new Pattern(path+"c2.PNG"));	
		li.add(new Pattern(path+"c3.PNG"));	
		li.add(new Pattern(path+"c4.PNG"));		//li.add(new Pattern(path+"c1.PNG"));	
		li.add(new Pattern(path+"c5.PNG"));		//li.add(new Pattern(path+"c1.PNG"));	
		li.add(new Pattern(path+"c6.PNG"));	
		li.add(new Pattern(path+"c7.PNG"));	
		li.add(new Pattern(path+"c8.PNG"));	
		li.add(new Pattern(path+"c9.PNG"));	
		li.add(new Pattern(path+"carpet.PNG"));	
		li.add(new Pattern(path+"E.PNG"));	
		li.add(new Pattern(path+"N.PNG"));	
		li.add(new Pattern(path+"P.PNG"));	
		li.add(new Pattern(path+"S.PNG"));
		li.add(new Pattern(path+"Single1.PNG"));	
		li.add(new Pattern(path+"Single2.PNG"));	
		li.add(new Pattern(path+"Single3.PNG"));		
		li.add(new Pattern(path+"Single4.PNG"));	
		li.add(new Pattern(path+"Single5.PNG"));	
		li.add(new Pattern(path+"Single6.PNG"));	
		li.add(new Pattern(path+"Single8.PNG"));	
		li.add(new Pattern(path+"Single7.PNG"));	
		li.add(new Pattern(path+"Single9.PNG"));	
		li.add(new Pattern(path+"Green.PNG"));	
		li.add(new Pattern(path+"i2.PNG"));	
		li.add(new Pattern(path+"i3.PNG"));	
		li.add(new Pattern(path+"i4.PNG"));	
		li.add(new Pattern(path+"i5.PNG"));	
		
		li.add(new Pattern(path+"i6.PNG"));	
		li.add(new Pattern(path+"i7.PNG"));	
		li.add(new Pattern(path+"i8.PNG"));	
		li.add(new Pattern(path+"i9.PNG"));	
		li.add(new Pattern(path+"Flower1.PNG"));	
		li.add(new Pattern(path+"Flower2.PNG"));	
		li.add(new Pattern(path+"Peacock1.PNG"));	
		li.add(new Pattern(path+"Flower1.PNG"));	
		li.add(new Pattern(path+"Flower2.PNG"));	
		li.add(new Pattern(path+"w.PNG"));	
		
		for(Pattern pi:li)
		{	
			if(sc.exists(pi)!=null)
			{
			sc.wait(pi,2000);
			sc.click();
			sc.click();
			
			}
			else
			{
				System.out.println("Element  not found");
			}
			
		}
		Thread.sleep(3000);
		driver.close();
		
		

	}		
	

}
