package PageObjects;

import Example.com.Utils;
import org.openqa.selenium.By;

/**
 * Created by Bhaygashri on 28/05/2015.
 */
public class AssignLeavePage extends BasePage {



    // Locators for AssignLeave page

    By employeeName= By.id("assignleave_txtEmployee_empName");

    By selectLeaveType=By.id("assignleave_txtLeaveType");

    By leaveFromDate=By.id("assignleave_txtFromDate");

    By leaveFromMonth=By.className("ui-datepicker-month");
    By leaveFromYear=By.className("ui-datepicker-year");

    By leaveToDate=By.id("assignleave_txtToDate");
    By leaveToMonth=By.className("ui-datepicker-month");
    By leaveToYear=By.className("ui-datepicker-year");
    By assignButton=By.id("assignBtn");
    By confirmButton=By.id("confirmOkButton");




    public void assignLeave(String empName,String leaveType,String dateFrom, String dateTo){

        Utils.enterText(employeeName,empName);
        Utils.selectFromDropdown(selectLeaveType, leaveType);
        Utils.enterText(leaveFromDate, dateFrom);
        Utils.enterText(leaveToDate,dateTo);
        Utils.waitForPageToLoad(20);
        Utils.click(assignButton);
        Utils.click(confirmButton);


    }



}
