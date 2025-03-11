package com.tests.testClasses;

import Com.testng.Pages.SfaLogin;
import com.tests.BaseClass.TestBaseClass;
import org.testng.annotations.Test;


public class SfaLoginTest extends TestBaseClass {

    @Test

    public void loginSfatest() {

        SfaLogin loginSfa = pageGenerator.getPageInstance(SfaLogin.class);
//        loginSfa.loginPage("TenantId", "Username", "Password");
        loginSfa.clickMyPermission();
        test.pass("SFA Login was successful");
    }

}
