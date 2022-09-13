
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignmenttwo {
	public static void main(String[] args) throws InterruptedException {
			//Invoking browser
			//Chrome - chromeDriver ->Methods close
			//Firefox - FirefoxDriver -> Methods close
			// safari saariDriver ->Methods close
			// webdriver close get
			// chromedriver.exe -> chrome browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anand\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			//webdriver.chrome.driver-> value of path
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
    driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Anand");
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Anand@gmail.com");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Anand");
    driver.findElement(By.id("exampleCheck1")).click();
    WebElement staticDropdown =driver.findElement(By.id("exampleFormControlSelect1"));
    Select  dropdown = new Select(staticDropdown);
    dropdown.selectByIndex(0);
    //inlineRadio1
    driver.findElement(By.id("inlineRadio1")).click();
    //bday
    driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("13-12-2021");
   //btn btn-success
    driver.findElement(By.className("btn-success")).click();
    //alert alert-success alert-dismissiblc
    Thread.sleep(2000);
    System.out.println(driver.findElement(By.className("alert")).getText());
    
    
	}
}
