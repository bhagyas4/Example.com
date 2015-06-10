package PageObjects;

import Example.com.Utils;
import org.openqa.selenium.By;

/**
 * Created by Bhaygashri on 04/06/2015.
 */
public class AddEmployeePage extends BasePage {


    // Locators for Add Employe

    By firstNameField= By.id("firstName");
    By lastNameField=By.id("lastName");
    By locationName=By.id("location");
    By saveButton=By.id("btnSave");
    //Login Details
    By checkBox=By.id("chkLogin");
    By userNameField=By.id("user_name");
    By passWordField=By.id("user_password");
    By confirmPasswordField = By.id("re_password");
    By statusField=By.id("status");


    public void addEmployee(String firstName,String lastName,String userName,String password,
                            String confirmPasswords,String status, String location)
    {

        Utils.enterText(firstNameField,firstName);
        Utils.enterText(lastNameField, lastName);
        Utils.click(checkBox);
        Utils.enterText(userNameField,userName);
        Utils.enterText(passWordField,password);
        Utils.enterText(confirmPasswordField,confirmPasswords);
        Utils.selectFromDropdown(statusField, status);
        Utils.selectFromDropdown(locationName,location);
        Utils.click(saveButton);



    }


    }
