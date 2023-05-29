package by.itacademy.melnichenko.leonid.taf.sites;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosTest {
    ChromeDriver chromeDriver;
    DominosPage dominosPage;
    DominosStep dominosStep;
    DemoFaker demoFaker;

    @BeforeEach
    public void beforeTest(){
        chromeDriver = new ChromeDriver();
        dominosPage = new DominosPage(chromeDriver);
        dominosStep = new DominosStep(chromeDriver);
        demoFaker = new DemoFaker(new Faker());
        dominosPage.getUrl();
    }
    @AfterEach
    public void afterTest(){
        chromeDriver.quit();
    }
    @Test
    public void testEnterWithUncorrectEmailAndAnyPassword(){
        dominosStep.fillLoginFormAndEnterToAccount("email", demoFaker.generateFakerPassword());
    }
    @Test
    public void testEnterWithCorrectEmailAndAnyPassword(){
        dominosStep.fillLoginFormAndEnterToAccount(demoFaker.generateFakerEmail(), demoFaker.generateFakerEmail());
    }
}
