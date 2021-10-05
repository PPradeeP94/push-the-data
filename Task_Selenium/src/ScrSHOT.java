import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrSHOT {

	public static void main(String[] args) throws InterruptedException, Throwable   {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Task_Selenium\\New_Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/search?q=myntra&rlz=1C1CHBF_enIN962IN962&oq=&aqs=chrome.0.69i59i450l8.331519645j0j15&sourceid=chrome&ie=UTF-8");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.className("LC20lb DKV0Md"));
		Thread.sleep(3000);
		findElement.click();
		
		WebDriverWait wb= new WebDriverWait(driver, 30);
		
//		WebElement gooogle = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
//		File elesrc = gooogle.getScreenshotAs(OutputType.FILE);
//		File eledes=new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Task_Selenium\\Drivers\\image2.png");
//		FileUtils.copyFile(elesrc, eledes);
		
//		Actions ac =new Actions(driver);
//		ac.moveToElement(gooogle).build().perform();
		
//		TakesScreenshot ts =(TakesScreenshot) driver;
//	    File src = ts.getScreenshotAs(OutputType.FILE);
//		File des=new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Task_Selenium\\Drivers\\image1.png");
//		FileUtils.copyFile(src, des);
		
//		String text = gooogle.getText();
//		System.out.println(text);
		
//		WebElement element = driver.findElement(By.xpath("(//div[@class='product-price'])[2]"));
//		element.click();
		
		
	//	driver.close();
	//	WebElement text = driver.findElement(By.xpath("//*[@id=\"sizeButtonsContainer\"]/div[2]/div[3]"));
	//	text.click();
//		WebElement element1 = driver.findElement(By.xpath("(//div[@class='product-price'])[3]"));
//		element1.click();
		
	//	driver.close();
//                Set<String> Handles = driver.getWindowHandles();
//		for (String str : Handles) {
//			String titles = driver.switchTo().window(str).getTitle();
//			System.out.println(titles);
//			String a="Formal Shirts for Men - Buy Men's Formal Shirts Online | Myntra";
//			String b="Buy H&M Men White Slim Fit Easy Iron Shirt - Shirts for Men 15193816 | Myntra";
//			String c="Buy Louis Philippe Men Grey Classic Fit Pure Cotton Self Design Formal Shirt - Shirts for Men 14816246 | Myntra";
//			if (titles.equalsIgnoreCase(c)) {
//				continue;
//			}
//			driver.switchTo().defaultContent();
//	
//		}
//			for (String st : allwindows) {
//				String title = driver.switchTo().window(st).getTitle();
//				String a="Formal Shirts for Men - Buy Men's Formal Shirts Online | Myntra";
//				if (title.equalsIgnoreCase(a)) {
//					break;
//				}
//			}
//		
		
//		driver.close();
//		Thread.sleep(3000);
//		driver.quit();
		
//		Select sc = new Select(element1);
//		sc.selectByValue("3");
//		WebElement firstSelectedOption = sc.getFirstSelectedOption();
//		String text = firstSelectedOption.getText();
//		System.out.println(text);
		
		
	}}


