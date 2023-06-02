package by.itacademy.melnichenko.leonid.taf.sites.step;
import by.itacademy.melnichenko.leonid.taf.sites.page.PizzatempoPage;
import org.openqa.selenium.WebDriver;
public class PizzaTempoStep {
    PizzatempoPage page;
    public PizzaTempoStep(WebDriver webDriver) {
        page = new PizzatempoPage(webDriver);
    }
    public  void fillLoginFormAndSubmit(String name, String password){
        page.setInputEmail(name);
        page.setInputPassword(password);
        page.clickSetButtonFindSubmit();
    }
    public  void fillLoginFormAndSubmit(String name){
        page.setInputEmail(name);
        page.clickSetButtonFindSubmit();
    }
}
