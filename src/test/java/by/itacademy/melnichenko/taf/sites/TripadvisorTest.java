package by.itacademy.melnichenko.taf.sites;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class TripadvisorTest {
    @Test
    public void EnterWithEmptyEmailAndPassword(){
        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tripadvisor.com/");

        TripadvisorPage tripadvisorPage = new TripadvisorPage(driver);
        tripadvisorPage.signInButtonClick();
        tripadvisorPage.switchToIframe();
        tripadvisorPage.buttonContinueWithEmailClick();
        tripadvisorPage.inputEmailAddressTo("");
        tripadvisorPage.inputPasswordTo("");
        tripadvisorPage.buttonSignInApplyTo();
    }
    @Test
    public void EnterWithIncorrectEmail(){
        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tripadvisor.com/");

        TripadvisorPage tripadvisorPage = new TripadvisorPage(driver);
        tripadvisorPage.signInButtonClick();
        tripadvisorPage.switchToIframe();
        tripadvisorPage.buttonContinueWithEmailClick();
        tripadvisorPage.inputEmailAddressTo("email");
        tripadvisorPage.inputPasswordTo(""); // непонятно должен ли passwod быть пустым в этом тесте
        tripadvisorPage.buttonSignInApplyTo();
    }
    @Test
    public void EnterWithCorrectEmail(){
        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tripadvisor.com/");

        TripadvisorPage tripadvisorPage = new TripadvisorPage(driver);
        tripadvisorPage.signInButtonClick();
        tripadvisorPage.switchToIframe();
        tripadvisorPage.buttonContinueWithEmailClick();
        tripadvisorPage.inputEmailAddressTo("test@email");
        tripadvisorPage.inputPasswordTo("");
        tripadvisorPage.buttonSignInApplyTo();
    }
    @Test
    public void EnterWithCorrectEmailAndAnyPassword(){
        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tripadvisor.com/");

        TripadvisorPage tripadvisorPage = new TripadvisorPage(driver);
        tripadvisorPage.signInButtonClick();
        tripadvisorPage.switchToIframe();
        tripadvisorPage.buttonContinueWithEmailClick();
        tripadvisorPage.inputEmailAddressTo("test@mail");
        tripadvisorPage.inputPasswordTo("123446gghghf646");
        tripadvisorPage.buttonSignInApplyTo();
    }
}
