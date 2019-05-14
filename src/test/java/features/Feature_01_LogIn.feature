@LogInGuruBank 
Feature: Payment feature 
	As an automation tester
  I want a payment function 
  So that I want to make sure payment correctly

@CreateAccountAndLogin 
Scenario: Create account, login and verify login successfully 
	Given I navigate to Guru bank and click Here link 
	When I input email "randomEmail" 
	And I click to submit account 
	And I get email and password 
	And I navigate to Log In page "http://demo.guru99.com/v4/" 
	And I log in system 
	Then Verify successfully with message "Welcome To Manager" 
	
	#@newCustomer 
	#Scenario Outline: Create new Customer and get NewCustomerID 
	#	Given I open "New Customer" page 
	#	When I input with data "<CustomerName>" to customer name 
	#	When I input with data "<DateOfBirth>" to date of birth 
	#	When I input with data "<Address>" to address 
	#	When I input with data "<City>" to city 
	#	When I input with data "<State>" to state 
	#	When I input with data "<PIN>" to pin 
	#	When I input with data "<Phone>" to phone 
	#	When I input with data "<Email>" to email 
	#	When I input with data "<Password>" to password 
	#	And I click submit button 
	#	Then Verify successfully with message "Customer Registered Successfully!!!" 
	#	And I get text UserID "//*[contains(text(),'Customer ID')]/following-sibling::td" 
	#	
	#	Examples: 
	#		| CustomerName | DateOfBirth | Address | City    | State   | PIN    | Phone      | Email       | Password   |
	#		| Neymar Jr    | 26/01/1993  | Da nang | Da nang | Da nang | 466250 | 4555442476 | randomEmail | 1234567890 |
	#		
	#		@editCustomer 
	#		Scenario Outline: Edit Customer 
	#			Given I open "Edit Customer" page 
	#			When I input with variable data "userID" to "//*[@name='cusid']" textbox 
	#			And I click to "//*[@name='AccSubmit']" button 
	#			When I input with data "<addressUpdate>" to "//*[@name='addr']" textbox 
	#			When I input with data "<cityUpdate>" to "//*[@name='city']" textbox 
	#			When I input with data "<stateUpdate>" to "//*[@name='state']" textbox 
	#			When I input with data "<PINUpdate>" to "//*[@name='pinno']" textbox 
	#			When I input with data "<mobileUpdate>" to "//*[@name='telephoneno']" textbox 
	#			When I input with data "<emailUpdate>" to "//*[@name='emailid']" textbox 
	#			And I click to "//*[@name='sub']" button 
	#			Then Verify successfully with message "Customer details updated Successfully!!!" 
	#			
	#			Examples: 
	#				| addressUpdate | cityUpdate | stateUpdate | PINUpdate | mobileUpdate | emailUpdate |
	#				| Ha Noi        | Ha Noi     | Ha Noi      |    123456 |   1234567890 | randomEmail |
	
	#  @newAccount
	#  Scenario: Create new account
	#    Given I open "New Account" page
	#    When I input with variable data "userID" to "//*[@name='cusid']" textbox
	#    And Select with value "Current" item in dynamic dropdow "//*[contains(@name,'selaccount')]"
	#    And I input with data "50000" to "//*[@name='inideposit']" textbox
	#    And I click to "//*[@name='button2']" button
	#    And I get text dynamic label "//*[contains(text(),'Account ID')]/following-sibling::td"
	#    Then Verify successfully with message "//*[contains(text(),'Account Generated Successfully!!!')]"
	#    And Verify deposit with value "50000"
	#
	#  @addDeposit
	#  Scenario: Add deposit
	#    Given I open "Deposit" page
	#    When I input with variable data "accountID" to "//*[@name='accountno']" textbox
	#    And I input with variable data "depositAdd" to "//*[@name='ammount']" textbox
	#    And I input with data "Deposit" to "//*[@name='desc']" textbox
	#    And I click to "//*[@name='AccSubmit']" button
	#    Then Verify successfully with message "//*[contains(text(),'Transaction details of Deposit for Account')]"
	#    And Verify Current balance is "55000"
	#
	#  @withDraw
	#  Scenario: WithDraw money
	#    Given I open "Withdrawal" page
	#    When I input with variable data "accountID" to "//*[@name='accountno']" textbox
	#    And I input with variable data "monneyWithDraw" to "//*[@name='ammount']" textbox
	#    And I input with data "Withdraw" to "//*[@name='desc']" textbox
	#    And I click to "//*[@name='AccSubmit']" button
	#    Then Verify successfully with message "//*[contains(text(),'Transaction details of Withdrawal for Account')]"
	#    #after withdraw money: "40000"
	#    And Verify money after withdraw is "//*[contains(text(),'Current Balance')]/following-sibling::td"
	
	#  @fundTransfer
	#  Scenario: Fund Transfer
	#    Given I open "Fund Transfer" page
	#    When I input with variable data "accountID" to "//*[@name='payersaccount']" textbox
	#    And I input with variable data "accountIDPayee" to "//*[@name='payeeaccount']" textbox
	#    And I input with data "10000" to "//*[@name='ammount']" textbox
	#    And I input with data "Transfer" to "//*[@name='desc']" textbox
	#    And I click to "//*[@name='AccSubmit']" button
	#    Then Verify successfully with message "//*[contains(text(),'Fund Transfer Details')]"
	#    # Money transfer: 10000
	#    And Verify money transfer is "//*[contains(text(),'Amount')]/following-sibling::td"
	#
	#  @balanceEnquiry
	#  Scenario: Balance enquiry
	#    Given I open "Balance Enquiry" page
	#    When I input with variable data "accountID" to "//*[@name='accountno']" textbox
	#    And I click to "//*[@name='AccSubmit']" button
	#    # Current transfer: 30000
	#    Then Verify current balance is "//*[contains(text(),'Balance')]/following-sibling::td"
