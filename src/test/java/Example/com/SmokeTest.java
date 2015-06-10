package Example.com;

import PageObjects.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bhaygashri on 25/05/2015.
 */
public class SmokeTest extends BaseTest {


    BasePage basePage = new BasePage();
    LoginPage loginPage=new LoginPage();
    HomePage homePage= new HomePage();
    AssignLeavePage assignLeavePage= new AssignLeavePage();
    AddEntitlements addEntitlements=new AddEntitlements();
    AddEmployeePage addEmployeePage=new AddEmployeePage();








    @Test
    public void verifyAdminLogin(){

        loginPage.login(AdminUserName,AdminPassword);
        Assert.assertTrue(Utils.isTextPresent("Welcome Admin"));


    }


    @Test
    public void verifyAdminCanLogout(){
        basePage.logout();


    }

    String empName=LoadProperties.getProperties("empName");
    String leaveType=LoadProperties.getProperties("leaveType");
    String dateTo=LoadProperties.getProperties("dateTo");
    String dateFrom=LoadProperties.getProperties("dateFrom");


    @Test
    public void verifyAdminAssignLeave(){
        loginPage.login(AdminUserName, AdminPassword);
        homePage.goToAssgineLeave();
        Assert.assertTrue(Utils.isTextPresent("Assign Leave"));
        assignLeavePage.assignLeave(empName, leaveType, dateFrom, dateTo);
        Assert.assertTrue(Utils.isTextPresent("Successfully Assigned "));


    }


    //String employeeName="Sonali Pande";
    //String typeOfLeave="Parental";
    //String periodofLEave="01-01-2015-04-01-2016";
    //String leaveEntitlement="3";

    String AdminUserName= LoadProperties.getProperties("AdminUserName");
    String AdminPassword=LoadProperties.getProperties("AdminPassword");
    String employeeName=LoadProperties.getProperties("employeeName");
    String typeOfLeave=LoadProperties.getProperties("typeOfLeave");
    String periodOfLeave=LoadProperties.getProperties("periodOfLeave");
    String leaveEntitlement=LoadProperties.getProperties("leaveEntitlement");

    @Test
    public void verifyAdminAddEntitlements(){

        loginPage.login(AdminUserName,AdminPassword);
        homePage.goToAddEntitlements();
        //Assert.assertTrue(Utils.isTextPresent("Add Leave Entitlement"));
        addEntitlements.addEntitlements(employeeName, typeOfLeave, periodOfLeave, leaveEntitlement);
        Assert.assertTrue(Utils.isTextPresent("Sucessfully Added"));
        basePage.logout();



    }
    String firstName=LoadProperties.getProperties("firstName");
    String lastName=LoadProperties.getProperties("lastName");
    String userName=LoadProperties.getProperties("userName");
    String password=LoadProperties.getProperties("password");
    String confirmPassword=LoadProperties.getProperties("confirmPassword");
    String status=LoadProperties.getProperties("status");
    String location=LoadProperties.getProperties("location");
    String EmployeeUserName=LoadProperties.getProperties("EmployeeUserName");
    String EmployeePassword=LoadProperties.getProperties("EmployeePassword");


    @Test
    public void verifyAdminCanAddEmployee(){
        loginPage.login(AdminUserName,AdminPassword);
        homePage.goToAddEmployeePage();
        addEmployeePage.addEmployee(firstName, lastName, userName, password, confirmPassword, status, location);
        Assert.assertTrue(Utils.isTextPresent("Personal Details"));
        basePage.logout();
        loginPage.login(EmployeeUserName, EmployeePassword);
        Assert.assertTrue(Utils.isTextPresent("Welcome goodTester"));


    }

    }









