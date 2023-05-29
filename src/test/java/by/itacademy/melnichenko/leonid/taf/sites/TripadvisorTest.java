package by.itacademy.melnichenko.leonid.taf.sites;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TripadvisorTest {
    ChromeDriver chromeDriver;
    TripadvisorPage tripadvisorPage;
    TripadvisorStep tripadvisorStep;
    DemoFaker demoFaker;
    @BeforeEach
    public void beforetest(){
        chromeDriver = new ChromeDriver();
        tripadvisorPage = new TripadvisorPage(chromeDriver);
        tripadvisorStep = new TripadvisorStep(chromeDriver);
        demoFaker = new DemoFaker(new Faker());
        tripadvisorPage.getUrl();
    }
    @AfterEach
    public void afterTest(){
        chromeDriver.quit();
    }
    @Test
    public void EnterWithEmptyEmailAndPassword(){
        tripadvisorStep.fillLoginFormAndSubmit("", "");
    }
    @Test
    public void EnterWithUncorrectEmail(){
        tripadvisorStep.fillLoginFormAndSubmit("email");
    }
    @Test
    public void EnterWithCorrectEmail(){
        tripadvisorStep.fillLoginFormAndSubmit(demoFaker.generateFakerEmail());
    }
    @Test
    public void EnterWithCorrectEmailAndAnyPassword(){
       tripadvisorStep.fillLoginFormAndSubmit(demoFaker.generateFakerEmail(), demoFaker.generateFakerPassword());
    }
}
