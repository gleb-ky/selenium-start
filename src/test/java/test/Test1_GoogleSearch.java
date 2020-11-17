package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://www.google.com/");
		
		//enter text to search box
		
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//find search btn and press it
		//driver.findElement(By.name("btnK")).click();
		
		
		//hit enter
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		
		System.out.println("OK");
				
	}

}
