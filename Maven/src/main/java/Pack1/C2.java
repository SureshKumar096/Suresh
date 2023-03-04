package Pack1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class C2 {

	@Test(groups="One")
	public void t1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sures\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://courses.letskodeit.com/practice");
		
		//create an object for select class
		//pass dropdown box input
		//select any one of the options => index, value or visible text
		//only one option can be selected
		
		WebElement ele = ob.findElementById("carselect");
		Select s=new Select(ele);// 'select' selenium buildin class
		//s.selectByIndex(1);
		s.selectByValue("honda");
		//s.selectByVisibleText("Benz");
		Thread.sleep(4000);
		ob.quit();
		
	}
}
