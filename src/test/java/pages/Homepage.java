package pages;

import helpMethods.ElementsMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class Homepage {
    public WebDriver driver;
    public ElementsMethod elementsMethod;


    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']");
    public WebElement alertFrameWindowMenu;

    public void clickAlertFrameWindow(){
        elementsMethod
    }
}
