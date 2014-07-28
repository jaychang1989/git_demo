/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.test_1;

/*
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
*/

//import org.openqa.selenium.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test_1 {
	public static void main(String[] args) {
		//System.out.println("hello, test1");
		
		WebDriver IeWebDriver = new InternetExplorerDriver();
		
		//IeWebDriver.get("www.baidu.com");
		IeWebDriver.get("http://localhost:8280/ILP/");
		
		IeWebDriver.findElement(By.name("userInfo.userNo")).clear();
		IeWebDriver.findElement(By.name("userInfo.userNo")).sendKeys("u0201");
		
		IeWebDriver.findElement(By.name("userInfo.password")).clear();
		IeWebDriver.findElement(By.name("userInfo.password")).sendKeys("123");
		
		IeWebDriver.findElement(By.xpath("//img[@onclick='javascript:login()']")).click();
	}
}