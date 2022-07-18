package uiTest;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WebBase {


    static WebDriverWait wait;
    private static WebDriver driver = Driver.getDriver();
    static Actions actions;

    static Set<String> windowsHandles;
    static Iterator<String> iterator;

    public static void setUpDriver() {
        driver = Driver.getDriver();

    }

    public static void waitElementToBeClickableAndClick(WebElement element) {
        wait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        actions.moveToElement(element).click().build().perform();

    }

    public static void waitElementToVisibleAndClick(WebElement element){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
        actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

    public static void verifyTextIsPresent(String text) {
            try {
                Driver.getDriver().findElement(By.xpath("//*[contains(text(), '"+text+"')]/following-sibling::ul"));
                System.out.println("'"+text+"' section is present");
            } catch (NoSuchElementException e){
                Assert.fail("'"+text+"' section is not present");
            }
    }

    public static void search(int n) {
        List<WebElement> buttons = Driver.getDriver().findElements(By.xpath("//div[@class='a-section a-spacing-base']"));
        for (int i = 0; i < n; i++) {
            buttons.get(i).click();
        }

    }

    public static void navigateToURL(String webURL) {
        driver.get(webURL);
    }

    public static void GetWindowHandles(){
        windowsHandles = driver.getWindowHandles();
        iterator = windowsHandles.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);

    }
}
