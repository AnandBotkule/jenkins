import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment {
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
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("checkBoxOption1")).click();
	System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
	Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
	driver.findElement(By.id("checkBoxOption1")).click();
	System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
	Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
	//Count
	System.out.println(driver.findElements(By.cssSelector("input[type ='checkbox']")).size());
	Assert.assertEquals(driver.findElements(By.cssSelector("input[type ='checkbox']")).size(),3);
	}
}
	