package com.tests.testClasses;

import Com.testng.Pages.SfaCreateMember;
import Com.testng.core.PageGenerator;
import com.tests.BaseClass.TestBaseClass;
import org.testng.annotations.Test;

public class SfaCreateMemberTest extends TestBaseClass {

@Test

    public void createMemberTest(){

        SfaCreateMember createMember = pageGenerator.getPageInstance(SfaCreateMember.class);

        createMember.createMemberForm();
    }
}
