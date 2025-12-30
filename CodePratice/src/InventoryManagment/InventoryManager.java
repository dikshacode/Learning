package InventoryManagment;

import InventoryManagment.InventoryObserver.InventoryObserver;
import InventoryManagment.productFactory.Product;
import InventoryManagment.productFactory.ProductFactory;
import InventoryManagment.replenishment.Replenishment;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    private static InventoryManager inventoryManager;
    private List<Warehouse> warehouseList;

    private ProductFactory productFactory;
    private List<InventoryObserver> observers;

    private Replenishment replenishment;
    private InventoryManager(){
        warehouseList = new ArrayList<>();
        productFactory = new ProductFactory();
        observers = new ArrayList<>();
    }

    public static InventoryManager getInventoryManager(){
        if(inventoryManager==null)
            inventoryManager =  new InventoryManager();
        return inventoryManager;
    }

    //get product

    public Product getProductBySku(String sku){
        for(Warehouse warehouse:warehouseList){
            Product product = null;
            if(warehouse.getProductMap().containsKey(sku))
                return warehouse.getProductMap().get(sku);
        }
        return null;
    }

    public void checkAndReplenish(String sku) {
        Product product = getProductBySku(sku);
        if(product != null){
            if(product.getQuantity() < product.getThreshold()){
                //notify
                replenishment.replenishProduct(product);
            }
        }
    }
    //check for all the warehouse
    public void overAllCheck(){
        for(Warehouse warehouse:warehouseList){
            for(Product product : warehouse.getProductMap().values()){
                if(product.getQuantity() < product.getThreshold()){
                    //notify
                    replenishment.replenishProduct(product);
                }
            }
        }
    }

    public boolean addWarehouses(Warehouse warehouse){
        return warehouseList.add(warehouse);
    }

    public Replenishment getReplenishment() {
        return replenishment;
    }

    public void setReplenishment(Replenishment replenishment) {
        this.replenishment = replenishment;
    }

    public void addObserver(InventoryObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(InventoryObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Product product) {
        for (InventoryObserver observer : observers) {
            observer.update(product);
        }
    }
}
