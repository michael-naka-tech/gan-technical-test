package gan.technical.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MoneyGamingRegistrationPage extends PageObject {

    @FindBy(name = "map(title)")
    private WebElement title;

    @FindBy(name = "map(firstName)")
    private WebElement firstName;

    @FindBy(name = "map(lastName)")
    private WebElement lastName;

    @FindBy(name = "map(dobDay)")
    private WebElement dobDay;

    @FindBy(name = "map(dobMonth)")
    private WebElement dobMonth;

    @FindBy(name = "map(dobYear)")
    private WebElement dobYear;

    @FindBy(name = "map(email)")
    private WebElement email;

    @FindBy(name = "map(phone)")
    private WebElement phone;

    @FindBy(name = "map(mobile)")
    private WebElement mobile;

    @FindBy(name = "map(address1)")
    private WebElement address1;

    @FindBy(name = "map(address2)")
    private WebElement address2;

    @FindBy(name = "map(addressCity)")
    private WebElement addressCity;

    @FindBy(name = "map(stateProv)")
    private WebElement county;

    @FindBy(name = "map(postCode)")
    private WebElement postCode;

    @FindBy(name = "map(countryCode)")
    private WebElement countryCode;

    @FindBy(name = "map(userName)")
    private WebElement userName;

    @FindBy(name = "map(password)")
    private WebElement password;

    @FindBy(name = "map(passwordConfirm)")
    private WebElement passwordConfirm;

    @FindBy(name = "map(securityQuestionOne)")
    private WebElement securityQuestionOne;

    @FindBy(name = "map(securityAnswerOne)")
    private WebElement securityAnswerOne;

    @FindBy(name = "map(securityQuestionTwo)")
    private WebElement securityQuestionTwo;

    @FindBy(name = "map(securityAnswerTwo)")
    private WebElement securityAnswerTwo;

    @FindBy(name = "map(currency)")
    private WebElement currency;

    @FindBy(name = "map(bonusCode)")
    private WebElement bonusCode;

    @FindBy(id = "form")
    private WebElement joinNowButton;

    @FindBy(name = "map(terms)")
    private WebElement termsTickBox;

    @FindBy(xpath = "//label[@for=\"dob\"]")
    private WebElement dobErrorMessage;

    public void acceptTC(){
        termsTickBox.click();
    }

    public void clickJoinNowButton(){
        joinNowButton.click();
    }

    public String getDobErrorMessage(){
        return dobErrorMessage.getText();
    }

    public void isLoaded(){
        title.isDisplayed();
    }

    public void selectTitle(String value){
        Select s = new Select(title);
        s.selectByValue(value);
    }

    public void enterFirstName(String text){
        firstName.isDisplayed();
        firstName.sendKeys(text);
    }

    public void enterLastName(String text){
        lastName.isDisplayed();
        lastName.sendKeys(text);
    }

    public void selectDobDay(String value){
        Select s = new Select(dobDay);
        s.selectByValue(value);
    }

    public void selectDobMonth(String value){
        Select s = new Select(dobMonth);
        s.selectByValue(value);
    }

    public void selectDobYear(String value){
        Select s = new Select(dobYear);
        s.selectByValue(value);
    }

    public void enterEmail(String text){
        email.isDisplayed();
        email.sendKeys(text);
    }

    public void enterTelephone(String text){
        phone.isDisplayed();
        phone.sendKeys(text);
    }

    public void enterMobile(String text){
        mobile.isDisplayed();
        mobile.sendKeys(text);
    }

    public void enterAddress1(String text){
        address1.isDisplayed();
        address1.sendKeys(text);
    }

    public void enterAddress2(String text){
        address2.isDisplayed();
        address2.sendKeys(text);
    }

    public void enterAddressCity(String text){
        addressCity.isDisplayed();
        addressCity.sendKeys(text);
    }

    public void enterCounty(String text){
        county.isDisplayed();
        county.sendKeys(text);
    }

    public void enterPostCode(String text){
        postCode.isDisplayed();
        postCode.sendKeys(text);
    }

    public void selectCountry(String value){
        Select s = new Select(countryCode);
        s.selectByValue(value);
    }

    public void enterUserName(String text){
        userName.isDisplayed();
        userName.sendKeys(text);
    }

    public void enterPassword(String text){
        password.isDisplayed();
        password.click();
        password.sendKeys(text);
    }

    public void enterPasswordConfirm(String text){
        passwordConfirm.isDisplayed();
        passwordConfirm.click();
        passwordConfirm.sendKeys(text);
    }

    public void selectSecurityQuestionOne(String value){
        Select s = new Select(securityQuestionOne);
        s.selectByValue(value);
    }

    public void enterSecurityAnswerOne(String text) {
        securityAnswerOne.isDisplayed();
        securityAnswerOne.sendKeys(text);
    }

    public void selectSecurityQuestionTwo(String value){
        Select s = new Select(securityQuestionTwo);
        s.selectByValue(value);
    }

    public void enterSecurityAnswerTwo(String text) {
        securityAnswerTwo.isDisplayed();
        securityAnswerTwo.sendKeys(text);
    }

    public void selectCurrency(String value){
        Select s = new Select(currency);
        s.selectByValue(value);
    }

    public void enterBonusCode(String text) {
        bonusCode.isDisplayed();
        bonusCode.sendKeys(text);
    }
}
