package StepDef;




import com.test.PageAction.HomePageAction;
import com.test.PageLocator.HomePageLocator;
import com.test.utill.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class StepDeff extends TestBase{
	
	HomePageAction  homePageAction = new HomePageAction();

	
	@Given("^Launch the \"([^\"]*)\"$")
	public void launch_the(String arg1) throws Throwable {
	 getURL("url");
	}
	
	@Then("^Click SignIn$")
	public void click_SignIn() throws Throwable {
	  homePageAction.ClickSignIn();
	}
	
	@Then("^Enter your E-mail$")
	public void enter_your_E_mail() throws Throwable {
	  homePageAction.EnteryourEmail();
	}

	@Then("^Enter the Password$")
	public void enter_the_Password() throws Throwable {
	  homePageAction.EnterthePassword();
	}

	@Then("^Click sign In button$")
	public void click_sign_In_button() throws Throwable {
	  homePageAction.ClicksignInbutton();
	}
	
	

	



	
//Create an Account>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	
	@Then("^Click On Sign$")
	public void click_On_Sign() throws Throwable {
	   homePageAction.ClickOnSign();
	}

	@Then("^Type Email On Block$")
	public void type_Email_On_Block() throws Throwable {
	  homePageAction.TypeEmailOnBlock();
	}

	@Then("^Click On Create$")
	public void click_On_Create() throws Throwable {
	    homePageAction.ClickOnCreate();
	}
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<Your Information>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	

@Then("^Choose Gender Mr\\.$")
public void choose_Gender_Mr() throws Throwable {
   homePageAction.ChooseGenderMr();
}


	@Then("^Type First Name$")
	public void type_First_Name() throws Throwable {
	    homePageAction.TypeFirstName();
	}

	@Then("^Type Last Name$")
	public void type_Last_Name() throws Throwable {
	   homePageAction.TypeLastName();
	}

	@Then("^Type Your Email$")
	public void type_Your_Email() throws Throwable {
	   homePageAction.TypeYourEmail();
	}

	@Then("^Type Your Password$")
	public void type_Your_Password() throws Throwable {
	    homePageAction.TypeYourPassword();
	}

	@Then("^Select Your Day Birth$")
	public void select_Your_Day_Birth() throws Throwable {
	    homePageAction.SelectYourDayBirth();
	}

	@Then("^Select Your Month Birth$")
	public void select_Your_Month_Birth() throws Throwable {
	   homePageAction.SelectYourMonthBirth();
	}

	@Then("^Select Your Years Birth$")
	public void select_Your_Years_Birth() throws Throwable {
	   homePageAction.SelectYourYearsBirth();
	}
	
//<<<<<<<<<<<<<<<<<<<<<<<<<<Your Address>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	@Then("^Type Name One$")
	public void type_Name_One() throws Throwable {
	   homePageAction.TypeNameOne();
	}

	@Then("^Type Name Two$")
	public void type_Name_Two() throws Throwable {
	    homePageAction.TypeNameTwo();
	}

	@Then("^Type Your Address$")
	public void type_Your_Address() throws Throwable {
	   homePageAction.TypeYourAddress();
	}

	@Then("^Type Your City$")
	public void type_Your_City() throws Throwable {
	    homePageAction.TypeYourCity();
	}

	@Then("^Type Your State$")
	public void type_Your_State() throws Throwable {
	    homePageAction.TypeYourState();
	}

	@Then("^Type Zip/Postal code$")
	public void type_Zip_Postal_code() throws Throwable {
	   homePageAction.TypeZipPostalcode();
	}

	@Then("^Type Your Country$")
	public void type_Your_Country() throws Throwable {
	   homePageAction.TypeYourCountry();
	}

	@Then("^Type Mobile Phone$")
	public void type_Mobile_Phone() throws Throwable {
	   homePageAction.TypeMobilePhone();
	}

	@Then("^Type Assign an address alias$")
	public void type_Assign_an_address_alias() throws Throwable {
	   homePageAction.TypeAssignanaddressalias();
	}

	@Then("^Click Register$")
	public void click_Register() throws Throwable {
	    homePageAction.ClickRegister();
	}

//<<<<<<<<<<<<<<<<<<<<<<<<<Contact Us>>>>>>>>>>>>>>>>>>>>>>>>>
	

@Then("^Click On Contact Us$")
public void click_On_Contact_Us() throws Throwable {
   homePageAction.ClickOnContactUs();
}

@Then("^Choose Subject Heading$")
public void choose_Subject_Heading() throws Throwable {
	homePageAction.ChooseSubjectHeading();
   
}

@Then("^Type Your E-mail Address$")
public void type_Your_E_mail_Address() throws Throwable {
   homePageAction.TypeYourEmailAddress();
}

@Then("^Type Order reference$")
public void type_Order_reference() throws Throwable {
   homePageAction.TypeOrderreference();
}

@Then("^Type the Message$")
public void type_the_Message() throws Throwable {
   homePageAction.TypetheMessage();
}

@Then("^Clic Send$")
public void clic_Send() throws Throwable {
    homePageAction.ClickSend();
}

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<""PURCHASE ITEMS"">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

@Then("^Slid On Women$")
public void slid_On_Women() throws Throwable {
   homePageAction.SlidOnWomen();
}

@Then("^Click On Blouses$")
public void click_On_Blouses() throws Throwable {
    homePageAction.ClickOnBlouses();
}

@Then("^Mouse Over$")
public void mouse_Over() throws Throwable {
   
	homePageAction.MouseOver();
}


@Then("^Add To Cart$")
public void add_To_Cart() throws Throwable {
	homePageAction.ToCart();
   }

@Then("^Click Proceed$")
public void click_Proceed() throws Throwable {
  homePageAction.ClickProceed();
}

@Then("^Click Proceed Two$")
public void click_Proceed_Two() throws Throwable {
    homePageAction.ClickProceedTwo();
}

@Then("^Type Email To CheckOut$")
public void type_Email_To_CheckOut() throws Throwable {
   homePageAction.TypeEmailToCheckOut();
}

@Then("^Type Password To CheckOut$")
public void type_Password_To_CheckOut() throws Throwable {
    homePageAction.TypePasswordToCheckOut();
}

@Then("^Click SignIn To CheckOut$")
public void click_SignIn_To_CheckOut() throws Throwable {
   homePageAction.ClickSignInToCheckOut();
}

@Then("^Click Proceed Three$")
public void click_Proceed_Three() throws Throwable {
   homePageAction.ClickProceedThree();
}

@Then("^Click Agree To The Terms$")
public void click_Agree_To_The_Terms() throws Throwable {
    homePageAction.ClickAgreeToTheTerms();
}

@Then("^Click Proceed Four$")
public void click_Proceed_Four() throws Throwable {
   homePageAction.ClickProceedFour();
}

@Then("^Pay By Check$")
public void pay_By_Check() throws Throwable {
   homePageAction.PayByCheck();
}

@Then("^Click Proceed Confirm Order$")
public void click_Proceed_Confirm_Order() throws Throwable {
   homePageAction.ClickProceedConfirmOrder();
}

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"AMAZON VERIFY">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


@Then("^Click on Computer$")
public void click_on_Computer() throws Throwable {
	
	homePageAction.ClickonComputer();
   
}











}
