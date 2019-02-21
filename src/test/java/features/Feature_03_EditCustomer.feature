@editCustomer
Feature: Edit customer
  As an automation tester
  I want to edit customer
  So that I want to verify all fields is correct message

  Background: User to navigate to Edit customer page
    Given I open "Edit Customer" page

  @TC_01_Edit_CustomerIdCanotEmpty
  Scenario: Edit customer with empty customer ID
    When I input with variable data "TabKeys" to "//*[@name='cusid']" textbox
    Then Verify successfully with message "//*[contains(text(),'Customer ID is required')]"

  @TC_02_Edit_CustomerIdCannotBeNumberic
  Scenario: Edit customer with input numeric value customer ID field
    When I input with data "1236Acc" to "//*[@name='cusid']" textbox
    Then Verify successfully with message "//*[contains(text(),'Characters are not allowed')]"

  @TC_03_Edit_CustomerIdCannotHaveSpecialCharacter
  Scenario: Edit customer with input special value customer ID field
    When I input with data "name!@#" to "//*[@name='cusid']" textbox
    Then Verify successfully with message "//*[contains(text(),'Special characters are not allowed')]"

  @TC_04_Edit_ValidCustomerId
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button

  @TC_08_Edit_AddressCannotEmpty
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with variable data "TabKeys" to "//*[@name='addr']" textbox
    Then Verify successfully with message "//*[contains(text(),'Address Field must not be blank')]"

  @TC_09_Edit_CityCannotEmpty
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with variable data "TabKeys" to "//*[@name='city']" textbox
    Then Verify successfully with message "//*[contains(text(),'City Field must not be blank')]"

  @TC_10_Edit_CityCannotBeNumberic
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with data "123456" to "//*[@name='city']" textbox
    Then Verify successfully with message "//*[contains(text(),'Numbers are not allowed')]"

  @TC_11_Edit_CityCannotHaveSpecialCharacter
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with data "name!@#" to "//*[@name='city']" textbox
    Then Verify successfully with message "//*[contains(text(),'Special characters are not allowed')]"

  @TC_12_Edit_StateCannotEmpty
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with variable data "TabKeys" to "//*[@name='state']" textbox
    Then Verify successfully with message "//*[contains(text(),'State must not be blank')]"

  @TC_13_Edit_StateCannotBeNumberic
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with data "123456" to "//*[@name='state']" textbox
    Then Verify successfully with message "//*[contains(text(),'Numbers are not allowed')]"

  @TC_14_Edit_StateCannotHaveSpecialCharacter
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with data "name!@#" to "//*[@name='state']" textbox
    Then Verify successfully with message "//*[contains(text(),'Special characters are not allowed')]"

  @TC_15_Edit_PinMustBeNumeric
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with data "PIN123" to "//*[@name='pinno']" textbox
    Then Verify successfully with message "//*[contains(text(),'Characters are not allowed')]"

  @TC_16_Edit_PinCannotEmpty
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with variable data "TabKeys" to "//*[@name='pinno']" textbox
    Then Verify successfully with message "//*[contains(text(),'PIN Code must not be blank')]"

  @TC_17_Edit_PinMustHave6Digits
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with data "123" to "//*[@name='pinno']" textbox
    Then Verify successfully with message "//*[contains(text(),'PIN Code must have 6 Digits')]"

  @TC_18_Edit_PinCannotHaveSpecialCharacter
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with data "name!@#" to "//*[@name='pinno']" textbox
    Then Verify successfully with message "//*[contains(text(),'Special characters are not allowed')]"

  @TC_19_Edit_TelephoneCannotEmpty
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with variable data "TabKeys" to "//*[@name='telephoneno']" textbox
    Then Verify successfully with message "//*[contains(text(),'Mobile no must not be blank')]"

  @TC_20_Edit_TelephoneCannotHaveSpecialCharacter
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with data "name!@#" to "//*[@name='telephoneno']" textbox
    Then Verify successfully with message "//*[contains(text(),'Special characters are not allowed')]"

  @TC_21_Edit_EmailCannotEmpty
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with variable data "TabKeys" to "//*[@name='emailid']" textbox
    Then Verify successfully with message "//*[contains(text(),'Email-ID must not be blank')]"

  @TC_22_Edit_EmailIncorrectFormat
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with data "Guru99@" to "//*[@name='emailid']" textbox
    Then Verify successfully with message "//*[contains(text(),'Email-ID is not valid')]"

  @TC_23_Edit_EmailCannotHaveBlankSpace
  Scenario: Edit customer with input special value customer ID field
    When I input with variable data "userID" to "//*[@name='cusid']" textbox
    And I click to "//*[@name='AccSubmit']" button
    When I input with variable data "SpaceKeys" to "//*[@name='emailid']" textbox
    Then Verify successfully with message "//*[contains(text(),'First character can not have space')]"
