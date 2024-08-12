package com.nttdata.steps;


import com.nttdata.screens.AddProductsScreen;

public class AddProductsStep {

    AddProductsScreen addProductsScreen;

    //agregar al carro
    public void selectProduct(String productName) {
        switch (productName) {
            case "Sauce Labs Backpack":
                addProductsScreen.clickBackpack();
                break;
            case "Sauce Labs Bolt T-Shirt":
                addProductsScreen.clickTShirt();
                break;
            default:
                throw new IllegalArgumentException("Producto no reconocido: " + productName);
        }
    }

    public void addProductToCart(int quantity) {
        for (int i = 0; i < quantity; i++) {
            addProductsScreen.clickAddProduct();
        }
    }

    public void addProduct(int quantity) {
        addProductToCart(quantity);
    }

    public void returnToCatalog() {
        addProductsScreen.openMenu();
        addProductsScreen.navigateToCatalog();
    }

    public void addCar(String productName, int quantity) {
        selectProduct(productName);
        addProduct(quantity);
    }

}
