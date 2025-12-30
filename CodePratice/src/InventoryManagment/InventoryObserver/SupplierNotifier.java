package InventoryManagment.InventoryObserver;

import InventoryManagment.productFactory.Product;

public class SupplierNotifier implements InventoryObserver{

    private String supplierName;
    private String emailId;

    @Override
    public void update(Product product) {
        if (product.getQuantity() < product.getThreshold())
          System.out.println("Send email to Supplier"+supplierName);
    }
}
