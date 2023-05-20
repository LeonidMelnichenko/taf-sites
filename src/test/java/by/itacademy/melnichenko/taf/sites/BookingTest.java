package by.itacademy.melnichenko.taf.sites;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class BookingTest {
    @Test
    public void TestEnterWithEmptyEmail(){
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        edgeDriver.get("https://www.booking.com/");
        BookingPage bookingPage = new BookingPage(edgeDriver);

        bookingPage.buttonSignInOrRegisterClick();
        bookingPage.inputEmailAddress("");
        bookingPage.buttonContinueWithEmailClick();
    }
    @Test
    public void TestEnterWithUncorrectEmail(){
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        edgeDriver.get("https://www.booking.com/");
        BookingPage bookingPage = new BookingPage(edgeDriver);

        bookingPage.buttonSignInOrRegisterClick();
        bookingPage.inputEmailAddress("email");
        bookingPage.buttonContinueWithEmailClick();
    }

    @Test
    public void TestEnterWithCorrectEmail(){
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        edgeDriver.get("https://www.booking.com/");
        BookingPage bookingPage = new BookingPage(edgeDriver);

        bookingPage.buttonSignInOrRegisterClick();
        bookingPage.inputEmailAddress("test@mail");
        bookingPage.buttonContinueWithEmailClick();
    }

    @Test
    public void TestEnterWithCorrectEmailAndEmptyPassword(){
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        edgeDriver.get("https://www.booking.com/");
        BookingPage bookingPage = new BookingPage(edgeDriver);

        bookingPage.buttonSignInOrRegisterClick();
        bookingPage.inputEmailAddress("test@mail");
        bookingPage.buttonContinueWithEmailClick();
        bookingPage.inputPassword("");
        bookingPage.buttonSignInClick();
    }

    @Test
    public void TestEnterWithCorrectEmailAndAnyPassword(){
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        edgeDriver.get("https://www.booking.com/");
        BookingPage bookingPage = new BookingPage(edgeDriver);

        bookingPage.buttonSignInOrRegisterClick();
        bookingPage.inputEmailAddress("test@mail");
        bookingPage.buttonContinueWithEmailClick();
        bookingPage.inputPassword("1213454dfgdsg24242");
        bookingPage.buttonSignInClick();
    }
}
