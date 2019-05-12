@createCustomer
Feature: Create customer
  As an automation tester
  I want to create new customer
  So that I want to verify all fields is correct message

  Background: User to navigate to Create customer page
    Given I open "New Customer" page

  @TC_01_Create_NameCannotEmpty
  Scenario: Create customer with empty customer name
    When I input with variable data "TabKeys" to "//*[@name='name']" textbox
    Then Verify successfully with message "Customer name must not be blank"

  @TC_02_Create_NameCannotBeNumberic
  Scenario: Create customer with input numeric value name field
    When I input with data "123456" to "//*[@name='name']" textbox
    Then Verify successfully with message "Numbers are not allowed"

  @TC_03_Create_NameCannotHaveSpecialCharacter
  Scenario: Create customer with input special value name field
    When I input with data "name!@#" to "//*[@name='name']" textbox
    Then Verify successfully with message "Special characters are not allowed"

  @TC_04_Create_NameCannotFirstCharacterBlankSpace
  Scenario: Create customer with input first character blank space name field
    When I input with variable data "SpaceKeys" to "//*[@name='name']" textbox
    Then Verify successfully with message "First character can not have space"

  @TC_05_Create_AddressCannotEmpty
  Scenario: Create customer with empty address field
    When I input with variable data "TabKeys" to "//*[@name='addr']" textbox
    Then Verify successfully with message "Address Field must not be blank"

  @TC_06_Create_AddressCannotFirstCharacterBlankSpace
  Scenario: Create customer with input first character blank space address field
    When I input with variable data "SpaceKeys" to "//*[@name='addr']" textbox
    Then Verify successfully with message "First character can not have space"

  @TC_07_Create_CityCannotEmpty
  Scenario: Create customer with empty address field
    When I input with variable data "TabKeys" to "//*[@name='city']" textbox
    Then Verify successfully with message "City Field must not be blank"

  @TC_08_Create_CityCannotBeNumberic
  Scenario: Create customer with input numeric value city field
    When I input with data "123456" to "//*[@name='city']" textbox
    Then Verify successfully with message "Numbers are not allowed"

  @TC_09_Create_CityCannotHaveSpecialCharacter
  Scenario: Create customer with input special value city field
    When I input with data "name!@#" to "//*[@name='city']" textbox
    Then Verify successfully with message "Special characters are not allowed"

  @TC_10_Create_CityCannotFirstCharacterBlankSpace
  Scenario: Create customer with input first character blank space city field
    When I input with variable data "SpaceKeys" to "//*[@name='city']" textbox
    Then Verify successfully with message "First character can not have space"

  @TC_11_Create_StateCannotEmpty
  Scenario: Create customer with empty state field
    When I input with variable data "TabKeys" to "//*[@name='state']" textbox
    Then Verify successfully with message "State must not be blank"

  @TC_12_Create_StateCannotBeNumberic
  Scenario: Create customer with input numeric value state field
    When I input with data "123456" to "//*[@name='state']" textbox
    Then Verify successfully with message "Numbers are not allowed"

  @TC_13_Create_StateCannotHaveSpecialCharacter
  Scenario: Create customer with input special value state field
    When I input with data "name!@#" to "//*[@name='state']" textbox
    Then Verify successfully with message "Special characters are not allowed"

  @TC_14_Create_StateCannotFirstCharacterBlankSpace
  Scenario: Create customer with input first character blank space state field
    When I input with variable data "SpaceKeys" to "//*[@name='pinno']" textbox
    Then Verify successfully with message "First character can not have space"

  @TC_15_Create_PinMustBeNumeric
  Scenario: Create customer with input char value PIN field
    When I input with data "ABC" to "//*[@name='pinno']" textbox
    Then Verify successfully with message "Characters are not allowed"

  @TC_16_Create_PinCannotEmpty
  Scenario: Create customer with empty PIN field
    When I input with variable data "TabKeys" to "//*[@name='pinno']" textbox
    Then Verify successfully with message "PIN Code must not be blank"

  @TC_17_Create_PinMustHave6Digits
  Scenario: Create customer with input char value PIN field
    When I input with data "123" to "//*[@name='pinno']" textbox
    Then Verify successfully with message "PIN Code must have 6 Digits"

  @TC_18_Create_PinCannotHaveSpecialCharacter
  Scenario: Create customer with input special value PIN field
    When I input with data "name!@#" to "//*[@name='pinno']" textbox
    Then Verify successfully with message "Special characters are not allowed"

  @TC_19_Create_PinCannotFirstCharacterBlankSpace
  Scenario: Create customer with input first character blank space PIN field
    When I input with variable data "SpaceKeys" to "//*[@name='pinno']" textbox
    Then Verify successfully with message "First character can not have space"

  @TC_20_Create_PinCannotHaveBlankSpace
  Scenario: Create customer with input char value PIN field
    When I input with data "12 345" to "//*[@name='pinno']" textbox
    Then Verify successfully with message "Characters are not allowed"

  @TC_21_Create_TelephoneCannotEmpty
  Scenario: Create customer with empty telephone field
    When I input with variable data "TabKeys" to "//*[@name='telephoneno']" textbox
    Then Verify successfully with message "Mobile no must not be blank"

  @TC_22_Create_TelephoneCannotFirstCharacterBlankSpace
  Scenario: Create customer with input first character blank space telephone field
    When I input with variable data "SpaceKeys" to "//*[@name='telephoneno']" textbox
    Then Verify successfully with message "First character can not have space"

  @TC_23_Create_TelephoneCannotHaveBlankSpace
  Scenario: Create customer with input char value telephone field
    When I input with data "012 11122" to "//*[@name='telephoneno']" textbox
    Then Verify successfully with message "Characters are not allowed"

  @TC_24_Create_TelephoneCannotHaveSpecialCharacter
  Scenario: Create customer with input special value telephone field
    When I input with data "@#98" to "//*[@name='telephoneno']" textbox
    Then Verify successfully with message "Special characters are not allowed"

  @TC_25_Create_EmailCannotEmpty
  Scenario: Create customer with empty email field
    When I input with variable data "TabKeys" to "//*[@name='emailid']" textbox
    Then Verify successfully with message "Email-ID must not be blank"

  @TC_26_Create_EmailIncorrectFormat
  Scenario: Create customer with input special value telephone field
    When I input with data "Guru99@" to "//*[@name='emailid']" textbox
    Then Verify successfully with message "Email-ID is not valid"

  @TC_27_Create_EmailCannotHaveBlankSpace
  Scenario: Create customer with input first character blank space PIN field
    When I input with variable data "SpaceKeys" to "//*[@name='emailid']" textbox
    Then Verify successfully with message "First character can not have space"
