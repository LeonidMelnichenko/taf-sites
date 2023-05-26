package by.itacademy.melnichenko.leonid.taf.sites;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    ChromeDriver chromeDriver;
    PizzatempoPage pizzatempoPage;
    PizzaTempoStep pizzatempoStep;
    DemoFaker demoFaker;

    @BeforeEach
    public void beforeTest(){
        chromeDriver = new ChromeDriver();
        pizzatempoPage = new PizzatempoPage(chromeDriver);
        pizzatempoStep = new PizzaTempoStep(chromeDriver);
        demoFaker = new DemoFaker(new Faker());
        pizzatempoPage.getUrl();
    }
    @AfterEach
    public void afterTest(){
        chromeDriver.quit();
    }
    @Test
    public void testEnterWithEmptyEmailAndPassword(){
        pizzatempoStep.fillLoginFormAndSubmit("", "");
    }
    @Test
    public void testEnterWithIncorrectEmail(){
        pizzatempoStep.fillLoginFormAndSubmit("email");
    }
    @Test
    public void testEnterWithEmptyEmailAndAnyPassword(){
      pizzatempoStep.fillLoginFormAndSubmit("", demoFaker.generateFakerPassword() );
    }
    @Test
    public void TestEnterWithCorrectEmailAndEmptyPassword(){
      pizzatempoStep.fillLoginFormAndSubmit(demoFaker.generateFakerEmail(), "");
    }
    @Test
    public void testEnterWithCorrectEmailAndAnyPassword(){
        pizzatempoStep.fillLoginFormAndSubmit(demoFaker.generateFakerEmail(),
                demoFaker.generateFakerPassword());
    }
}
