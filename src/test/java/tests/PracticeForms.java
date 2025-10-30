package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeForms {

    public WebDriver driver;

    @Test

    public void metodaTest() {

        //Deschidem un browser

        driver = new ChromeDriver();

        //Accesam un URL

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        WebElement formsMeniu = driver.findElement(By.xpath("//h5[text()='Forms']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", formsMeniu);

        WebElement practiceForm = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        practiceForm.click();

        WebElement firstNameElement = driver.findElement(By.id("firstName"));
        String firstName = "Iulian";
        firstNameElement.sendKeys(firstName);

        WebElement lastNameElement = driver.findElement(By.id("lastName"));
        String lastName = "Roteliuc";
        lastNameElement.sendKeys(lastName);

        WebElement userEmailElement = driver.findElement(By.id("userEmail"));
        String userEmail = "roteliuc.iulian@gmail.com";
        userEmailElement.sendKeys(userEmail);

        WebElement mobileElement = driver.findElement(By.id("userNumber"));
        String mobile = "0746430354";
        mobileElement.sendKeys(mobile);

        //Date of birth interaction

        WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        js.executeScript("arguments[0].click();", dateOfBirth);

        WebElement monthElement= driver.findElement(By.className("react-datepicker__month-select"));
        elementsMethod.dropDownElement(monthElement, "January")

        WebElement yearElement = driver.findElement(By.className("react-datepicker__year-select"));
        elementsMethod.dropDownElement(yearElement, "2030");

        String dayValue= "15";
        List<WebElement> daysList= driver.findElements(By.xpath("//div[@class='react-datepicker__month']"));
        for (int index=0; index<daysList.size(); index++){
            if(daysList.get(index).getText().equals(dayValue)){
                daysList.get(index).click();
                
            }
        }






//        WebElement currentAdressElement = driver.findElement(By.id("currentAddress"));
//        String adress = "Timisoara";
//        currentAdressElement.sendKeys(adress);

//        List<WebElement> genderOptionsList = driver.findElements(By.xpath("//input[@name='gender']"));
//        String genderValue = "Male";
//
//        switch (genderValue) {
//            case "Male":
//                js.executeScript("arguments[0].click();", genderOptionsList.get(0));
//                break;
//            case "Female":
//                js.executeScript("arguments[0].click();", genderOptionsList.get(1));
//                break;
//            case "Other":
//                js.executeScript("arguments[0].click();", genderOptionsList.get(2));
//                break;
//        }
//        WebElement subjectElementField = driver.findElement(By.id("subjectsInput"));
////        String subjectValue = "Accounting";
////        subjectElementField.sendKeys(subjectValue);
////        subjectElementField.sendKeys(Keys.ENTER);
//
//        List<String> subjectElements = Arrays.asList("Accounting", "Maths", "English");
//        for (int index = 0; index < subjectElements.size(); index++) {
//            subjectElementField.sendKeys(subjectElements.get(index));
//            subjectElementField.sendKeys(Keys.ENTER);
//        }
//        List<String> hobbiesElements = Arrays.asList("Sports", "Reading", "Music");
//        List<WebElement> hobbiesCheckList = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        for (int index = 0; index < hobbiesElements.size(); index++) {
//            js.executeScript("arguments[0].click();", hobbiesCheckList.get(index));
//        }
//        WebElement photoElementField = driver.findElement(By.id("uploadPicture"));
//        File resourcesDirectory = new File("src/test/resources/CV - Rahela Popovici (1).PDF");
//        photoElementField.sendKeys(resourcesDirectory.getAbsolutePath());
//
////        WebElement stateElement = driver.findElement(By.xpath("//div[text()='Select State']"));
////        js.executeScript("arguments[0].click();", stateElement);
////        WebElement stateInputElement = driver.findElement(By.id("react-select-3-input"));
////        String stateValue = "NCR";
////        stateElement.sendKeys(stateValue);
////        stateInputElement.sendKeys(Keys.ENTER);
//
//        WebElement stateElement = driver.findElement(By.xpath("//div[text()='Select State']"));
//        js.executeScript("arguments[0].click()", stateElement);
//
//        // Găsește input-ul pentru scriere
//        WebElement stateInputElement = driver.findElement(By.id("react-select-3-input"));
//
//        // Trimite valoarea către input (fără ghilimele)
//        String stateValue = "NCR";
//        stateInputElement.sendKeys(stateValue);
//
//        // Confirmă selecția
//        stateInputElement.sendKeys(Keys.ENTER);
//
////        WebElement closeElement = driver.findElement(By.id("closeLargeModal"));
////        closeElement.click();
//
//        WebElement cityElement = driver.findElement(By.xpath("//div[text()='Select City']"));
//        js.executeScript("arguments[0].click()", cityElement);
//
//        WebElement cityInputElement = driver.findElement(By.id("react-select-4-input"));
//
//        String cityValue = "Delhi";
//        cityInputElement.sendKeys(cityValue);
//
//        cityInputElement.sendKeys(Keys.ENTER);
//
//        WebElement submitElement = driver.findElement(By.id("submit"));
//        submitElement.click();
//
//        WebElement thankYouElement = driver.findElement(By.id("example-modal-sizes-title-lg"));
//        Assert.assertEquals(thankYouElement.getText(),"Thanks for submitting the form");
//
//        List<WebElement> labelList= driver.findElements(By.xpath("//Table[@class='table table-dark table-striped table-bordered table-hover']//td[1]"));
//        Assert.assertEquals(labelList.get(0).getText(),"Student Name");
//        Assert.assertEquals(labelList.get(1).getText(),"Student Email");
//        Assert.assertEquals(labelList.get(2).getText(),"Gender");
//        Assert.assertEquals(labelList.get(3).getText(),"Mobile");
//        Assert.assertEquals(labelList.get(4).getText(),"Date of Birth");
//        Assert.assertEquals(labelList.get(5).getText(),"Subjects");
//        Assert.assertEquals(labelList.get(6).getText(),"Hobbies");
//        Assert.assertEquals(labelList.get(7).getText(),"Picture");
//        Assert.assertEquals(labelList.get(8).getText(),"Address");
//        Assert.assertEquals(labelList.get(9).getText(),"State and City");
//
//        List<WebElement> tabelList= driver.findElements(By.xpath("//Table[@class='table table-dark table-striped table-bordered table-hover']//td[2]"));
//        Assert.assertEquals(tabelList.get(0).getText(),firstName+ "" +lastName);






        // Tema mai sus in continuare










    }

}
