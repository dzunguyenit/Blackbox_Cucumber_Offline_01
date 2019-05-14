@EditCustomer 
Feature: Edit customer 
	As an automation tester
  I want to edit customer
  So that I want to verify all fields is correct message

Background: User to navigate to Edit customer page 
	Given I open "Edit Customer" page 
	
@TC_01_Create_NameCannotEmpty 
Scenario: Edit customer with empty customer id 
	When I input key tab to customer id 
	Then Verify successfully with message "Customer ID is required" 
	
	#  @TC_01_Edit_CustomerIdCanotEmpty
	#  Scenario: Edit customer with empty customer ID
	#    When I input with variable data "TabKeys" to "//*[@name='cusid']" textbox
	#    Then Verify successfully with message "Customer ID is required"
	
@TC_02_03_Edit_CustomerIdCannotBeNumberic 
Scenario Outline: Create customer with input numeric value name field 
	When I input data "<Customer ID>" to customer id 
	Then Verify successfully with message "<Message>" 
	
	Examples: 
		| Customer ID | Message |
		| 1236Acc   | Characters are not allowed  | 
		| name!@#   | Special characters are not allowed  |
		
		
		#		@TC_02_Edit_CustomerIdCannotBeNumberic 
		#		Scenario: Edit customer with input numeric value customer ID field 
		#			When I input with data "1236Acc" to "//*[@name='cusid']" textbox 
		#			Then Verify successfully with message "Characters are not allowed" 
		#			
		#		@TC_03_Edit_CustomerIdCannotHaveSpecialCharacter 
		#		Scenario: Edit customer with input special value customer ID field 
		#			When I input with data "name!@#" to "//*[@name='cusid']" textbox 
		#			Then Verify successfully with message "Special characters are not allowed" 
		
		@TC_04_Edit_ValidCustomerId 
		Scenario: Edit customer with input special value customer ID field 
			When I input customer id 
			And I click to submit button 
			
			#		@TC_04_Edit_ValidCustomerId 
			#		Scenario: Edit customer with input special value customer ID field 
			#			When I input with variable data "userID" to "//*[@name='cusid']" textbox 
			#			And I click to "//*[@name='AccSubmit']" button 
			
		@TC_08_Edit_AddressCannotEmpty 
		Scenario: Edit customer with input special value customer ID field 
			When I input customer id 
			And I click to submit button 
			And I update key tab to address 
			Then Verify successfully with message "Address Field must not be blank" 
			
		@TC_09_Edit_CityCannotEmpty 
		Scenario: Edit customer with input special value customer ID field 
			When I input customer id 
			And I click to submit button 
			And I update key tab to city 
			Then Verify successfully with message "City Field must not be blank" 
			
		@TC_10_11_Edit_CityCannotBeNumberic 
		Scenario Outline: Create customer with input numeric value name field 
			When I input customer id 
			And I click to submit button 
			When I update data "<City>" to city 
			Then Verify successfully with message "<Message>" 
			
			Examples: 
				| City | Message |
				| 123456  | Numbers are not allowed  | 
				| name!@#   | Special characters are not allowed  |
				
				#				@TC_10_Edit_CityCannotBeNumberic 
				#				Scenario: Edit customer with input special value customer ID field 
				#					When I input customer id 
				#					And I click to submit button 
				#					When I input with variable data "userID" to "//*[@name='cusid']" textbox 
				#					And I click to "//*[@name='AccSubmit']" button 
				#					When I input with data "123456" to "//*[@name='city']" textbox 
				#					Then Verify successfully with message "Numbers are not allowed" 
				#					
				#				@TC_11_Edit_CityCannotHaveSpecialCharacter 
				#				Scenario: Edit customer with input special value customer ID field 
				#					When I input with variable data "userID" to "//*[@name='cusid']" textbox 
				#					And I click to "//*[@name='AccSubmit']" button 
				#					When I input with data "name!@#" to "//*[@name='city']" textbox 
				#					Then Verify successfully with message "Special characters are not allowed" 
				
				@TC_12_Edit_StateCannotEmpty 
				Scenario: Edit customer with input special value customer ID field 
					When I input customer id 
					And I click to submit button 
					And I update key tab to state 
					Then Verify successfully with message "State must not be blank" 
					
					
				@TC_13_14_Edit_StateCannotBeNumberic 
				Scenario Outline: Create customer with input numeric value name field 
					When I input customer id 
					And I click to submit button 
					When I update data "<State>" to state 
					Then Verify successfully with message "<Message>" 
					
					Examples: 
						| State | Message |
						| 123456  | Numbers are not allowed  | 
						| name!@#   | Special characters are not allowed  |
						
						
						#						@TC_13_Edit_StateCannotBeNumberic 
						#						Scenario: Edit customer with input special value customer ID field 
						#							When I input with variable data "userID" to "//*[@name='cusid']" textbox 
						#							And I click to "//*[@name='AccSubmit']" button 
						#							When I input with data "123456" to "//*[@name='state']" textbox 
						#							Then Verify successfully with message "Numbers are not allowed" 
						#							
						#						@TC_14_Edit_StateCannotHaveSpecialCharacter 
						#						Scenario: Edit customer with input special value customer ID field 
						#							When I input with variable data "userID" to "//*[@name='cusid']" textbox 
						#							And I click to "//*[@name='AccSubmit']" button 
						#							When I input with data "name!@#" to "//*[@name='state']" textbox 
						#							Then Verify successfully with message "Special characters are not allowed" 
						
						@TC_15_17_18_Edit_PinMustBeNumeric 
						Scenario Outline: Create customer with input numeric value name field 
							When I input customer id 
							And I click to submit button 
							When I update data "<PIN>" to pin 
							Then Verify successfully with message "<Message>" 
							
							Examples: 
								| PIN | Message |
								| PIN123  | Characters are not allowed  | 
								| 123  | PIN Code must have 6 Digits  |
								| name!@#  | Special characters are not allowed  |
								
								#								@TC_15_Edit_PinMustBeNumeric 
								#								Scenario: Edit customer with input special value customer ID field 
								#									When I input with variable data "userID" to "//*[@name='cusid']" textbox 
								#									And I click to "//*[@name='AccSubmit']" button 
								#									When I input with data "PIN123" to "//*[@name='pinno']" textbox 
								#									Then Verify successfully with message "Characters are not allowed" 
								
								@TC_16_Edit_PinCannotEmpty 
								Scenario: Edit customer with input special value customer ID field 
									When I input customer id 
									And I click to submit button 
									And I update key tab to pin 
									Then Verify successfully with message "PIN Code must not be blank" 
									
									#								@TC_17_Edit_PinMustHave6Digits 
									#								Scenario: Edit customer with input special value customer ID field 
									#									When I input with variable data "userID" to "//*[@name='cusid']" textbox 
									#									And I click to "//*[@name='AccSubmit']" button 
									#									When I input with data "123" to "//*[@name='pinno']" textbox 
									#									Then Verify successfully with message "PIN Code must have 6 Digits" 
									
									#								@TC_18_Edit_PinCannotHaveSpecialCharacter 
									#								Scenario: Edit customer with input special value customer ID field 
									#									When I input with variable data "userID" to "//*[@name='cusid']" textbox 
									#									And I click to "//*[@name='AccSubmit']" button 
									#									When I input with data "name!@#" to "//*[@name='pinno']" textbox 
									#									Then Verify successfully with message "Special characters are not allowed" 
									
								@TC_19_Edit_TelephoneCannotEmpty 
								Scenario: Edit customer with input special value customer ID field 
									When I input customer id 
									And I click to submit button 
									And I update key tab to phone 
									Then Verify successfully with message "Mobile no must not be blank" 
									
								@TC_20_Edit_TelephoneCannotHaveSpecialCharacter 
								Scenario Outline: Create customer with input numeric value name field 
									When I input customer id 
									And I click to submit button 
									When I update data "<Phone>" to phone 
									Then Verify successfully with message "<Message>" 
									
									Examples: 
										| Phone | Message |
										| name!@#  | Special characters are not allowed  | 
										
										#										@TC_20_Edit_TelephoneCannotHaveSpecialCharacter 
										#										Scenario: Edit customer with input special value customer ID field 
										#											When I input with variable data "userID" to "//*[@name='cusid']" textbox 
										#											And I click to "//*[@name='AccSubmit']" button 
										#											When I input with data "name!@#" to "//*[@name='telephoneno']" textbox 
										#											Then Verify successfully with message "Special characters are not allowed" 
										
										@TC_21_Edit_EmailCannotEmpty 
										Scenario: Edit customer with input special value customer ID field 
											When I input customer id 
											And I click to submit button 
											And I update key tab to email 
											Then Verify successfully with message "Email-ID must not be blank" 
											
										@TC_22_Edit_EmailIncorrectFormat 
										Scenario Outline: 
											Edit customer with input special value customer ID field 
										
											When I input customer id 
											And I click to submit button 
											When I update data "<Email>" to email 
											Then Verify successfully with message "<Message>" 
											
											Examples: 
												| Email | Message |
												| Guru99@ | Email-ID is not valid  | 
												
												
												@TC_23_Edit_EmailCannotHaveBlankSpace 
												Scenario: Edit customer with input special value customer ID field 
													When I input customer id 
													And I click to submit button 
													And I update key space to email 
													Then Verify successfully with message "First character can not have space" 
