import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) {
		//Invoking browser
		//Chrome - chromeDriver ->Methods close
		//Firefox - FirefoxDriver -> Methods close
		// safari saariDriver ->Methods close
		// webdriver close get
		// chromedriver.exe -> chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anand\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		//webdriver.chrome.driver-> value of path
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close(); 
		//driver.quit();
		// driver.getWindowHandle();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
	}

}
