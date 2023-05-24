package by.itacademy.melnichenko.leonid.taf.sites;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BookingTest {
    ChromeDriver chromeDriver = new ChromeDriver();
    BookingPage bookingPage = new BookingPage(chromeDriver);
    @Before
    public void beforeTest(){
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.get("https://www.booking.com/");
        bookingPage.clickButtonSignInOrRegister();
    }
    @Test
    public void testEnterWithEmptyEmail(){
        bookingPage.inputEmailAddress("");
        bookingPage.clickButtonContinueWithEmail();
    }
    @Test
    public void testEnterWithUncorrectEmail(){
        bookingPage.inputEmailAddress("email");
        bookingPage.clickButtonContinueWithEmail();
    }
    @Test
    public void testEnterWithCorrectEmail(){
        bookingPage.inputEmailAddress(Util.generateEmail());
        bookingPage.clickButtonContinueWithEmail();
    }
    @Test
    public void testEnterWithCorrectEmailAndEmptyPassword(){
        bookingPage.inputEmailAddress(Util.generateEmail());
        bookingPage.clickButtonContinueWithEmail();
        bookingPage.inputPassword("");
        bookingPage.clickButtonSignIn();
    }
    @Test
    public void testEnterWithCorrectEmailAndAnyPassword(){
        bookingPage.inputEmailAddress(Util.generateEmail());
        bookingPage.clickButtonContinueWithEmail();
        bookingPage.inputPassword(Util.generatePassword());
        bookingPage.clickButtonSignIn();
    }
}
