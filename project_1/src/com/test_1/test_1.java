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
		
		WebDriver Driver = new InternetExplorerDriver();
		
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
		
		//���ȷ��
		Driver.findElement(By.xpath("//img[@src='images/ok.gif']")).click();
	}
}