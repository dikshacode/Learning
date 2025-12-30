package InventoryManagment.replenishment;

import InventoryManagment.productFactory.Product;

public class BulkInventory implements Replenishment{
    @Override
    public void replenishProduct(Product product) {
        System.out.println("BulkInventory");
    }
}
