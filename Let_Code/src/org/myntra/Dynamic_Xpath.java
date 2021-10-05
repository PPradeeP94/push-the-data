package org.myntra;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
	static int	indexofAadi ;
	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari Krishna\\eclipse-workspace\\Seiinium_Installation\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.shopclues.com/footwear-mens-casual-shoes.html");
//		driver.manage().window().maximize();
//	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
		//Following-sibling
		
//		List<WebElement> Title = driver.findElements(By.xpath("//h3[@class='product-brand']//following-sibling::h4[@class='product-product']"));
//		for (WebElement Name : Title) {
//			String text = Name.getText();
//			System.out.println(text);
//			
//		}
		
		// Preceding-sibling
		
//		List<WebElement> Header = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
//		for (WebElement Name : Header) {
//			String text = Name.getText();
//			System.out.println(text);
//		}
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Seiinium_Installation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/footwear-mens-casual-shoes.html");
		driver.manage().window().maximize();
	
		List<WebElement> profile = driver.findElements(By.xpath("//span[@class='prod_name  mii ']"));
		
		
		for (int i = 0; i <profile.size(); i++) {
			WebElement Name = profile.get(i);
			String text = Name.getText();
	//		System.out.println(text);
			if (text.contains("Aadi")) {
				indexofAadi= i;
			System.out.println("Index ="+i);
	
		
				List<WebElement> fixed = driver.findElements(By.xpath("//span[@class='prod_name  mii ']"));
				WebElement element = fixed.get(2);
				element.click();
		
			}
	
				}
	}
	

}		
		

	


