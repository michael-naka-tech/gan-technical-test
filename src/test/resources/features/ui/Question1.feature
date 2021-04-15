@ui
Feature: Question 1

  In the IDE of your choice, implement automation code that does the following:

  1. Navigate to: https://moneygaming.qa.gameaccount.com/
  2. Click the JOIN NOW button to open the registration page
  3. Select a title value from the dropdown
  4. Enter your first name and surname in the form
  5. Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over
  the age of 18.'
  6. Submit the form by clicking the JOIN NOW button
  7. Validate that a validation message with text ‘This field is required’ appears under the date of
  birth box


  Guidance:
  ● Design patterns and coding best practices are encouraged.
  ● Once you have completed the test please send a link to github/cloud storage containing the
  code and any other project files you might use.

  Background:
    Given I am on the MoneyGaming homepage

  Scenario Outline: Verify a validation message with text ‘This field is required’ appears under the date of birth box

    And I click the JOIN NOW button to open the registration page

    When I enter registration details into the form
      | Title   | FirstName   | Surname   | DateOfBirth   | EmailAddress   | Telephone   | Mobile   | AddressLine1   | Address2   | City   | County   | Postcode   | Country   | Username   | Password   | ReTypePassword   | SecurityQuestion1   | Answer1   | SecurityQuestion2   | Answer2   | Currency   | BonusCode   |
      | <Title> | <FirstName> | <Surname> | <DateOfBirth> | <EmailAddress> | <Telephone> | <Mobile> | <AddressLine1> | <Address2> | <City> | <County> | <Postcode> | <Country> | <Username> | <Password> | <ReTypePassword> | <SecurityQuestion1> | <Answer1> | <SecurityQuestion2> | <Answer2> | <Currency> | <BonusCode> |

    And I check the tickbox with text - I accept the Terms and Conditions and certify that I am over the age of 18.

    And I submit the form by clicking the JOIN NOW button

    Then a validation message with text "This field is required" appears under the date of birth box

    Examples:
      | Title | FirstName | Surname  | DateOfBirth | EmailAddress | Telephone   | Mobile      | AddressLine1   | Address2   | City   | County | Postcode | Country | Username   | Password     | ReTypePassword | SecurityQuestion1                                    | Answer1  | SecurityQuestion2                    | Answer2 | Currency | BonusCode |
      | Mr    | Shafar    | Akinbolu |             |              |             |             |                |            |        |        |          |         |            |              |                |                                                      |          |                                      |         |          |           |


