package Example.com;

import PageObjects.BasePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class BaseTest  extends BasePage {

    @BeforeClass
    public static void setup() {

        driver = new FirefoxDriver();
        driver.get(LoadProperties.getProperties("URL"));
        Utils.waitForPageToLoad(20);
        Utils.maximise();


    }
    @AfterClass
    public static   void tearDown(){
        driver.quit();

    }

}
