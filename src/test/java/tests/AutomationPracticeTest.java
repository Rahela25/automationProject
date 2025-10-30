package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org. testng.annotations.Test;

public class AutomationPracticeTest {

    public WebDriver driver;

    @Test

    public void metodaTest () throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        driver.manage().window().maximize();

        WebElement emailElement = driver.findElement(By.id("email_create"));
        String email_create = "rahela_popovici2@yahoo.com";
        emailElement.sendKeys(email_create);

        Thread.sleep(2000);

        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();

        Thread.sleep(3000);

        WebElement titleMrs = driver.findElement(By.id("id_gender2"));
        titleMrs.click();

        WebElement firstNameElement = driver.findElement(By.id("customer_firstname"));
        String customer_firstname = "Popovici";
        firstNameElement.sendKeys(customer_firstname);

        WebElement lastNameElement = driver.findElement(By.id("customer_lastname"));
        String customer_lastname = "Rahela";
        lastNameElement.sendKeys(customer_lastname);

        WebElement passwordElement = driver.findElement(By.id("passwd"));
        String passwd = "Test123";
        passwordElement.sendKeys(passwd);

        WebElement dayElement = driver.findElement(By.id("days"));
        Select selectDay = new Select(dayElement);
        selectDay.selectByValue("11");

        WebElement monthElement = driver.findElement(By.id("months"));
        Select selectMonth = new Select(monthElement);
        selectMonth.selectByValue("3");

        WebElement yearElement = driver.findElement(By.id("years"));
        Select selectYear = new Select(yearElement);
        selectYear.selectByValue("2000");

        Thread.sleep(2000);

        WebElement registerButton = driver.findElement(By.id("submitAccount"));
        registerButton.click();
    }

        //SIGN IN

        @Test

        public void loginTest() throws InterruptedException {

            driver = new ChromeDriver();
            driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
            driver.manage().window().maximize();

            WebElement emailElement = driver.findElement(By.id("email"));
            String email = "rahela_popovici@yahoo.com";
            emailElement.sendKeys(email);

            WebElement passwordElement = driver.findElement(By.id("passwd"));
            String passwd = "Test123";
            passwordElement.sendKeys(passwd);

            WebElement singinButton = driver.findElement(By.id("SubmitLogin"));
            singinButton.click();

            Thread.sleep(2000);

        //Edit Functuality







    }
}
