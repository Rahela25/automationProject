package tests;

import helpMethods.ElementsMethod;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TabWindowTest {
    public WebDriver driver;
    ElementsMethod elementsMethod;

    @Test
    public void metodaTest () {

        //Deschidem un browser

        driver = new ChromeDriver();

        //Accesam un URL

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        elementsMethod = new ElementsMethod(driver);g

        WebElement alertMeniu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", alertMeniu);

        WebElement tabButton = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        tabButton.click();

        WebElement tabButtonElement = driver.findElement(By.id("tabButton"));
        tabButtonElement.click();

        System.out.println("URL-ul paginii este"+ driver.getCurrentUrl());
        List<String> tabsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabsList.get(1));
        System.out.println("URL-ul paginii este"+ driver.getCurrentUrl());
        driver.close();
        driver.switchTo().window(tabsList.get(0));


        WebElement newWindowElement = driver.findElement(By.id("windowButton"));
        newWindowElement.click();
        List<String> newWindowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newWindowList.get(1));
        driver.quit();





    }
}
