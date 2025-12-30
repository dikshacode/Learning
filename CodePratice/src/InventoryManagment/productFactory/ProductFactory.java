package InventoryManagment.productFactory;

public class ProductFactory {

    public static Product createProduct(ProductCategory productCategory, String sku,String name,int quantity,int threshold,double price){

        return switch(productCategory){
            case GROCERY -> new GroceryProduct(sku,name,price,quantity,threshold);
            case ELECTRONICS -> new ElectronicProduct(sku,name,price,quantity,threshold);
            case CLOTHING -> new ClothingProduct(sku,name,price,quantity,threshold);
            default -> throw new IllegalArgumentException(
                    "Unsupported product category: " + productCategory);
        };
    }
}
