package InventoryManagment;

import InventoryManagment.productFactory.Product;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private int id;
    private String name;

    private String location;
    private Map<String, Product> productMap;

    public Warehouse(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.productMap = new HashMap<>();
    }

    public void addAndUpdateProduct(Product product, int quantity){
        String sku = product.getSku();
        if(productMap.containsKey(sku)){
            product.setQuantity(quantity);
        }
        else {
            product.setQuantity(quantity);
            productMap.put(sku,product);
        }
    }

    public boolean removeProduct(String sku,int quantity){
        if(productMap.containsKey(sku)){
            Product product =   productMap.get(sku);
            int currQnty = product.getQuantity();
            if(currQnty>=quantity){
                int remQnty = currQnty - quantity;
                product.setQuantity(remQnty);
            }
            if(currQnty==0){
                productMap.remove(sku);
            }
            return true;
        }
        else
            System.out.println("sku does not exits");
        return false;
    }

    public Map<String, Product> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<String, Product> productMap) {
        this.productMap = productMap;
    }
}
