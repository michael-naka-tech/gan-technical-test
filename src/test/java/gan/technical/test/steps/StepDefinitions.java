package gan.technical.test.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gan.technical.test.pages.MoneyGamingHomePage;
import gan.technical.test.pages.MoneyGamingRegistrationPage;
import gan.technical.test.utils.PropertyReader;

import java.io.IOException;
import java.util.Map;
import cucumber.api.DataTable;
import org.junit.Assert;


public class StepDefinitions {

    MoneyGamingHomePage homePage;
    MoneyGamingRegistrationPage registrationPage;


    @Given("^I am on the MoneyGaming homepage$")
    public void iAmOnMoneyGamingHomePage() throws IOException {
        homePage.openUrl(PropertyReader.getPropValues("url"));
        homePage.isLoaded();
    }

    @Given("^I click the JOIN NOW button to open the registration page$")
    public void iClickTheJOINNOWButtonToOpenTheRegistrationPage() {
        homePage.clickJoinNowButton();
        registrationPage.isLoaded();
    }

    @When("^I enter registration details into the form$")
    public void iEnterRegistrationDetailsIntoTheForm(DataTable dataTable){
        for (Map<String, String> data : dataTable.asMaps(String.class, String.class)){
            registrationPage.selectTitle(data.get("Title"));
            registrationPage.enterFirstName(data.get("FirstName"));
            registrationPage.enterLastName(data.get("Surname"));

            String dob = data.get("DateOfBirth");

            if(dob.length() == 8) {
                String[] dobArray = dob.split("/", 0);
                registrationPage.selectDobDay(dobArray[0]);
                registrationPage.selectDobMonth(dobArray[1]);
                registrationPage.selectDobYear(dobArray[2]);
            }

            registrationPage.enterEmail(data.get("EmailAddress"));
            registrationPage.enterTelephone(data.get("Telephone"));
            registrationPage.enterMobile(data.get("Mobile"));
            registrationPage.enterAddress1(data.get("AddressLine1"));
            registrationPage.enterAddress2(data.get("Address2"));
            registrationPage.enterAddressCity(data.get("City"));
            registrationPage.enterCounty(data.get("County"));
            registrationPage.enterPostCode(data.get("Postcode"));
            registrationPage.selectCountry(data.get("Country"));
            registrationPage.enterUserName(data.get("Username"));
            registrationPage.enterPassword(data.get("Password"));
            registrationPage.enterPasswordConfirm(data.get("ReTypePassword"));
            registrationPage.selectSecurityQuestionOne(data.get("SecurityQuestion1"));
            registrationPage.enterSecurityAnswerOne(data.get("Answer1"));
            registrationPage.selectSecurityQuestionTwo(data.get("SecurityQuestion2"));
            registrationPage.enterSecurityAnswerTwo(data.get("Answer2"));
            registrationPage.selectCurrency(data.get("Currency"));
            registrationPage.enterBonusCode(data.get("BonusCode"));

        }
    }

    @When("^I check the tickbox with text - I accept the Terms and Conditions and certify that I am over the age of 18.$")
    public void iAcceptTermsAndConditions() {
        registrationPage.acceptTC();
    }

    @When("^I submit the form by clicking the JOIN NOW button$")
    public void iSubmitTheForm() {
        registrationPage.clickJoinNowButton();
    }

    @Then("^a validation message with text \"([^\"]*)\" appears under the date of birth box$")
    public void isDobErrorMessageAsExpected(String expected) {
        String actual = registrationPage.getDobErrorMessage();
        System.out.println("Actual: " + actual);
        System.out.println("Expected: " + expected);
        Assert.assertEquals(expected, actual);


    }

}