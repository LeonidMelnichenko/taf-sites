package by.itacademy.melnichenko.leonid.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TripadvisorPage {
    WebDriver driver;
    String buttonSignInXPath = "//*[@id='lithium-root']/header/div/nav/div/div[2]/a[3]";
    String buttonContinueWithEmailXpath = "//*[@id='ssoButtons']/button";
    String inputEmailAddressXpath = "//*[@id='regSignIn.email']";
    String inputPasswordXpath = "//*[@id='regSignIn.password']";
    String buttonSignInApplyXpath = "//*[@id='regSignIn']/div[4]/button[1]";
    String loginRegistraitionIframe = "//iframe[@scrolling='auto']";
    public TripadvisorPage(WebDriver driver) {
        this.driver=driver;
    }
    public void signInButtonClick() {
        driver.findElement(By.xpath(buttonSignInXPath)).click();
    }
    public void switchToIframe() {
        driver.switchTo().frame(driver.findElement(By.xpath(loginRegistraitionIframe)));
    }
    public void buttonContinueWithEmailClick(){
        driver.findElement(By.xpath(buttonContinueWithEmailXpath)).click();
    }
    public void inputEmailAddressTo(String email){
        driver.findElement(By.xpath(inputEmailAddressXpath)).sendKeys(email);
    }
    public void inputPasswordTo(String password){
        driver.findElement(By.xpath(inputPasswordXpath)).sendKeys(password);
    }
    public void buttonSignInApplyTo(){
        driver.findElement(By.xpath(buttonSignInApplyXpath)).click();
    }
}
