package Pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//file -> new -> Project -> maven -> maven project -> create a simple project -> group id & artifact id -> name -> finish
// package -> class -> test case
// pom.xml -> <dependencies>
//Dependency code (website name) - mvnrepository.com -> to search "selenium hq server standalone" -> to click "selenium java"
// to select version "3.141.59" then to copy the code and paste it between dependency tag and save it.

public class c1 {
	
	
	
	@Test(groups="One")
	public void t0() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sures\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		System.out.println(ob.getTitle());
		Thread.sleep(3000);
		ob.quit();
		
	}

}
