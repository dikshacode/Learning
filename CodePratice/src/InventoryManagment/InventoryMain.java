package InventoryManagment;

import InventoryManagment.productFactory.Product;
import InventoryManagment.productFactory.ProductCategory;
import InventoryManagment.productFactory.ProductFactory;
import InventoryManagment.replenishment.BulkInventory;
import InventoryManagment.replenishment.JustInTimeInventory;

import java.util.ArrayList;

public class InventoryMain {

    public static void main(String[] args){
        InventoryManager inventoryManager = InventoryManager.getInventoryManager();
        Warehouse warehouse1 = new Warehouse(1,"warehouse1","BLR");
        Warehouse warehouse2 = new Warehouse(2,"warehouse2","DL");

        //
        inventoryManager.addWarehouses(warehouse1);
        inventoryManager.addWarehouses(warehouse2);

        //create product
        ProductFactory productFactory = new ProductFactory();
        Product laptop = productFactory.createProduct(
                ProductCategory.ELECTRONICS, "SKU123", "Laptop", 50, 25,1000.0);
        Product tShirt = productFactory.createProduct(
                ProductCategory.CLOTHING, "SKU456", "T-Shirt", 200, 20, 100.0);
        Product apple = productFactory.createProduct(
                ProductCategory.GROCERY, "SKU789", "Apple", 100, 100, 200.0);

        warehouse1.addAndUpdateProduct(laptop,25);
        warehouse1.addAndUpdateProduct(tShirt,200);
        warehouse2.addAndUpdateProduct(apple,100);

        inventoryManager.setReplenishment(new JustInTimeInventory());


        inventoryManager.overAllCheck();

        inventoryManager.setReplenishment(new BulkInventory());

        inventoryManager.notifyObservers(laptop);
        System.out.println(laptop.getPrice());
    }
}
