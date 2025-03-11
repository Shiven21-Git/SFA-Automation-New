package com.tests.listeners;

import Com.testng.core.DriverSupplier;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        DriverSupplier.getInstance().quitDriver();
    }

    @Override
    public void onFinish(ITestContext context) {
        DriverSupplier.getInstance().quitDriver();
    }
}
