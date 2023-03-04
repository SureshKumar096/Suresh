package Pack2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C5 {
	
	@Test(groups="Two")
	public void t4() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sures\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/datepicker/");
		ob.switchTo().frame(0);
		
		//clicking on date text box
		ob.findElementById("datepicker").click();
		
		//selecting month and year
		for(int i=0;i<2;i++)
		{
			ob.findElementByCssSelector("#ui-datepicker-div > div > a.ui-datepicker-next.ui-corner-all > span").click();
		}
		
		//date selection
		ob.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(1) > td:nth-child(7) > a").click();
		Thread.sleep(4000);
		ob.quit();
	}

}
