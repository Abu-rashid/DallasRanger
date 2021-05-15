Feature: Sign In

@Sanity1
Scenario: Verify Web

Given Launch the "<URL>"
Then  Click SignIn
Then  Enter your E-mail
Then  Enter the Password
Then  Click sign In button





@Sanity2
Scenario: Create an accounte

Given Launch the "<URL>"
Then  Click On Sign
Then  Type Email On Block
Then  Click On Create

Then  Choose Gender Mr.
Then  Type First Name
Then  Type Last Name
Then  Type Your Email
Then  Type Your Password
Then  Select Your Day Birth
Then  Select Your Month Birth
Then  Select Your Years Birth

Then  Type Name One
Then  Type Name Two
Then  Type Your Address
Then  Type Your City
Then  Type Your State
Then  Type Zip/Postal code
Then  Type Your Country
Then  Type Mobile Phone
Then  Type Assign an address alias
Then  Click Register



@Sanity3
Scenario: Contact Information

Given Launch the "<URL>"
Then  Click On Contact Us
Then  Choose Subject Heading
Then  Type Your E-mail Address
Then  Type Order reference
Then  Type the Message
Then  Clic Send


@Sanity4
Scenario: Purchase The Items

Given Launch the "<URL>"
Then  Slid On Women
Then  Click On Blouses
Then  Mouse Over 
Then  Add To Cart
Then  Click Proceed
Then  Click Proceed Two
Then  Type Email To CheckOut
Then  Type Password To CheckOut
Then  Click SignIn To CheckOut
Then  Click Proceed Three
Then  Click Agree To The Terms
Then  Click Proceed Four
Then  Pay By Check
Then  Click Proceed Confirm Order

@tags5
Scenario: verfiy the labtop 
Given Launch the "<URL>"
Then Click on Computer









