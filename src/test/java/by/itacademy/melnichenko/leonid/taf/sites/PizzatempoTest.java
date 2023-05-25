package by.itacademy.melnichenko.leonid.taf.sites;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    ChromeDriver chromeDriver;
    PizzatempoPage pizzatempoPage;

    PizzaTempoStep pizzaTempoStep;
    @Before
    public void beforeTest(){
        chromeDriver = new ChromeDriver();
        pizzatempoPage = new PizzatempoPage(chromeDriver);
        pizzaTempoStep = new PizzaTempoStep(chromeDriver);
        chromeDriver.get("https://www.pizzatempo.by/");
    }
    @After
    public void afterTest(){
        pizzatempoPage.clickSetButtonFindSubmit();
    }
    @Test
    public void testEnterWithEmptyEmailAndPassword(){
        pizzaTempoStep.fillLoginFormAndSubmit("", "");
    }
    @Test
    public void testEnterWithUncorrectEmail(){
        pizzatempoPage.setInputEmail("email");
    }
    @Test
    public void testEnterWithEmptyEmailAndAnyPassword(){
        pizzatempoPage.setInputEmail("");
        pizzatempoPage.setInputPassword(Util.generatePassword());
    }
    @Test
    public void TestEnterWithCorrectEmailAndEmptyPassword(){
        pizzatempoPage.setInputEmail(Util.generateEmail());
        pizzatempoPage.setInputPassword("");
    }
    @Test
    public void testEnterWithCorrectEmailAndAnyPassword(){
        pizzatempoPage.setInputEmail(Util.generateEmail());
        pizzatempoPage.setInputPassword(Util.generatePassword());
    }
}
