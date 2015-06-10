package PageObjects;

import Example.com.Utils;
import org.openqa.selenium.By;

/**
 * Created by Bhaygashri on 25/05/2015.
 */
public class LoginPage extends BasePage{

    By userNameTextField= By.id("txtUsername");
    By passwordTextField=By.id("txtPassword");
    By loginButton= By.id("btnLogin");


    public void login(String username,String password){

        Utils.enterText(userNameTextField,username);
        Utils.enterText(passwordTextField,password);
        Utils.click(loginButton);
    }


}
