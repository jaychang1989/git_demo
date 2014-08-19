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
import org.openqa.selenium.JavascriptExecutor;

public class test_1 {
	public static void main(String[] args) throws InterruptedException {
		//System.out.println("hello, test1");
		
		WebDriver Driver = new InternetExplorerDriver();
		
		//最大化窗口
		Driver.manage().window().maximize();
		
		//IeWebDriver.get("www.baidu.com");
		Driver.get("http://localhost:8280/ILP/");
		
		//输入用户名
		Driver.findElement(By.name("userInfo.userNo")).clear();
		Driver.findElement(By.name("userInfo.userNo")).sendKeys("u0201");
		
		//输入密码
		Driver.findElement(By.name("userInfo.password")).clear();
		Driver.findElement(By.name("userInfo.password")).sendKeys("123");
		
		//IeWebDriver.findElement(By.xpath("//img[@onclick='javascript:login()']")).click();
		Driver.findElement(By.xpath("//img[@src='/ILP/images/logindl.gif']")).click();
		
		Thread.sleep(1000);
		
		//选择单人综合实验按钮
		Driver.findElement(By.xpath("(//input[@name='testCaseType'])[2]")).click();
		
		//点击查询
		Driver.findElement(By.xpath("//img[@src='images/search.gif']")).click();
		
		//选择实训任务
		Driver.findElement(By.xpath("//div[@class='l-grid-row-cell-inner l-grid-row-cell-inner-fixedheight']")).click();
		
		/*String CurrentHandle = Driver.getWindowHandle();
		
		System.out.println(CurrentHandle);
		
		System.out.println(Driver.getTitle() + "   " + Driver.getCurrentUrl());*/
		
		//点击确定
		Driver.findElement(By.xpath("//img[@src='images/ok.gif']")).click();
		
		Thread.sleep(1000);
		/*WebDriver Window = Driver.switchTo().window(CurrentHandle);
		
		CurrentHandle = Driver.getWindowHandle();
		
		System.out.println(CurrentHandle);
		
		System.out.println(Window.getTitle() + "   " + Window.getCurrentUrl());*/
			
		//进入买方
		((JavascriptExecutor) Driver).executeScript("arguments[0].click();", Driver.findElement(By.xpath("//map[@id='Map']/area[6]")));
		//Driver.findElement(By.xpath("//map[@id='Map']/area[6]")).click();
		
		Thread.sleep(1000);
		
		//点击订单管理
		Driver.findElement(By.xpath("//ul[@id='tree1']/li[@treedataindex='0']")).click();
		//Driver.findElement(By.xpath("//span[text() = '订单管理'][1]")).click();
		
		Driver.findElement(By.xpath("//div[@class='l-body']/span[text()='订单管理']")).click();
	
		//点击新增
		Driver.findElement(By.xpath("//div[@id='mybarTool']/div[2]")).click();
		
		
		
		
		
		
		
		//Buyer_order(Driver);
		
		//Driver.close();
		
	}
	
	//买家订单管理
	public static void Buyer_order (WebDriver driver){
		
		String CurrentHandle = driver.getWindowHandle();
		
		System.out.println(CurrentHandle);
		
		//点击订单管理
		driver.findElement(By.xpath("//li[@class='l-first']/div/span[contains(text(), '订单管理')]")).click();
		
		//点击展开的订单管理
		driver.findElement(By.xpath("//div[@class='l-body l-selected']/span[contains(text(), '订单管理')]")).click();
		
		
		System.out.println(CurrentHandle);
		
		driver.switchTo().frame("frameborder");
		
		CurrentHandle = driver.getWindowHandle();
		
		System.out.println(CurrentHandle);
		
		//点击新增
		//driver.findElement(By.xpath("//div[@class='l-toolbar-item l-panel-btn']/span[contains(text(), '新增')]")).click();
	}
	
}