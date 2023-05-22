package by.itacademy.melnichenko.leonid.taf.sites;

import by.itacademy.melnichenko.leonid.taf.sites.DominosPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosTest {
    @Test
    public void TestEnterWithUncorrectEmailAndAnyPassword(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://dominos.by/");
        DominosPage dominosPage = new DominosPage(chromeDriver);

        dominosPage.buttonEnterClick();
        dominosPage.inputEmail("email");
        dominosPage.inputPassword("123456");
        dominosPage.buttonEnterToAccountClick();
    }

    public void TestEnterWithCorrectEmailAndAnyPassword(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://dominos.by/");
        DominosPage dominosPage = new DominosPage(chromeDriver);

        dominosPage.buttonEnterClick();
        dominosPage.inputEmail("test@mail.com");
        dominosPage.inputPassword("123456");
        dominosPage.buttonEnterToAccountClick();
    }
}
