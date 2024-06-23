import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sellintroduction {

	public static void main(String[] args) {
		

		//Invoking browser
		//Chrome - ChromeDriver .exten-> Methods 'close' 'get'
		//Firefox - FirefoxDriver -> Methods 'close' 'get'
		//Safari- SafarizDriver -> Methods 'close' 'get'
		//WebDriver close get
		//WebDriver methods + class methods
		
		//Chromedriver.exe -> Chrome browser
		//step to invoke Chrome driver or Sellenium Manager (its a property of chromedriver which connects automaticall online and load Chromedriver.exe)
		
		//ChromeDriver driver = new ChromeDriver();
		//https://googlechromelabs.github.io/chrome-for-testing/  to download chromedriver .exe
		//System.setProperty(null, null) -- this we use to manually set the path of chromedriver but on the other hand now a days user don't need to set this path as this can be automatically utilized by sellenium manager a property of chrome driver method
		
		//System.setProperty("webdriver.chrome.driver", "/Users/yashpreet/Documents/Sellenium driver/chromedriver");  
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.getTitle();
		System.out.print("Title: "); System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); // this is only to close current Tab on the browser 
		driver.quit(); // This is used to close all the windows open due to scripts
		


	}

}
