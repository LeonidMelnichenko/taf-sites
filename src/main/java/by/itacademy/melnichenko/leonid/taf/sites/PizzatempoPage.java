package by.itacademy.melnichenko.leonid.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PizzatempoPage {
    private WebDriver webDriver;
    private String inputEmailXPath = "/html/body/div/div[1]/form/p[1]/input";
    private String inputPasswordXPath = "/html/body/div/div[1]/form/p[2]/input[1]";
    private String buttonFindSudmit = "/html/body/div/div[1]/form/p[2]/input[2]";

    public PizzatempoPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void setInputEmail(String email){
        webDriver.findElement(By.xpath(inputEmailXPath)).sendKeys(email);
    }
    public void setInputPassword(String password){
        webDriver.findElement(By.xpath(inputPasswordXPath)).sendKeys(password);
    }
    public void clickSetButtonFindSubmit(){
        webDriver.findElement(By.xpath(buttonFindSudmit)).click();
    }
}
