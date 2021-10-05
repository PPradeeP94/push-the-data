package org.myntra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari Krishna\\eclipse-workspace\\Seiinium_Installation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-tshirts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> offerPrice = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
		
		List<Integer> shirtRate= new ArrayList<Integer>();
		
		for (int i = 0; i <offerPrice.size(); i++) {
			String text = offerPrice.get(i).getText();
			String replaceAll = text.replaceAll("[^0-9]", "");
			int parseInt = Integer.parseInt(replaceAll);
			shirtRate.add(parseInt);
		}
		System.out.println(shirtRate);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Rate");
		int fixedRate = sc.nextInt();
		System.out.println(fixedRate);
		
	      	for (int j = 0; j <offerPrice.size(); j++) {
	      		Integer rate = shirtRate.get(j);
	      		if (fixedRate==rate) {
				List<WebElement> finalRate = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
				WebElement element = finalRate.get(j);
				element.click();
	      		}
				}
	}
		}


