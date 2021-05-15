package com.test.PageLocator;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.utill.TestBase;

public class HomePageLocator extends TestBase{
	
	
	 public HomePageLocator() {
		
				PageFactory.initElements(driver,this);
	 }			
				
	//Login In Account>>			
			
				
		@FindBy(how=How.XPATH,using="//a[@class='login']")
		 public WebElement SignInbutton;
		
		@FindBy(how=How.ID,using="email")
		 public WebElement enterEmail;
		
		@FindBy(how=How.XPATH,using="//input[@id='passwd']")
		 public WebElement enterpassword;
		
		@FindBy(how=How.XPATH,using="//button[@id='SubmitLogin']")
		public WebElement clicksubmet;
		
		
	// To purches>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		@FindBy(how=How.XPATH,using="//input[@class='search_query form-control ac_input']")
		public WebElement SearchBlock;
		
		@FindBy(how=How.XPATH,using="//button[@name='submit_search']")
		public WebElement Searchbutton;
		
		@FindBy(how=How.XPATH,using="//a[@id='color_22']")
		public WebElement SelectItem;
		
		@FindBy(how=How.XPATH,using="//button[@name='Submit']")
		public WebElement AddToCart;
		
		@FindBy(how=How.XPATH,using="//a[@class='btn btn-default button button-medium']")
		public WebElement ClickCheckOut;
		

	//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<CREATE an Account>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		
		
		@FindBy(how=How.XPATH,using="//a[@title='Log in to your customer account']")
		public WebElement SignLog;
		
		@FindBy(how=How.XPATH,using="//input[@name='email_create']")
		public WebElement TypeYourEmail;
		
		@FindBy(how=How.XPATH,using="//button[@name='SubmitCreate']")
		public WebElement ClickCreateButton;
		
	//<<<<<<<<<<<<<<<<<<<<<<<<<<<<Your Information >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
		
		@FindBy(how=How.ID,using="id_gender1")
		public WebElement GenderMr;
		
		
		@FindBy(how=How.ID,using="customer_firstname")
		public WebElement FirstName;
		
		@FindBy(how=How.ID,using="customer_lastname")
		public WebElement LastName;
		
		@FindBy(how=How.XPATH,using="//input[@id='email']")
		public WebElement Email;
		
		@FindBy(how=How.XPATH,using="//input[@id='passwd']")
		public WebElement Password;
		
		@FindBy(how=How.XPATH,using="//select[@id='days']")
		public WebElement DayBirth;
		
		@FindBy(how=How.XPATH,using="//select[@id='months']")
		public WebElement MonthsBirth;
		
		@FindBy(how=How.XPATH,using="//select[@id='years']")
		public WebElement YearsBirth;
		
	//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Your Address>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
		
		@FindBy(how=How.ID,using="firstname")
		public WebElement NameOne;
		
		@FindBy(how=How.ID,using="lastname")
		public WebElement NameTwo;
		
		@FindBy(how=How.XPATH,using="//input[@id='address1']")
		public WebElement Address;
		
		@FindBy(how=How.XPATH,using="//input[@id='city']")
		public WebElement City;
		
		@FindBy(how=How.XPATH,using="//select[@name='id_state']")
		public WebElement ChooseState;
		
		@FindBy(how=How.XPATH,using="//input[@id='postcode']")
		public WebElement PostalCode;
		
		@FindBy(how=How.XPATH,using="//select[@id='id_country']")
		public WebElement ChooseCountry;
		
		@FindBy(how=How.XPATH,using="//input[@name='phone_mobile']")
		public WebElement CellPhone;
		
		@FindBy(how=How.XPATH,using="//input[@id='alias']")
		public WebElement AssignAlias;
		
		@FindBy(how=How.XPATH,using="//button[@id='submitAccount']")
		public WebElement ClickRegistor;
		
//<<<<<<<<<<<<<<<<<<<<<<<< ""Contact Us"">>>>>>>>>>>>>>>>>>>>>>>>
		
		@FindBy(how=How.XPATH,using="//a[text()='Contact us']")
		public WebElement Contact;
		
		@FindBy(how=How.XPATH,using="//select[@id='id_contact']")
		public WebElement ChooseSubjectHeading;
		
		@FindBy(how=How.XPATH,using="//input[@id='email']")
		public WebElement TypeEmail;
		
		@FindBy(how=How.XPATH,using="//input[@id='id_order']")
		public WebElement TypeOrderReference;
		
		@FindBy(how=How.XPATH,using="//textarea[@id='message']")
		public WebElement Message;
		
		@FindBy(how=How.XPATH,using="//span[text()='Send']")
		public WebElement ClickSend;
		
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<""PURCHASE ITEMS"">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		@FindBy(how=How.XPATH,using="//a[@title='Women']")
		public WebElement SlideWomenDrop;
		
		@FindBy(how=How.XPATH,using="//a[@title='Blouses']")
		public WebElement BlousesClick;
		
		@FindBy(how=How.XPATH,using="//div[@class='right-block']")
		public WebElement Mouse;
		
		@FindBy(how=How.XPATH,using="//a[@title='Add to cart']")
		public WebElement Cart;
		
		@FindBy(how=How.XPATH,using="//a[@title='Proceed to checkout']")
		public WebElement Proceed;
		
		@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")
		public WebElement Proceed2;
		
		@FindBy(how=How.ID,using="email")
		public WebElement EmailCheckout;
		
		@FindBy(how=How.ID,using="passwd")
		public WebElement PasswordCheckOut;
		
		@FindBy(how=How.XPATH,using="//i[@class='icon-lock left']")
		public WebElement SignInCheckOut;
		
		@FindBy(how=How.NAME,using="processAddress")
		public WebElement Proceed3;
		
		@FindBy(how=How.ID,using="cgv")
		public WebElement AgreeTerms;
		
		@FindBy(how=How.NAME,using="processCarrier")
		public WebElement ProceedFour;
		
		@FindBy(how=How.XPATH,using="//a[@title='Pay by check.']")
		public WebElement PayCheck;
		
		@FindBy(how=How.XPATH,using="//span[text()='I confirm my order']")
		public WebElement ConfirmOrder;
		
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"AMAZON BAY">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		@FindBy(how=How.XPATH,using="//a[text()='Computers']")
		public WebElement ComputerBay;
		
	}
	

 
