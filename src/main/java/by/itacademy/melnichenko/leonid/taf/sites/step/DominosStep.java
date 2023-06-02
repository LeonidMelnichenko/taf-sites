package by.itacademy.melnichenko.leonid.taf.sites.step;

import by.itacademy.melnichenko.leonid.taf.sites.page.DominosPage;
import org.openqa.selenium.WebDriver;

public class DominosStep {
    DominosPage dominosPage;

    public DominosStep(WebDriver driver) {
        this.dominosPage = new DominosPage(driver);
    }
    public void fillLoginFormAndEnterToAccount(String name, String password){
        dominosPage.clickButtonEnter();
        dominosPage.inputEmail(name);
        dominosPage.inputPassword(password);
        dominosPage.clickButtonEnterToAccount();
    }
}
