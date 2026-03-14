package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class leetTest {
	@Test
	public void leetcodeTest(){
		WebDriver driver=new ChromeDriver();
		driver.get("https://leetcode.com/");
	}
}
