package InventoryManagment.InventoryObserver;

import InventoryManagment.productFactory.Product;

import java.util.List;

public class DashboardAlertSystem implements InventoryObserver{
    private List<String> adminUsers;
    private String alertLevel;

    public DashboardAlertSystem(List<String> adminUsers, String alertLevel) {
        this.adminUsers = adminUsers;
        this.alertLevel = alertLevel;
    }

    @Override
    public void update(Product product) {
        if (product.getQuantity() < 10){
            for(String user:adminUsers){
                //send email to admin
            }
        }
    }
}
