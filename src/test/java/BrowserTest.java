import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
//Getting the path variable
		String projectPath = System.getProperty("user.dir");
//Setting browser drivers		
		//System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

//Wait before closing		

//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
//Driver actions		
		driver.get("https://selenium.dev/");
		driver.close();
		//driver.quit();
		
	}
}
