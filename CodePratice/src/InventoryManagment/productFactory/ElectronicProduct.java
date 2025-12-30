package InventoryManagment.productFactory;

public class ElectronicProduct extends Product{

    private String brnad;
    private int warrantyPeriod;

    public ElectronicProduct(String sku, String name, double price, int quantity, int threshold) {
        super();
        setName(name);
        setPrice(price);
        setQuantity(quantity);
        setThreshold(threshold);
        setProductCategory(ProductCategory.ELECTRONICS);
        setSku(sku);
    }
}
