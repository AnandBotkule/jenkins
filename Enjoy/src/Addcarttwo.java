//three items add into cart
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Addcarttwo {
	public static void main(String[] args) throws InterruptedException {
		// Invoking browser
		// Chrome - chromeDriver ->Methods close
		// Firefox - FirefoxDriver -> Methods close
		// safari saariDriver ->Methods close
		// webdriver close get
		// chromedriver.exe -> chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anand\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		// webdriver.chrome.driver-> value of path
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		// button ajax_add_to_cart_button btn btn-default
		String[] itemsNeeded = { "Blouse", "Faded Short Sleeve T-shirts", "Printed Chiffon Dress" };
		List<WebElement> products = driver.findElements(
				By.xpath("//ul[@id='homefeatured']//div[@class='product-container']//a[@class='product-name']"));
		System.out.println(products.size());
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(name)) {
				driver.findElements(By.xpath(
						"//a[@class='button ajax_add_to_cart_button btn btn-default']"))
						.get(i).click();
				Thread.sleep(2000);
				// continue btn btn-default button exclusive-medium clearfix button-container
				// driver.findElements(By.className("continue")).get(i).click(); button-container
				driver.findElement(By.xpath(
						"//div[@class='button-container']//span[@class='continue btn btn-default button exclusive-medium']")).click();
				Thread.sleep(2000);
				
					}
				}
			}
		}
//	}
//}
