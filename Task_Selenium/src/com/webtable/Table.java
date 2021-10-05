package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	
	static int indexvalueofyear,indexvalueofwinner,
	indexvalueofrunnerup,indexvalueofresult;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Selenium_Workload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careerpower.in/cricket-world-cup-winners-list.html");
		driver.manage().window().maximize();
		
		List<WebElement> tableData = driver.findElements(By.xpath("(//table[@class=\"table table-bordered table-striped table-hover\"])[1]/tbody/tr[2]/td"));
		for (int i = 0; i < tableData.size(); i++) {
			WebElement Header = tableData.get(i);
			String text = Header.getText();
		//	System.out.println(text);
			
			if (text.equalsIgnoreCase("Year")) {
				indexvalueofyear =i;
				System.out.println("Year Index ="+indexvalueofyear);
			}
			else if (text.equalsIgnoreCase("Winner")) {
				indexvalueofwinner =i;
				System.out.println("Winner Index ="+indexvalueofwinner);
			}
			else if (text.equalsIgnoreCase("Runner-up")) {
				indexvalueofrunnerup =i;
				System.out.println("Runner-up Index ="+indexvalueofrunnerup);
			}
			else if (text.equalsIgnoreCase("Result")) {
				indexvalueofresult =i;
				System.out.println("Result Index ="+indexvalueofresult);
			}
		}
		List<WebElement> allRows = driver.findElements(By.xpath("(//table[@class=\"table table-bordered table-striped table-hover\"])[1]/tbody/tr"));
		for (int i = 0; i < allRows.size(); i++) {
			
			List<WebElement> rows = allRows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < rows.size(); j++) {
				String text = rows.get(j).getText();
				
				String text2 = rows.get(indexvalueofyear).getText();
				String text3 = rows.get(indexvalueofwinner).getText();
				String text4 = rows.get(indexvalueofrunnerup).getText();
				String text5 = rows.get(indexvalueofresult).getText();
				
				
				if (text.equalsIgnoreCase("India")) {
					System.out.println(text2);
					System.out.println(text3);
					System.out.println(text4);
					System.out.println(text5);
				}
			}
		
				}
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
	}

}
