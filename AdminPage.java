package com.ibm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AdminPage{
	WebDriver driver;
	WebDriverWait wait;
   @FindBy(xpath="(//li[@class='active']/following::li/a)[1]")
   WebElement catalogEle;
   @FindBy(xpath="//*[@id='side-menu']/li[2]/ul/li[4]/a")
   WebElement productsEle;;
   @FindBy(xpath="//input[@type='search']")
   WebElement searchProduct;
   @FindBy(xpath="//*[@id='dataTableExample2']/tbody/tr/td[9]/div/button")
   WebElement actionEle;
   @FindBy(xpath="//a[text()='Delete']")
   WebElement deleteProduct;
   @FindBy(xpath="//button[text()='Yes, delete it!']")
   WebElement confirmDeleteProduct;
   @FindBy(xpath="//table[@id='dataTableExample2']/tbody/tr")
   WebElement searchAfterDeletion;
   public AdminPage(WebDriver driver,WebDriverWait wait)
   {
	   PageFactory.initElements(driver, this);
	   this.driver=driver;
	   this.wait=wait;
   }
 public void clickOnCatalog()
 {
	 catalogEle.click(); 
 }
 public void clickOnProducts()
 {
	 productsEle.click();
 }
 public void searchProductToBeDeleted(String sp)
 {
	 searchProduct.sendKeys(sp); 
 }
 public void clickOnAction()
 {
	 actionEle.click();
 }
 public void clickOnDeleteProduct()
 {
	 deleteProduct.click();
 }
 public void clickOnConfirmDeleteProduct()
 {
	 confirmDeleteProduct.click(); 
 }
 public void searchProductAfterDeletionAndVerify(String spad,String msg)
 {
	 searchProduct.sendKeys(spad);
	 Assert.assertTrue(searchAfterDeletion.getText().trim().equals(msg));
	 
 }
 
 
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
