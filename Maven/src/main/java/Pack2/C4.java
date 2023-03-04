package Pack2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class C4 {
	
	@Test(groups="Two")
	public void t3() throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sures\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/slider/");
		/*
		 * Slider
		 * 
		 * horizontal slider: move along x axs, y value will be 0
		 * vertical slider: move along y axis , x value will be 0
		 * 
		 * 
		 * */
		ob.switchTo().frame(0);
		Actions ac= new Actions(ob);
		WebElement ele = ob.findElementById("slider");
		ac.dragAndDropBy(ele, 60, 0).build().perform();
		Thread.sleep(3000);
		ob.quit();
	}

}
