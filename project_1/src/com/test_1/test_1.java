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
		
		//��󻯴���
		Driver.manage().window().maximize();
		
		//IeWebDriver.get("www.baidu.com");
		Driver.get("http://localhost:8280/ILP/");
		
		//�����û���
		Driver.findElement(By.name("userInfo.userNo")).clear();
		Driver.findElement(By.name("userInfo.userNo")).sendKeys("u0201");
		
		//��������
		Driver.findElement(By.name("userInfo.password")).clear();
		Driver.findElement(By.name("userInfo.password")).sendKeys("123");
		
		//IeWebDriver.findElement(By.xpath("//img[@onclick='javascript:login()']")).click();
		Driver.findElement(By.xpath("//img[@src='/ILP/images/logindl.gif']")).click();
		
		//ѡ�����ۺ�ʵ�鰴ť
		Driver.findElement(By.xpath("(//input[@name='testCaseType'])[2]")).click();
		
		//�����ѯ
		Driver.findElement(By.xpath("//img[@src='images/search.gif']")).click();
		
		//ѡ��ʵѵ����
		Driver.findElement(By.xpath("//div[@class='l-grid-row-cell-inner l-grid-row-cell-inner-fixedheight']")).click();
		
		
		/*String CurrentHandle = Driver.getWindowHandle();
		
		System.out.println(CurrentHandle);
		
		System.out.println(Driver.getTitle() + "   " + Driver.getCurrentUrl());*/
		
		//���ȷ��
		Driver.findElement(By.xpath("//img[@src='images/ok.gif']")).click();
		
		
		/*WebDriver Window = Driver.switchTo().window(CurrentHandle);
		
		CurrentHandle = Driver.getWindowHandle();
		
		System.out.println(CurrentHandle);
		
		System.out.println(Window.getTitle() + "   " + Window.getCurrentUrl());*/
			
		//������
		//Driver.findElement(By.xpath("//map[@id='Map']/area[@coords='378,421,509,485,541,473,532,466,530,402,490,383,490,355,449,330,421,346,420,367,404,359,390,364,389,409']")).click();
		//Driver.findElement(By.xpath("//area[@href='permissChoose.action?roleId=12']")).click();
		
		((JavascriptExecutor) Driver).executeScript("arguments[0].click();", Driver.findElement(By.xpath("//map[@id='Map']/area[6]")));
		//Driver.findElement(By.xpath("//map[@id='Map']/area[6]")).click();
		
		//Thread.sleep(3000);
		
		//�����������
		Driver.findElement(By.xpath("//ul[@id='tree1']/li[@treedataindex='0']/div/div[1]")).click();
		
		//mai_order(Driver);
		
		//Driver.close();
		
	}
	
	//��Ҷ�������
	public static void mai_order (WebDriver driver){
		
		String CurrentHandle = driver.getWindowHandle();
		
		System.out.println(CurrentHandle);
		
		//�����������
		driver.findElement(By.xpath("//li[@class='l-first']/div/span[contains(text(), '��������')]")).click();
		
		//���չ���Ķ�������
		driver.findElement(By.xpath("//div[@class='l-body l-selected']/span[contains(text(), '��������')]")).click();
		
		
		System.out.println(CurrentHandle);
		
		driver.switchTo().frame("frameborder");
		
		CurrentHandle = driver.getWindowHandle();
		
		System.out.println(CurrentHandle);
		
		//�������
		//driver.findElement(By.xpath("//div[@class='l-toolbar-item l-panel-btn']/span[contains(text(), '����')]")).click();
	}
	
}