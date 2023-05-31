package pack2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class c3 {
	
	@Test(groups="two")
	public void t3()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		WebElement ele = ob.findElementById("carselect");
		/*create an object for select class
		 * pass dropdown box as input
		 * 
		 * index
		 * value 
		 * visible text 
		 * 
		 * 
		 * 
		 * 
		 * */
		Select s= new Select(ele);
		//s.selectByIndex(1);
		//s.selectByValue("benz");
		s.selectByVisibleText("Benz");
		ob.quit();
	}

}
