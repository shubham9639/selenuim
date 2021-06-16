package basic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tester4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		
		String parent = driver.getWindowHandle(); // nakuari
		System.out.println("hello" + parent);
		
		Set<String> wins = driver.getWindowHandles();// naukari,genpact,myno
		wins.remove(parent);
		for (String win : wins) {
			System.out.println(win);
			driver.switchTo().window(win);
			driver.close();
			Thread.sleep(2000);
		}
	}
}
