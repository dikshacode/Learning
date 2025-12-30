package InventoryManagment.replenishment;

import InventoryManagment.productFactory.Product;

public class JustInTimeInventory implements Replenishment{
    @Override
    public void replenishProduct(Product product) {
        System.out.println("JustInTime Replenishment");
    }
}
