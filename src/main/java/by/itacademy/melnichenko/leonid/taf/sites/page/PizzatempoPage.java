package by.itacademy.melnichenko.leonid.taf.sites.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzatempoPage {
    private WebDriver webDriver;
    private String inputEmailName = "astroauth_login";
    private String inputPasswordName = "astroauth_pass";
    private String buttonFindSudmitName = "astroauth_submit";
    private String resultTextAfterIncorrectEnter = "//*[@id='alert']/div[2]/div[2]";

    private String url = "https://www.pizzatempo.by/";

    public PizzatempoPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void setInputEmail(String email){
        webDriver.findElement(By.name(inputEmailName)).sendKeys(email);
    }
    public void setInputPassword(String password){
        webDriver.findElement(By.name(inputPasswordName)).sendKeys(password);
    }
    public void clickSetButtonFindSubmit(){
        webDriver.findElement(By.name(buttonFindSudmitName)).click();
    }
    public void getUrl(){
        webDriver.get(url);
    }

    public String getResultTextAfterIncorrectEnter(){
        WebElement expectedResult = webDriver.findElement(By.name(resultTextAfterIncorrectEnter));
        return expectedResult.getText();
    }
}
