package InventoryManagment.productFactory;

import java.sql.Date;

public class GroceryProduct extends Product{

    private Date expiryDate;
    private boolean refrigerated;

    public GroceryProduct( String sku, String name, double price, int quantity, int threshold) {
       super();
       setName(name);
       setPrice(price);
       setQuantity(quantity);
       setThreshold(threshold);
       setProductCategory(ProductCategory.GROCERY);
       setSku(sku);
    }
}
