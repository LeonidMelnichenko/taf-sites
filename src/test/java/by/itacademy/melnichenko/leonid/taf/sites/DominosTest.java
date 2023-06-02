package by.itacademy.melnichenko.leonid.taf.sites;

import by.itacademy.melnichenko.leonid.taf.sites.page.DominosPage;
import by.itacademy.melnichenko.leonid.taf.sites.step.DominosStep;
import by.itacademy.melnichenko.leonid.taf.sites.utils.DemoFaker;
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
        chromeDriver.manage().window().maximize();
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
