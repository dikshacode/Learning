package InventoryManagment.InventoryObserver;

import InventoryManagment.productFactory.Product;

public interface InventoryObserver {
    void update(Product product);
}
