/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.ilp;


import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;


public class ilp {
	public static void main(String[] args) throws InterruptedException {
		//System.out.println("hello, test1");
		
		//�������
		WebDriver Driver = new InternetExplorerDriver();
		
		//��󻯴���
		Driver.manage().window().maximize();
		
		String Url = "http://localhost:8280/ILP/";
		
		//��ҳ��
		Driver.get(Url);
		
		//�����û���
		Driver.findElement(By.name("userInfo.userNo")).clear();
		Driver.findElement(By.name("userInfo.userNo")).sendKeys("u0201");
		
		//��������
		Driver.findElement(By.name("userInfo.password")).clear();
		Driver.findElement(By.name("userInfo.password")).sendKeys("123");
		
		//�����¼
		Driver.findElement(By.xpath("//img[@src='/ILP/images/logindl.gif']")).click();
		
		//Thread.sleep(1000);
		
		//��ʽ�ȴ�
		WebDriverWait wait = new WebDriverWait(Driver, 5);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@name='testCaseType'])[2]")));
		
		//ѡ�����ۺ�ʵ�鰴ť
		Driver.findElement(By.xpath("(//input[@name='testCaseType'])[2]")).click();
		
		//�����ѯ
		Driver.findElement(By.xpath("//img[@src='images/search.gif']")).click();
		
		//ѡ��ʵѵ����
		Driver.findElement(By.xpath("//div[@class='l-grid-row-cell-inner l-grid-row-cell-inner-fixedheight']")).click();
		
		//���ȷ��
		Driver.findElement(By.xpath("//img[@src='images/ok.gif']")).click();
		
		Thread.sleep(500);
		/*WebDriver Window = Driver.switchTo().window(CurrentHandle);
		
		CurrentHandle = Driver.getWindowHandle();
		
		System.out.println(CurrentHandle);
		
		System.out.println(Window.getTitle() + "   " + Window.getCurrentUrl());*/
			
		//������
		((JavascriptExecutor) Driver).executeScript("arguments[0].click();", Driver.findElement(By.xpath("//map[@id='Map']/area[6]")));
		//Driver.findElement(By.xpath("//map[@id='Map']/area[6]")).click();
		
		Thread.sleep(500);
		
		//������������б�
		Driver.findElement(By.xpath("//ul[@id='tree1']/li[@treedataindex='0']")).click();
		
		//���չ����Ķ�������
		Driver.findElement(By.xpath("//div[@class='l-body']/span[text()='��������']")).click();
		
		//�л�frame
		Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@src='manager/modules/orders/orders.jsp?sellerAccept=0']")));
		
		//�������
		Driver.findElement(By.xpath("//div[@id='mybarTool']/div[2]")).click();
		
		//ʹ��JS���ö�������
		((JavascriptExecutor) Driver).executeScript("document.getElementById('orderDate').value='2014-08-21'");
		
		//ʹ��JS�����ͻ�����
		((JavascriptExecutor) Driver).executeScript("document.getElementById('deliveryDate').value='2014-08-22'");
		
		//���빫˾
		Driver.findElement(By.id("companyName")).clear();
		Driver.findElement(By.id("companyName")).sendKeys("�����й�̩����Ϣ���޹�˾");
		
		//�����ַ
		Driver.findElement(By.id("deliveryAddr")).clear();
		Driver.findElement(By.id("deliveryAddr")).sendKeys("��������ɽ����ͷ���վ");
		
		//����绰
		Driver.findElement(By.id("phone")).clear();
		Driver.findElement(By.id("phone")).sendKeys("13511200021");
		
		//������ϵ��
		Driver.findElement(By.id("linkman")).clear();
		Driver.findElement(By.id("linkman")).sendKeys("zhc");
		
		//���������ϸ
		Driver.findElement(By.xpath("//img[@src='/ILP/images/add-detail.gif']")).click();
			
		//ѡ�������б�
		Select selectCargoId = new Select(Driver.findElement(By.name("cargoId")));		
		selectCargoId.selectByIndex(2);
		
//		Thread.sleep(1000);
//		selectCargoId.selectByVisibleText("CPU");
//		
//		Thread.sleep(1000);
//		selectCargoId.selectByValue("5");
		
		//��������
		Driver.findElement(By.name("quantity")).clear();
		Driver.findElement(By.name("quantity")).sendKeys("10");
		
		//ѡ��λ
		Select selectUnit = new Select(Driver.findElement(By.name("unit")));		
		selectUnit.selectByVisibleText("��");
		
		//�������ҳ��ȷ��
		Driver.findElement(By.id("saveOrderId")).click();
		
		//ѡ�񶩵���¼
		Driver.findElement(By.xpath("//table[@class='l-grid-body-table']/tbody/tr/td[1]")).click();
		
		//���ɾ��
		Driver.findElement(By.xpath("//div[@id='mybarTool']/div[4]")).click();		
		
		//���������ȷ��
		Driver.findElement(By.xpath("//div[@class='l-dialog-buttons-inner']/div[2]/div[@class='l-dialog-btn-inner']")).click();
		
		//�ٴε��ȷ��
		Driver.findElement(By.xpath("//div[@class='l-dialog-buttons-inner']/div[1]/div[@class='l-dialog-btn-inner']")).click();
		
		//�л�����frame
		Driver.switchTo().defaultContent();
		
		//�����ȫ�˳�
		Driver.findElement(By.xpath("//a[contains(text(), '��ȫ�˳�')]")).click();
		
		//���������ȷ��
		Driver.findElement(By.xpath("//div[@class='l-dialog-buttons-inner']/div[2]/div[@class='l-dialog-btn-inner']")).click();
		
		//�ر������
		Driver.close();
		
	}
	
	
	
}