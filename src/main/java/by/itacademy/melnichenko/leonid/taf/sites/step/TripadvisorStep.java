package by.itacademy.melnichenko.leonid.taf.sites.step;

import by.itacademy.melnichenko.leonid.taf.sites.page.TripadvisorPage;
import org.openqa.selenium.WebDriver;

public class TripadvisorStep {

    TripadvisorPage tripadvisorPage;

    public TripadvisorStep(WebDriver driver) {
        this.tripadvisorPage = new TripadvisorPage(driver);
    }
    public void fillLoginFormAndSubmit(String emal, String password){
        tripadvisorPage.clickSignInButton();
        tripadvisorPage.switchToIframe();
        tripadvisorPage.clickButtonContinueWithEmail();
        tripadvisorPage.inputEmailAddressTo(emal);
        tripadvisorPage.inputPasswordTo(password);
        tripadvisorPage.buttonSignInApplyTo();
    }
    public void fillLoginFormAndSubmit(String emal){
        tripadvisorPage.clickSignInButton();
        tripadvisorPage.switchToIframe();
        tripadvisorPage.clickButtonContinueWithEmail();
        tripadvisorPage.inputEmailAddressTo(emal);
        tripadvisorPage.buttonSignInApplyTo();
    }
}
