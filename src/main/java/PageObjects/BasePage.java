package PageObjects;

import Example.com.Utils;
import org.openqa.selenium.WebDriver;

/**
 * Created by Bhaygashri on 25/05/2015.
 */
public class BasePage {


    // Locators for log out

    public static WebDriver driver;


    // Locators for log out




    public void logout(){

        Utils.clickLink("Welcome Admin");
        Utils.waitForPageToLoad(20);
        Utils.clickLink(("Logout"));


    }



}
