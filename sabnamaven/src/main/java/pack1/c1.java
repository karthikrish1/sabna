package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {

	
	@Test(groups="one")
	public void t1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		System.out.println(ob.getTitle());
		Thread.sleep(3000);
		ob.quit();
	}
	
	// file=> new=> project=> maven=> maven project=> create a simple=> groupid, artifactid=> finish
	// rightcli=> package
	// package=> rightclick=> class=> test case 
}
