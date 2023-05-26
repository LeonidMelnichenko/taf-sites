package by.itacademy.melnichenko.leonid.taf.sites;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosTest {
    ChromeDriver chromeDriver = new ChromeDriver();
    DominosPage dominosPage = new DominosPage(chromeDriver);
    @BeforeEach
    public void beforeTest(){
        chromeDriver.get("https://dominos.by/");
        dominosPage.clickButtonEnter();
    }
    @AfterEach
    public void afterTest(){
        dominosPage.clickButtonEnterToAccount();
    }
    @Test
    public void testEnterWithUncorrectEmailAndAnyPassword(){
        dominosPage.inputEmail("email");
        dominosPage.inputPassword(Util.generatePassword());
    }
    @Test
    public void testEnterWithCorrectEmailAndAnyPassword(){
        dominosPage.inputEmail(Util.generateEmail());
        dominosPage.inputPassword(Util.generatePassword());
    }
}
