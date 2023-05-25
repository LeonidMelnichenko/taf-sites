package by.itacademy.melnichenko.leonid.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DominosPage {
    private WebDriver webDriver;
    private String buttonEnterXPath = "//*[@id='app-root']/div/div[1]/div[1]/div/div[4]/div/div/div[3]/button";
    private String inputEmailXPath = "/html/body/div[3]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[1]/input";
    private String inputPasswordXPath = "/html/body/div[3]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[2]/input";
    private String buttonToAccountXPath = "/html/body/div[3]/div[2]/div/div/div/div[2]/div[2]/div/form/div/button";

    public DominosPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickButtonEnter(){
        webDriver.findElement(By.xpath(buttonEnterXPath)).click();
    }
    public void inputEmail(String email){
        webDriver.findElement(By.xpath(inputEmailXPath)).sendKeys(email);
    }
    public void inputPassword(String password){
        webDriver.findElement(By.xpath(inputPasswordXPath)).sendKeys(password);
    }
    public void clickButtonEnterToAccount(){
        webDriver.findElement(By.xpath(buttonToAccountXPath)).click();
    }
}
