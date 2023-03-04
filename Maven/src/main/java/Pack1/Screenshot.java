package Pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Screenshot {
	
	@Test(groups="One")
	public void t2() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sures\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://jqueryui.com/droppable/");
		
		//Before Screenshot
		File s = ob.getScreenshotAs(OutputType.FILE);
		//Copy,paste -> FileUtils => go to "mvn repository"=> "apache directory studio common io"=> Select version 2.11.0
		FileUtils.copyFile(s,new File ("C:\\Users\\Sures\\eclipse-workspace\\Maven\\src\\main\\java\\Pack2\\Before.png"));
		
		ob.manage().window().maximize();
		ob.switchTo().frame(0);
		Actions ac= new Actions(ob);
		WebElement ele = ob.findElementById("draggable");
		WebElement ele1 = ob.findElementById("droppable");
		ac.dragAndDrop(ele, ele1).build().perform();
		
		//After Screenshot
		File s1 = ob.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s1,new File ("C:\\Users\\Sures\\eclipse-workspace\\Maven\\src\\main\\java\\Pack2\\After.png"));
		
		Thread.sleep(4000);
		ob.quit();
	}

}
