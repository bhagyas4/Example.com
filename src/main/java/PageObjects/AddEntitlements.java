package PageObjects;

import Example.com.Utils;
import org.openqa.selenium.By;

/**
 * Created by Bhaygashri on 28/05/2015.
 */
public class AddEntitlements extends BasePage {

    // Locators for this
    By employee= By.id("entitlements_employee_empName");
    By leaveType=By.id("entitlements_leave_type");
    By leavePeriod=By.id("period");
    By entitlemnts=By.id("entitlements_entitlement");
    By saveButton=By.id("btnSave");


    public void addEntitlements(String employeeName,String typeOfLeave,String periodOfLeave,String leaveEntitlement){

        Utils.enterText(employee,employeeName);
        Utils.selectFromDropdown(leaveType, typeOfLeave);
        Utils.selectFromDropdown(leavePeriod,periodOfLeave);
        Utils.enterText(entitlemnts, leaveEntitlement);
        Utils.click(saveButton);

    }



}
