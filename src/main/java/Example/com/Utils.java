package Example.com;

import PageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bhaygashri on 25/05/2015.
 */
public class Utils extends BasePage {


    public static void clickLink(String text)
    {

        driver.findElement(By.linkText(text)).click();
    }

        public static void waitForPageToLoad(int time)
        {
            driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
        }

    public static  void maximise() {
        driver.manage().window().maximize();
    }

    public static void enterText(By element, String text) {

        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(text);
    }


    public static void click(By by) {

        driver.findElement(by).click();

    }

    public static boolean isTextPresent(String text) {
        return driver.findElement(By.tagName("body")).getText().contains(text);
    }

    public static void selectFromDropdown(By by,String text) {

        Select  dropDown = new Select(driver.findElement(by));
        dropDown.selectByVisibleText(text);

    }

    public static void waitForElement(By by,int time){
        WebDriverWait wait= new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }



}

