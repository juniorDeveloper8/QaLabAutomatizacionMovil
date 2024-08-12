package com.nttdata.steps;

import com.nttdata.screens.CarritoScreen;
import org.junit.Assert;

public class CarritoStep {

    CarritoScreen carritoScreen;

    public void validateProductInCart(String expectedProductName) {
        carritoScreen.clickCarrito();
        String actualProductName = carritoScreen.getNameProduct();
        Assert.assertEquals(expectedProductName, actualProductName);
    }

    public void navigate(AddProductsStep addProductsStep) {
        addProductsStep.returnToCatalog();
    }
}
