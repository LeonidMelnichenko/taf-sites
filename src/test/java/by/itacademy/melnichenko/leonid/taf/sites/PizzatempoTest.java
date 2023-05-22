package by.itacademy.melnichenko.leonid.taf.sites;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import by.itacademy.melnichenko.leonid.taf.sites.PizzatempoPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    @Test
    public void TestEnterWithEmptyEmailAndPassword(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.pizzatempo.by/");
        PizzatempoPage pizzatempoPage = new PizzatempoPage(chromeDriver);

        pizzatempoPage.setInputEmail("");
        pizzatempoPage.setInputPassword("");
        pizzatempoPage.setButtonFindSudmitClick();
    }
    @Test
    public void TestEnterWithUncorrectEmail(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.pizzatempo.by/");
        PizzatempoPage pizzatempoPage = new PizzatempoPage(chromeDriver);

        pizzatempoPage.setInputEmail("email");
        pizzatempoPage.setButtonFindSudmitClick();
    }
    @Test
    public void TestEnterWithEmptyEmailAndAnyPassword(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.pizzatempo.by/");
        PizzatempoPage pizzatempoPage = new PizzatempoPage(chromeDriver);

        pizzatempoPage.setInputEmail("");
        pizzatempoPage.setInputPassword("123456");
        pizzatempoPage.setButtonFindSudmitClick();
    }
    @Test
    public void TestEnterWithCorrectEmailAndEmptyPassword(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.pizzatempo.by/");
        PizzatempoPage pizzatempoPage = new PizzatempoPage(chromeDriver);

        pizzatempoPage.setInputEmail("test@mail.com");
        pizzatempoPage.setInputPassword("");
        pizzatempoPage.setButtonFindSudmitClick();
    }
    @Test
    public void TestEnterWithCorrectEmailAndAnyPassword(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.pizzatempo.by/");
        PizzatempoPage pizzatempoPage = new PizzatempoPage(chromeDriver);

        pizzatempoPage.setInputEmail("test@mail.com");
        pizzatempoPage.setInputPassword("123456");
        pizzatempoPage.setButtonFindSudmitClick();
    }
}
