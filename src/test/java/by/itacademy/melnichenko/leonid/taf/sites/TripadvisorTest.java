package by.itacademy.melnichenko.leonid.taf.sites;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TripadvisorTest {
    ChromeDriver chromeDriver = new ChromeDriver();
    TripadvisorPage tripadvisorPage = new TripadvisorPage(chromeDriver);
    @Before
    public void beforetest(){
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.get("https://www.tripadvisor.com/");
        tripadvisorPage.clickSignInButton();
        tripadvisorPage.switchToIframe();
        tripadvisorPage.clickButtonContinueWithEmail();
    }
    @After
    public void afterTest(){
        tripadvisorPage.buttonSignInApplyTo();
    }
    @Test
    public void EnterWithEmptyEmailAndPassword(){
        tripadvisorPage.inputEmailAddressTo("");
        tripadvisorPage.inputPasswordTo("");
    }
    @Test
    public void EnterWithUncorrectEmail(){
        tripadvisorPage.inputEmailAddressTo("email");
    }
    @Test
    public void EnterWithCorrectEmail(){
        tripadvisorPage.inputEmailAddressTo(Util.generateEmail());
    }
    @Test
    public void EnterWithCorrectEmailAndAnyPassword(){
        tripadvisorPage.inputEmailAddressTo(Util.generateEmail());
        tripadvisorPage.inputPasswordTo(Util.generatePassword());
    }
}
