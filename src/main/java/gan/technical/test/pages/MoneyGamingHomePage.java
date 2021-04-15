package gan.technical.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class MoneyGamingHomePage extends PageObject {

    @FindBy(className = "newUser")
    private WebElement joinNowButton;

    public void clickJoinNowButton(){
        joinNowButton.click();
    }

    public void isLoaded(){
        joinNowButton.isDisplayed();
    }

}
