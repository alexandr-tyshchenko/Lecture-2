package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.utils.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseScript {

    public static void main(String[] args) {
        WebDriver driver = getDriver();

        driver.get(" http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0");

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        WebElement submitButton = driver.findElement(By.name("submitLogin"));

        email.sendKeys("webinar.test@gmail.com");
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");
        submitButton.submit();

        sleep(1000);

        WebElement employeeInfo = driver.findElement(By.id("employee_infos"));
        WebElement logout = driver.findElement(By.id("header_logout"));

        employeeInfo.click();
        logout.click();

        driver.quit();
    }
        public static void sleep (long ms) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}

