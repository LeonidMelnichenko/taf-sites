package by.itacademy.melnichenko.leonid.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DominosPage {
    WebDriver webDriver;
    String buttonEnterXPath = "//*[@id='app-root']/div/div[1]/div[1]/div/div[4]/div/div/div[3]/button";
    String inputEmailXPath = "/html/body/div[3]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[1]/input";
    String inputPasswordXPath = "/html/body/div[3]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[2]/input";
    String buttonToAccountXPath = "/html/body/div[3]/div[2]/div/div/div/div[2]/div[2]/div/form/div/button";

    public DominosPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void buttonEnterClick(){
        webDriver.findElement(By.xpath(buttonEnterXPath)).click();
    }
    public void inputEmail(String email){
        webDriver.findElement(By.xpath(inputEmailXPath)).sendKeys(email);
    }
    public void inputPassword(String password){
        webDriver.findElement(By.xpath(inputPasswordXPath)).sendKeys(password);
    }
    public void buttonEnterToAccountClick(){
        webDriver.findElement(By.xpath(buttonToAccountXPath)).click();
    }
}