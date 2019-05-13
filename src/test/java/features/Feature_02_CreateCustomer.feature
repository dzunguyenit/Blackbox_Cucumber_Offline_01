@createCustomer 
Feature: Create customer 
	As an automation tester
  I want to create new customer
  So that I want to verify all fields is correct message

Background: User to navigate to Create customer page 
	Given I open "New Customer" page 
	
@TC_01_Create_NameCannotEmpty 
Scenario: Create customer with empty customer name 
	When I input key tab to customer name 
	Then Verify successfully with message "Customer name must not be blank" 
	
@TC_02_03_Create_NameCannotBeNumberic 
Scenario Outline: Create customer with input numeric value name field 
	When I input data "<Customer Name>" to customer name 
	Then Verify successfully with message "<Message>" 
	
	Examples: 
		| Customer Name | Message |
		| 123456   | Numbers are not allowed  | 
		| name!@#   | Special characters are not allowed  | 
		
		@TC_04_Create_NameCannotFirstCharacterBlankSpace 
		Scenario: Create customer with input first character blank space name field 
			When I input key space to customer name 
			Then Verify successfully with message "First character can not have space" 
			
		@TC_05_Create_AddressCannotEmpty 
		Scenario: Create customer with empty address field 
			When I input key tab to address 
			Then Verify successfully with message "Address Field must not be blank" 
			
		@TC_06_Create_AddressCannotFirstCharacterBlankSpace 
		Scenario: Create customer with input first character blank space address field 
			When I input key space to address 
			Then Verify successfully with message "First character can not have space" 
			
		@TC_07_Create_CityCannotEmpty 
		Scenario: Create customer with empty address field 
			When I input key tab to city 
			Then Verify successfully with message "City Field must not be blank" 
			
		@TC_08_09_Create_CityCannotBeNumberic 
		Scenario Outline: Create customer with input numeric value name field 
			When I input data "<City>" to city 
			Then Verify successfully with message "<Message>" 
			
			Examples: 
				| City | Message |
				| 123456   | Numbers are not allowed  | 
				| name!@#   | Special characters are not allowed  | 
				
				@TC_10_Create_CityCannotFirstCharacterBlankSpace 
				Scenario: Create customer with input first character blank space city field 
					When I input key space to city 
					Then Verify successfully with message "First character can not have space" 
					
				@TC_11_Create_StateCannotEmpty 
				Scenario: Create customer with empty state field 
					When I input key tab to state 
					Then Verify successfully with message "State must not be blank" 
					
				@TC_12_13_Create_StateCannotBeNumberic 
				Scenario Outline: Create customer with input numeric value name field 
					When I input data "<State>" to state 
					Then Verify successfully with message "<Message>" 
					
					Examples: 
						| State | Message |
						| 123456   | Numbers are not allowed  | 
						| name!@#   | Special characters are not allowed  | 
						
						
						@TC_14_Create_StateCannotFirstCharacterBlankSpace 
						Scenario: 
							Create customer with input first character blank space state field 
							When I input key space to pin 
							Then Verify successfully with message "First character can not have space" 
							
							
						@TC_15_17_18_Create_StateCannotBeNumberic 
						Scenario Outline: Create customer with input numeric value name field 
							When I input data "<PIN>" to pin 
							Then Verify successfully with message "<Message>" 
							
							Examples: 
								| PIN | Message |
								| ABC   | Characters are not allowed  | 
								| 123   | PIN Code must have 6 Digits | 
								| name!@#   | Special characters are not allowed | 
								
								
								@TC_16_Create_PinCannotEmpty 
								Scenario: Create customer with empty PIN field 
									When I input key tab to pin 
									Then Verify successfully with message "PIN Code must not be blank" 
									
									
									#@TC_19_Create_PinCannotFirstCharacterBlankSpace 
									#Scenario: Create customer with input first character blank space PIN field 
									#	When I input with variable data "SpaceKeys" to "//*[@name='pinno']" textbox 
									#	Then Verify successfully with message "First character can not have space" 
									#	
									#@TC_20_Create_PinCannotHaveBlankSpace 
									#Scenario: Create customer with input char value PIN field 
									#	When I input with data "12 345" to "//*[@name='pinno']" textbox 
									#	Then Verify successfully with message "Characters are not allowed" 
									#	
									#@TC_21_Create_TelephoneCannotEmpty 
									#Scenario: Create customer with empty telephone field 
									#	When I input with variable data "TabKeys" to "//*[@name='telephoneno']" textbox 
									#	Then Verify successfully with message "Mobile no must not be blank" 
									#	
									#@TC_22_Create_TelephoneCannotFirstCharacterBlankSpace 
									#Scenario: Create customer with input first character blank space telephone field 
									#	When I input with variable data "SpaceKeys" to "//*[@name='telephoneno']" textbox 
									#	Then Verify successfully with message "First character can not have space" 
									#	
									#@TC_23_Create_TelephoneCannotHaveBlankSpace 
									#Scenario: Create customer with input char value telephone field 
									#	When I input with data "012 11122" to "//*[@name='telephoneno']" textbox 
									#	Then Verify successfully with message "Characters are not allowed" 
									#	
									#@TC_24_Create_TelephoneCannotHaveSpecialCharacter 
									#Scenario: Create customer with input special value telephone field 
									#	When I input with data "@#98" to "//*[@name='telephoneno']" textbox 
									#	Then Verify successfully with message "Special characters are not allowed" 
									#	
									#@TC_25_Create_EmailCannotEmpty 
									#Scenario: Create customer with empty email field 
									#	When I input with variable data "TabKeys" to "//*[@name='emailid']" textbox 
									#	Then Verify successfully with message "Email-ID must not be blank" 
									#	
									#@TC_26_Create_EmailIncorrectFormat 
									#Scenario: Create customer with input special value telephone field 
									#	When I input with data "Guru99@" to "//*[@name='emailid']" textbox 
									#	Then Verify successfully with message "Email-ID is not valid" 
									#	
									#@TC_27_Create_EmailCannotHaveBlankSpace 
									#Scenario: Create customer with input first character blank space PIN field 
									#	When I input with variable data "SpaceKeys" to "//*[@name='emailid']" textbox 
									#	Then Verify successfully with message "First character can not have space" 
									
									#		@TC_28_CreateCustomerSuccessfully 
									#		Scenario Outline: Create new Customer and get NewCustomerID 
									#			Given I open "New Customer" page 
									#			When I input with data "<CustomerName>" to customer name 
									#			When I input with data "<DateOfBirth>" to date of birth 
									#			When I input with data "<Address>" to address 
									#			When I input with data "<City>" to city 
									#			When I input with data "<State>" to state 
									#			When I input with data "<PIN>" to pin 
									#			When I input with data "<Phone>" to phone 
									#			When I input with data "<Email>" to email 
									#			When I input with data "<Password>" to password 
									#			And I click submit button 
									#			Then Verify successfully with message "Customer Registered Successfully!!!" 
									#			And I get text UserID "Customer ID" 
									#			
									#			Examples: 
									#				| CustomerName | DateOfBirth | Address | City    | State   | PIN    | Phone      | Email       | Password   |
									#				| Neymar Jr    | 10/10/1993  | Da nang | Da nang | Da nang | 466250 | 4555442476 | randomEmail | 1234567890 |
