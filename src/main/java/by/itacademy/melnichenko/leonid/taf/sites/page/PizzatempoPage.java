package by.itacademy.melnichenko.leonid.taf.sites.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzatempoPage {
    private WebDriver webDriver;
    private String inputEmailLocator = "astroauth_login";
    private String inputPasswordLocator = "astroauth_pass";
    private String buttonFindSudmitLocator = "astroauth_submit";
    private String resultTextAfterIncorrectEnterLocator = "PopupHead";

    private String url = "https://www.pizzatempo.by/";

    public PizzatempoPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void setInputEmail(String email){
        webDriver.findElement(By.name(inputEmailLocator)).sendKeys(email);
    }
    public void setInputPassword(String password){
        webDriver.findElement(By.name(inputPasswordLocator)).sendKeys(password);
    }
    public void clickSetButtonFindSubmit(){
        webDriver.findElement(By.name(buttonFindSudmitLocator)).click();
    }
    public void getUrl(){
        webDriver.get(url);
    }

    public String getResultTextAfterIncorrectEnter(){
        WebElement expectedResult = webDriver.findElement(By.className(resultTextAfterIncorrectEnterLocator));
        return expectedResult.getText();
    }
}
