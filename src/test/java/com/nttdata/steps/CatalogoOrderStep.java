package com.nttdata.steps;

import com.nttdata.screens.CatalogoOrderScreen;

public class CatalogoOrderStep {

    CatalogoOrderScreen catalogoOrderScreen;

    public void ordenList() {
        catalogoOrderScreen.clickOrder();
        catalogoOrderScreen.clickDecent();
    }

}
