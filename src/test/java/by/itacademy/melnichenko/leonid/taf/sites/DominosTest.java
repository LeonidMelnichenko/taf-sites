package by.itacademy.melnichenko.leonid.taf.sites;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosTest {
    ChromeDriver chromeDriver = new ChromeDriver();
    DominosPage dominosPage = new DominosPage(chromeDriver);
    @Before
    public void beforeTest(){
        chromeDriver.get("https://dominos.by/");
        dominosPage.clickButtonEnter();
    }
    @Test
    public void testEnterWithUncorrectEmailAndAnyPassword(){
        dominosPage.inputEmail("email");
        dominosPage.inputPassword(Util.generatePassword());
        dominosPage.clickButtonEnterToAccount();
    }
    @Test
    public void testEnterWithCorrectEmailAndAnyPassword(){
        dominosPage.inputEmail(Util.generateEmail());
        dominosPage.inputPassword(Util.generatePassword());
        dominosPage.clickButtonEnterToAccount();
    }
}
