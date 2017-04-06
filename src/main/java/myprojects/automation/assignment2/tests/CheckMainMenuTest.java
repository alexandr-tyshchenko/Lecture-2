package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.utils.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

/**
 * Created by Alexandr on 03.04.2017.
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

        String successDashboardTitle = "Пульт";
        String successOrdersTitle = "Заказы";
        String successCatalogTitle = "товары";
        String successClientsTitle = "Управление клиентами";
        String successServiceTitle = "Customer Service";
        String successStatsTitle = "Статистика";
        String successModulesTitle = "Выбор модуля";
        String successDesignTitle = "Шаблоны > Шаблон";
        String successShippingTitle = "Перевозчики";
        String successPaymentTitle = "Payment Methods";
        String successInternationalTitle = "Локализация";
        String successParametersTitle = "General";
        String successConfigTitle = "Information";


        WebElement dashboard = driver.findElement(By.id("tab-AdminDashboard"));
        dashboard.click();
        String dashboardPageTitle = driver.findElement(By.className("page-title")).getText();
        driver.navigate().refresh();
        sleep(5000);
        System.out.println(dashboardPageTitle.contains(successDashboardTitle));
        sleep(5000);

        WebElement orders = driver.findElement(By.id("subtab-AdminParentOrders"));
        orders.click();
        String ordersPageTitle = driver.findElement(By.className("page-title")).getText();
        driver.navigate().refresh();
        sleep(5000);
        System.out.println(ordersPageTitle.contains(successOrdersTitle));
        sleep(5000);

        WebElement catalog = driver.findElement(By.id("subtab-AdminCatalog"));
        catalog.click();
        String catalogPageTitle = driver.findElement(By.className("title")).getText();
        driver.navigate().refresh();
        sleep(5000);
        System.out.println(catalogPageTitle.contains(successCatalogTitle));
        sleep(5000);

        WebElement clients = driver.findElement(By.partialLinkText("Клиенты"));
        clients.click();
        String clientsPageTitle = driver.findElement(By.className("page-title")).getText();
        driver.navigate().refresh();
        sleep(5000);
        System.out.println(clientsPageTitle.contains(successClientsTitle));
        sleep(5000);

        WebElement service = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
        service.click();
        String servicePageTitle = driver.findElement(By.className("page-title")).getText();
        driver.navigate().refresh();
        sleep(5000);
        System.out.println(servicePageTitle.contains(successServiceTitle));
        sleep(5000);

        WebElement stats = driver.findElement(By.id("subtab-AdminStats"));
        stats.click();
        String statsPageTitle = driver.findElement(By.className("page-title")).getText();
        driver.navigate().refresh();
        sleep(5000);
        System.out.println(statsPageTitle.contains(successStatsTitle));
        sleep(5000);

        WebElement modules = driver.findElement(By.id("subtab-AdminParentModulesSf"));
        modules.click();
        String modulesPageTitle = driver.findElement(By.className("title")).getText();
        driver.navigate().refresh();
        sleep(5000);
        System.out.println(modulesPageTitle.contains(successModulesTitle));
        sleep(5000);

        WebElement design = driver.findElement(By.linkText("Design"));
        design.click();
        String designPageTitle = driver.findElement(By.className("page-title")).getText();
        driver.navigate().refresh();
        sleep(5000);
        System.out.println(designPageTitle.contains(successDesignTitle));
        sleep(5000);

        WebElement shipping = driver.findElement(By.id("subtab-AdminParentShipping"));
        shipping.click();
        String shippingPageTitle = driver.findElement(By.className("page-title")).getText();
        driver.navigate().refresh();
        sleep(5000);
        System.out.println(shippingPageTitle.contains(successShippingTitle));
        sleep(5000);

        WebElement payment = driver.findElement(By.id("subtab-AdminParentPayment"));
        payment.click();
        String paymentPageTitle = driver.findElement(By.className("page-title")).getText();
        driver.navigate().refresh();
        sleep(5000);
        System.out.println(paymentPageTitle.contains(successPaymentTitle));
        sleep(5000);

        WebElement international  = driver.findElement(By.id("subtab-AdminInternational"));
        international.click();
        String internationalPageTitle = driver.findElement(By.className("page-title")).getText();
        driver.navigate().refresh();
        sleep(5000);
        System.out.println(internationalPageTitle.contains(successInternationalTitle));
        sleep(5000);

        WebElement parameters  = driver.findElement(By.id("subtab-ShopParameters"));
        parameters.click();
        String parametersPageTitle = driver.findElement(By.className("page-title")).getText();
        driver.navigate().refresh();
        sleep(5000);
        System.out.println(parametersPageTitle.contains(successParametersTitle));
        sleep(5000);

        WebElement config  = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
        config.click();
        String configPageTitle = driver.findElement(By.className("page-title")).getText();
        driver.navigate().refresh();
        sleep(5000);
        System.out.println(configPageTitle.contains(successConfigTitle));
        sleep(5000);

        driver.quit();
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}