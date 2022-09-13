// single items in cart
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Addcart {
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
	driver.get("http://automationpractice.com/index.php");
	//button ajax_add_to_cart_button btn btn-default
	List <WebElement> products = driver.findElements(By.xpath("//ul[@id='homefeatured']//div[@class='product-container']//a[@class='product-name']"));
	System.out.println(products.size());
	for(int i=0;i<products.size();i++) {
		String name = products.get(i).getText();
		if(name.contains("Blouse")) {
			driver.findElements(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")).get(i).click();
			break;
		}
		
	}
	}
}