package main_inventory;
import inventory.*;

public class Main {
    public static void main(String[] args) {
        Product iPhone = new Product();
        Inventory iPhoneInventory = new Inventory();
        Warehouse sanAntonioWarehouse = new Warehouse();

        iPhone.price = 1000;
        iPhone.productName = "iPhone";
        iPhone.productId = 1;

        iPhoneInventory.product = iPhone;
        iPhoneInventory.quantity = 200;

        sanAntonioWarehouse.warehouseId = 1;
        sanAntonioWarehouse.warehouseName = "San Antonio";
        sanAntonioWarehouse.inventories = "Many";

        System.out.println("Product: " + iPhone.productName);
        System.out.println("Product price: $" + iPhone.price);
        System.out.println("Product ID: " + iPhone.productId + "\n");

        System.out.println("Product in inventory: " + iPhoneInventory.product);
        System.out.println("Product quantity: " + iPhoneInventory.quantity + "\n");

        System.out.println("Warehouse name: " + sanAntonioWarehouse.warehouseName);
        System.out.println("Warehouse ID: " + sanAntonioWarehouse.warehouseId);
        System.out.println("Warehouse inventories: " + sanAntonioWarehouse.inventories);
    }
}