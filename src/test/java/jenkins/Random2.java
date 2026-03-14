package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Random2 {
	@Test
	public void instagram(){
		WebDriver driver=new ChromeDriver();
		driver.get("https://leetcode.com/");
	}
}
