package com.test.PageAction;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.thread.ThreadTimeoutException;

import com.test.PageLocator.HomePageLocator;
import com.test.utill.TestBase;

public class HomePageAction extends TestBase   {
	

	HomePageLocator  homePageLocator = new HomePageLocator();
	public void  ClickSignIn() {
		homePageLocator.SignInbutton.click();
	}
	
	public void EnteryourEmail(){
		homePageLocator.enterEmail.sendKeys("bakri32@gmail.com");
		 
	}
	
	public void EnterthePassword() {
		homePageLocator.enterpassword.sendKeys("automation");
	}
	
	public void ClicksignInbutton() {
		
		
		homePageLocator.clicksubmet.click();
	}
	
	// Purchase Item>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	public void SearchBlock() {
		
	homePageLocator.SearchBlock.sendKeys("summer dresses");	
	}
	
	public void Searchbutton() {
		homePageLocator.Searchbutton.click();
		
	}
	
	public void SelectItem() {
		homePageLocator.SelectItem.click();
	
		
	}
	
	public void  AddToCart() {
		
		homePageLocator.AddToCart.click();
	}
	
	public void ClickCheckOut() {
		
		homePageLocator.ClickCheckOut.click();
	}
	
	//Create an Account>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 
	
	
		public void ClickOnSign() {
			
			homePageLocator.SignLog.click();
		}
		
		public void TypeEmailOnBlock() {
			homePageLocator.TypeYourEmail.sendKeys("bakri32@gmail.com");
		}
		
		public void ClickOnCreate() {
			homePageLocator.ClickCreateButton.click();
		}
	
	//Your Information>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		public void ChooseGenderMr() throws Exception {
			Thread.sleep(7000);
		homePageLocator.GenderMr.click();
		
		}
		
		
		public void TypeFirstName() {
			
			homePageLocator.FirstName.sendKeys("Next");
		}
		
		public void TypeLastName() {
			homePageLocator.LastName.sendKeys("Tech");
		}
		
		public void TypeYourEmail() {
			homePageLocator.Email.clear();
			homePageLocator.Email.sendKeys("bakri34@gmail.com");
		}
		
		public void TypeYourPassword() {
			homePageLocator.Password.sendKeys("automation_33");
		}
		
		public void SelectYourDayBirth() {
			Select day=new Select(driver.findElement(By.xpath("//select[@id='days']")));
			day.selectByValue("2");
		}
		
		public void SelectYourMonthBirth() {
			Select months=new Select(driver.findElement(By.xpath("//select[@id='months']")));
			months.selectByValue("11");
		}
		
		public void SelectYourYearsBirth() {
			Select Years=new Select(driver.findElement(By.xpath("//select[@id='years']")));
			Years.selectByValue("1985");
		}
	//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Your Address>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
		public void TypeNameOne() {
			homePageLocator.NameOne.sendKeys("Next One");
		}
		
		public void TypeNameTwo() {
			homePageLocator.NameTwo.sendKeys("Tech Two");
		}
		
		public void TypeYourAddress() {
			homePageLocator.Address.sendKeys("2214 W walnut Hill Ln");
		}
		
		public void TypeYourCity() {
			homePageLocator.City.sendKeys("Irving");
		}
		
		public void TypeYourState() {
			Select state=new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
			state.selectByVisibleText("Texas");
		}
		
		public void TypeZipPostalcode() {
			homePageLocator.PostalCode.sendKeys("75038");
		}
		
		public void TypeYourCountry() {
			Select country=new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
			country.selectByVisibleText("United States");
		}
		
		public void  TypeMobilePhone() {
			homePageLocator.CellPhone.sendKeys("9729838165");
		}
		
		public void TypeAssignanaddressalias() {
			homePageLocator.AssignAlias.sendKeys("hfhbjnluh");
		}
		
		public void ClickRegister() {
			homePageLocator.ClickRegistor.click();
		}
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<""CONTACT Us"">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		public void ClickOnContactUs() {
			homePageLocator.Contact.click();
		}
		
		public void ChooseSubjectHeading() {
			homePageLocator.ChooseSubjectHeading.click();
			Select sbj=new Select(driver.findElement(By.xpath("//select[@id='id_contact']")));
			sbj.selectByVisibleText("Customer service");
		}
		
		public void TypeYourEmailAddress(){
			homePageLocator.TypeEmail.sendKeys("bakri32@gmail.com");
		}
		
		public void TypeOrderreference() {
			homePageLocator.TypeOrderReference.sendKeys("T-shirt");
		}
		
		public void TypetheMessage() {
			homePageLocator.Message.sendKeys("Nice T-shit");
		}
		
		public void ClickSend() {
			homePageLocator.ClickSend.click();
		}
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<""Purchase Items"">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>		
		public void SlidOnWomen() {
			
			Actions sld = new Actions(driver);
			
			sld.moveToElement(driver.findElement(By.xpath("//a[@title='Women']"))).build().perform();
			
		}
		
		public void ClickOnBlouses() {
			homePageLocator.BlousesClick.click();
		}
		
		public void MouseOver() {
			Actions act = new Actions(driver);
			
			act.moveToElement(homePageLocator.Mouse).click().build().perform();
		}
		
		public void ToCart() {
			homePageLocator.Cart.click();
			
		}
		
		public void ClickProceed() throws Exception {
			Thread.sleep(6000);
			homePageLocator.Proceed.click();
		}
		
		public void ClickProceedTwo() {
			
			homePageLocator.Proceed2.click();
		}
		
		public void TypeEmailToCheckOut() {
			homePageLocator.EmailCheckout.sendKeys("bakri32@gmail.com");
		}
		
		public void TypePasswordToCheckOut() {
			
			homePageLocator.PasswordCheckOut.sendKeys("automation");
		}
		
		public void ClickSignInToCheckOut() {
			homePageLocator.SignInCheckOut.click();
		}
		
		public void ClickProceedThree() {
			homePageLocator.Proceed3.click();
		}
		
		public void ClickAgreeToTheTerms() {
			homePageLocator.AgreeTerms.click();
		}
		
		public void ClickProceedFour() {
			
			homePageLocator.ProceedFour.click();
		}
		
		public void PayByCheck() {
			homePageLocator.PayCheck.click();
		}
		
		public void ClickProceedConfirmOrder() {
			
			homePageLocator.ConfirmOrder.click();
		}
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"AMAZONBAY">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		public void ClickonComputer() {
			homePageLocator.ComputerBay.click();
		}
}
