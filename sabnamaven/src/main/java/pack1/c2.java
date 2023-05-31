package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c2 {

	
	@Test(groups="one")
	public void t2() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/droppable/");
		
		//webelements: present inside the frame
		// switch ur control to that frame
		// id, name or index 
		
		ob.switchTo().frame(0);
		Actions ac= new Actions(ob);
		WebElement ele1 = ob.findElementById("draggable");
		WebElement ele11 = ob.findElementById("droppable");
		ac.dragAndDrop(ele1, ele11).build().perform();
		File f = ob.getScreenshotAs(OutputType.FILE);
		//copy,paste=>Fileutils: apache directory studio common io
		FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\sabnamaven\\src\\main\\java\\pack1\\a.png"));
		
		
		ob.quit();
	}
}
