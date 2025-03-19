package com.tests.testClasses;

import Com.testng.Pages.SfaCreateExpense;
import Com.testng.core.PageGenerator;
import com.tests.BaseClass.TestBaseClass;
import org.testng.annotations.Test;

@Test
public class CreateExpenseTest extends TestBaseClass {

    public void createExpenseTest() throws InterruptedException {

        SfaCreateExpense createExpense = pageGenerator.getPageInstance(SfaCreateExpense.class);

        createExpense.createExpenseForm();

    }
}
