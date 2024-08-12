package com.nttdata.steps;

import com.nttdata.screens.DashboardScreen;
import org.junit.Assert;


public class DashboardStep {

    private DashboardScreen dashboardScreen;

    public void estoyEnLaAplicacion() {
        dashboardScreen.open();
    }

    public void validoProductos() {
        Assert.assertTrue(dashboardScreen.getItems() > 1);
    }
}