package myprojects.automation.assignment2.tests;

        import myprojects.automation.assignment2.utils.BaseScript;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import java.util.ArrayList;
        import java.util.List;

/**
 * Created by Alexandr on 08.04.2017.
 */
public class CheckMainMenuTest extends BaseScript {

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

        List<WebElement> menu = driver.findElements(By.className("maintab"));
        ArrayList<String> textLinkList = new ArrayList<String>();

        for(WebElement e : menu){
            textLinkList.add(e.getText());
        }

        for(String s : textLinkList){
            driver.findElement(By.linkText(s)).click();
            sleep(5000);
            String title = driver.getTitle();
            System.out.println(title);
            driver.navigate().refresh();
            sleep(5000);
            if(!title.equals(driver.getTitle())) System.out.println("Page title was changed");
        }
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