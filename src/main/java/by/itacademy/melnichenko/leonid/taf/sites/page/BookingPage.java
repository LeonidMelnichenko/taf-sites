package by.itacademy.melnichenko.leonid.taf.sites.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingPage {
    private WebDriver driver;
    private String buttonSiteInOrRegisterXPath = "//*[@id='b2indexPage']/div[1]/div/header/nav[1]/div[2]/div/a";
    private String inputEmailAddressName = "username";
    private String buttonContinueWithEmailXPath = "//*[@id='root']/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button";
    private String inputPasswordXPath = "//*[@id='password']";
    private String buttonSignInXPath = "//*[@id='root']/div/div/div/div[2]/div[1]/div/div/div" +
            "/div/div/div/form/div[2]/button";

    public BookingPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickButtonSignInOrRegister(){driver.findElement(By.xpath(buttonSiteInOrRegisterXPath)).click();
    }
    public void inputEmailAddress(String email){driver.findElement(By.name(inputEmailAddressName)).sendKeys(email);}
    public void clickButtonContinueWithEmail(){driver.findElement(By.xpath(buttonContinueWithEmailXPath)).click();
    }
    public void inputPassword(String password){driver.findElement(By.xpath(inputPasswordXPath)).sendKeys(password);
    }
    public  void clickButtonSignIn(){driver.findElement(By.xpath(buttonSignInXPath)).click();
    }
}
