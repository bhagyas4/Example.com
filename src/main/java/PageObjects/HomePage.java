package PageObjects;

import Example.com.Utils;

/**
 * Created by Bhaygashri on 25/05/2015.
 */
public class HomePage extends BasePage {



    public void goToAddEntitlements(){
        Utils.clickLink("Leave");
        Utils.clickLink("Entitlements");
        Utils.clickLink("Add Entitlements");

    }



    public void goTOEmployeeEntitlements(){

        Utils.clickLink("Leave");
        Utils.clickLink("Entitlements");
        Utils.clickLink("EMployee Entitlemetns");

    }

    public void goToLeaveEntitlementsandUsageReports(){

        Utils.clickLink("Leave");
        Utils.clickLink("Reports");
        Utils.clickLink("Leave Entitlements and Usage Reports");


    }


    public void goToLeavePeriod(){
        Utils.clickLink("Leave");
        Utils.clickLink("Configure");
        Utils.clickLink("Leave Period");

    }

    public void goToAssgineLeave(){
        Utils.clickLink("Leave");
        Utils.clickLink("Assign Leave");
    }

    public void goToAddEmployeePage(){
        Utils.clickLink("PIM");
        Utils.clickLink("Add Employee");


    }


}
