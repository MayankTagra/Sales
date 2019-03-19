package CheckMultiple;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Finder;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import com.google.common.collect.Iterators;

import org.openqa.selenium.WebDriver;
import java.util.*;

public class CheckMultiple {
	public static void main(String[] args) throws FindFailed, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Screen sc=new Screen();
		
		driver.get("https://www.free-play-mahjong.com/#&ui-state=dialog");
		driver.manage().window().maximize();
		String path="E:\\Data_pool\\";
		
		
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
		li.add(new Pattern(path+"Carpet.PNG"));	
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
		
		li.add(new Pattern(path+"w.PNG"));	
	//	Pattern pt=new Pattern(path+"c1.PNG");
		
		
		//Iterator<Match> itr=sc.findAll(pt);
		//System.out.println("Numberof Images "+Iterators.size(itr));
		Thread.sleep(3000);
		//System.out.println(itr);
		for(int i=0;i<20;i++)
		{
		
	//	sc.find(pt).click();
		for(Pattern pt:li)
		{	
			
			if(sc.exists(pt)!=null)
			{
			
				Match[] m=new Match[40];
				m=	sc.findAllByRow(pt);
				int size=m.length;
				System.out.println(size);
		
				for(int j=0;j<size;j++)
					{
						m[j].click();
					}
				
			}
			else
			{
				System.out.println("No element found");
			}
		/*
		while(itr.hasNext())
		{
			sc.find(itr.next());
			sc.click();
			sc.find(itr.next());
			sc.click();
			Thread.sleep(3400);
			
		}
		*/
		}
		
		
		
		
	/*
		while(itr.hasNext())
		{
			
	//		Finder f1=new Finder(pt.getImage());
			//System.out.println(itr.next().getTarget());
			Thread.sleep(3400);
			Location location=itr.next().getTarget();
			location.click();
			sc.find(pt).click();

			itr.next().click();
			
			Thread.sleep(5000);

			System.out.println("clicked");
			
		}
		
		*/
		}
		
	
		
	}

}
