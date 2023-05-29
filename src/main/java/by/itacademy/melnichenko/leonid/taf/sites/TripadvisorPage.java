package by.itacademy.melnichenko.leonid.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TripadvisorPage {
    private WebDriver driver;
    private String buttonSignInXPath = "//*[@id='lithium-root']/header/div/nav/div/div[2]/a[3]";
    private String buttonContinueWithEmailXpath = "//*[@id='ssoButtons']/button";
    private String inputEmailAddressXpath = "//*[@id='regSignIn.email']";
    private String inputPasswordXpath = "//*[@id='regSignIn.password']";
    private String buttonSignInApplyXpath = "//*[@id='regSignIn']/div[4]/button[1]";
    private String loginRegistraitionIframe = "//iframe[@scrolling='auto']";
    public TripadvisorPage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickSignInButton() {
        driver.findElement(By.xpath(buttonSignInXPath)).click();
    }
    public void switchToIframe() {
        driver.switchTo().frame(driver.findElement(By.xpath(loginRegistraitionIframe)));
    }
    public void clickButtonContinueWithEmail(){
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

    public void getUrl(){
        driver.get("https://www.tripadvisor.com/");
    }
}
