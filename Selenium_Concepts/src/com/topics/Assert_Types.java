package com.topics;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBys;

public  class Assert_Types {
	
		static int a;
	
	public static void main(String[] args) {
		//System.out.println(a/1);
		
		try {
			System.out.println(a/0);
		}
		catch (Exception e) {
			System.out.println("not");
		}
		
		finally {
			System.out.println("ok");
		}
		
		
		for (int i = 1; i <=15; i++) {
			if (i>=10) {
				
				continue;
				
			}
			System.out.println(i);
		}
	}
}


// --------.......15A...........

//partialLinktest v/slink test
// window handles default content
// priority vs servity
// implict vs explicity ----wedriver wait

//  40---jdbc
// 41-----testng
// 42----parallel execution
// 46


//=====15=====
// 10---cachelookup
// 20---use of annotation
// 40---step definition
// 50----behave b/w cucumber
// 55---keywords
// 61---parallel cumcumber
// 71---testNg suite
// 85 listenrs
// 88 ---factory