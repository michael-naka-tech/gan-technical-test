#@ui
Feature: Question 2

  A stakeholder has defined new acceptance criteria for the moneygaming registration user story:

  ● Password must be at least 6 characters long with at least one number and at least one special character

  Create a BDD feature file for the registration story with scenarios to fully cover the password
  acceptance criteria using test data of your choice. The BDD scenarios should be written using the
  Gherkin language.

  Guidance:
  ● No code is required as part of this answer. Once you have completed your feature file,
  please send a single file named FIRSTNAME_LASTNAME_MG.feature

  Background:
    Given I am on the MoneyGaming homepage

  Scenario Outline: Verify that Password must be at least 6 characters long with at least one number and at least one special character

    And I click the JOIN NOW button to open the registration page

    When I enter registration details into the form
      | Title   | FirstName   | Surname   | DateOfBirth   | EmailAddress   | Telephone   | Mobile   | AddressLine1   | Address2   | City   | County   | Postcode   | Country   | Username   | Password   | ReTypePassword   | SecurityQuestion1   | Answer1   | SecurityQuestion2   | Answer2   | Currency   | BonusCode   |
      | <Title> | <FirstName> | <Surname> | <DateOfBirth> | <EmailAddress> | <Telephone> | <Mobile> | <AddressLine1> | <Address2> | <City> | <County> | <Postcode> | <Country> | <Username> | <Password> | <ReTypePassword> | <SecurityQuestion1> | <Answer1> | <SecurityQuestion2> | <Answer2> | <Currency> | <BonusCode> |

    And I check the tickbox with text - I accept the Terms and Conditions and certify that I am over the age of 18.

    And I submit the form by clicking the JOIN NOW button

    Then The password entered is <ExpectedResult>

    Examples:
      | TestScenario                       | ExpectedResult | Title | FirstName | Surname  | DateOfBirth | EmailAddress | Telephone   | Mobile      | AddressLine1   | Address2   | City   | County | Postcode | Country | Username   | Password | ReTypePassword | SecurityQuestion1                                    | Answer1  | SecurityQuestion2                    | Answer2 | Currency | BonusCode |
      | Valid 6 character Password         | Accepted       | Mr    | Shafar    | Akinbolu | 07/06/1993  | s@a.com      | 07912345678 | 02081234567 | 123 GAN Street | Gaming Way | London | Kent   | GA1 5NN  | GB      | shafar1234 | Pass1!   | Pass1!         | What is the name of your favorite childhood teacher? | Mr Henry | Who is your favorite singer or band? | Beatles | GBP      |           |
      | Password with no special character | Rejected       | Mr    | Shafar    | Akinbolu | 07/06/1993  | s@a.com      | 07912345678 | 02081234567 | 123 GAN Street | Gaming Way | London | Kent   | GA1 5NN  | GB      | shafar1234 | Pass15   | Pass15         | What is the name of your favorite childhood teacher? | Mr Henry | Who is your favorite singer or band? | Beatles | GBP      |           |
      | Password with no numbers           | Rejected       | Mr    | Shafar    | Akinbolu | 07/06/1993  | s@a.com      | 07912345678 | 02081234567 | 123 GAN Street | Gaming Way | London | Kent   | GA1 5NN  | GB      | shafar1234 | Passx!   | Passx!         | What is the name of your favorite childhood teacher? | Mr Henry | Who is your favorite singer or band? | Beatles | GBP      |           |
      | 5 character password               | Rejected       | Mr    | Shafar    | Akinbolu | 07/06/1993  | s@a.com      | 07912345678 | 02081234567 | 123 GAN Street | Gaming Way | London | Kent   | GA1 5NN  | GB      | shafar1234 | Pas5!    | Pas5!          | What is the name of your favorite childhood teacher? | Mr Henry | Who is your favorite singer or band? | Beatles | GBP      |           |
      | Valid 7 character Password         | Accepted       | Mr    | Shafar    | Akinbolu | 07/06/1993  | s@a.com      | 07912345678 | 02081234567 | 123 GAN Street | Gaming Way | London | Kent   | GA1 5NN  | GB      | shafar1234 | Pass15!  | Pass15!        | What is the name of your favorite childhood teacher? | Mr Henry | Who is your favorite singer or band? | Beatles | GBP      |           |
