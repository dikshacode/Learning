package InventoryManagment.productFactory;

public class ClothingProduct extends Product{
    private String brand;
    private int size;

    public ClothingProduct(String sku, String name, double price, int quantity, int threshold) {
        super();
        setName(name);
        setPrice(price);
        setQuantity(quantity);
        setThreshold(threshold);
        setProductCategory(ProductCategory.GROCERY);
        setSku(sku);
    }
}
