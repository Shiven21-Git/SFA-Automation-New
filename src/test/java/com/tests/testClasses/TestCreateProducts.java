package com.tests.testClasses;

import Com.testng.Pages.CreateProduct;
import Com.testng.core.PageGenerator;
import com.tests.BaseClass.TestBaseClass;
import org.testng.annotations.Test;

@Test
public class TestCreateProducts extends TestBaseClass {

    public void createProductTest() throws InterruptedException {

        CreateProduct createProduct = pageGenerator.getPageInstance(CreateProduct.class);

        createProduct.createProductForm();

    }




}
