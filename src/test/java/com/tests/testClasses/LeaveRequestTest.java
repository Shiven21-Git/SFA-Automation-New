package com.tests.testClasses;

import Com.testng.Pages.LeaveRequest;
import com.tests.BaseClass.TestBaseClass;
import org.testng.annotations.Test;

public class LeaveRequestTest extends TestBaseClass {
    @Test

    public void leaveRequestTest(){
        LeaveRequest leaveRequest = pageGenerator.getPageInstance(LeaveRequest.class);
        leaveRequest.leaveRequestForm();
    }
}
