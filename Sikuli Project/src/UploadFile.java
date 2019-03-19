import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class UploadFile {
	public static void main(String[] args) throws FindFailed, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c://chromeDriver//chromedriver.exe");
		
		Screen screen=new Screen();
		String path="E:\\Data_pool\\";
		
		
		
		Pattern FileInputTextBox=new Pattern(path+"FileInputTextBox.PNG");
		Pattern OpenButton=new Pattern(path+"OpenButton.PNG");
		
		
		
		
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/image_upload/index.php");
		driver.findElement(By.xpath("//input[@id='photoimg']")).click();
		screen.wait(FileInputTextBox,20);
		screen.type(FileInputTextBox,path+"Capture.PNG");
		screen.click(OpenButton);
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
