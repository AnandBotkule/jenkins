
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Spicejet {
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
	driver.get("https://www.ixigo.com/");
	//class="orgn u-ib u-v-align-bottom u-text-left" //u-box passanger-class-list flex-container
	//driver.findElement(By.className("c-input")).sendKeys("Agra");//radio-button u-pos-rel u-ib u-v-align-top
	WebElement city = driver.findElement(By.xpath("//div[@class='orgn u-ib u-v-align-bottom u-text-left']//input[@class='c-input u-v-align-middle']"));
	driver.findElement(By.className("clear-input")).click();
    city.sendKeys("DEL - New Delhi");
	driver.findElement(By.xpath("//div[@class='dstn u-ib u-v-align-bottom u-text-left']//input[@class='c-input u-v-align-middle']")).sendKeys("BOM - Mumbai");
	driver.findElement(By.xpath("//div[@class='from-date u-ib']//input[@class='c-input u-v-align-middle']")).click();
	driver.findElement(By.xpath("//td[@data-date='04092022']//div[@class='day has-info']")).click();
	driver.findElement(By.xpath("//div[@class='u-ib items u-v-align-middle']//span[@data-val='6']")).click(); 
	//driver.findElement(By.xpath("//div[@class='u-box passanger-class-list flex-container']//div[@class='number-counter'][2]//div[@class='u-ib items u-v-align-middle'][2]//span[@data-val='3']")).click();
	driver.findElement(By.xpath("//div[@class='number-counter'][2]//span[@data-val='2']")).click(); 
	driver.findElement(By.xpath("//div[@class='number-counter'][3]//span[@data-val='1']")).click(); 
	driver.findElement(By.className("radio-button")).click();
	driver.findElement(By.className("u-ripple")).click();
	//city.sendKeys("Delhi");
	//driver.findElement(By.className("u-ripple")).click();
	}
}
