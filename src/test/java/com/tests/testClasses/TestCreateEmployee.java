//package com.tests.testClasses;
//
//import Com.testng.Pages.CreateEmployee;
//import Com.testng.Pages.LoginPage;
//import Com.testng.Pages.Utility;
//import Com.testng.core.PageGenerator;
//import com.tests.BaseClass.BaseClass;
//import org.testng.annotations.Test;
//
//@Test
//public class TestCreateEmployee extends BaseClass {
//
//    public void createEmployeeTest(){
//        CreateEmployee createEmployee = new PageGenerator().getInstance(CreateEmployee.class);
//        createEmployee.clickOnAddEmployee();
//        createEmployee.enterEmpName(rb.getString("EmpName"));
//        createEmployee.enterMobileNumber(rb.getString("EmpMobileNumber"));
//        createEmployee.writeAdd(rb.getString("EmpAdd"));
//        createEmployee.writePassword(rb.getString("EmpPassword"));
//        createEmployee.empGender();
//        createEmployee.setSelectMale();
//        createEmployee.empRating();
//        createEmployee.rating5();
//        createEmployee.empSpeciality();
//        createEmployee.serviceSelect();
//        createEmployee.selectPage();
//        waitForFixedTime(2000);
//        createEmployee.imageUpload("/Users/sharadmishra/Downloads/mohammad-faruque-TwuPHbcQ57w-unsplash (1).jpg");
//        waitForFixedTime(2000);
//        createEmployee.clickSaveButton();
//        waitForFixedTime(2000);
//    }
//}
