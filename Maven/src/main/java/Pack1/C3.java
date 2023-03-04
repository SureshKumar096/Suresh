package Pack1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class C3 {

	@Test(groups="One")
	public void t2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sures\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://jqueryui.com/droppable/");
		
		//Drag & Drop
		//to identify the (Index,Id, Name)
		
		ob.manage().window().maximize();
		ob.switchTo().frame(0);
		Actions ac= new Actions(ob);
		WebElement ele = ob.findElementById("draggable");
		WebElement ele1 = ob.findElementById("droppable");
		ac.dragAndDrop(ele, ele1).build().perform();
		Thread.sleep(4000);
		ob.quit();
	}
}
