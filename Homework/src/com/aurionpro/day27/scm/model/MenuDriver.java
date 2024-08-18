package com.aurionpro.day27.scm.model;

import java.util.Scanner;

public class MenuDriver {

    private Scanner scanner = new Scanner(System.in);

    private InventoryConnectionDb inventoryDb = new InventoryConnectionDb();
    private OrderDetailsConnectionDb orderDetailsDb = new OrderDetailsConnectionDb();
    private OrdersConnectionDb ordersDb = new OrdersConnectionDb();
    private ProductsConnectionDb productsDb = new ProductsConnectionDb();
    private SuppliersConnectionDb suppliersDb = new SuppliersConnectionDb();

    public void start() {
        while (true) {
            System.out.println("Choose the database table you want to interact with:");
            System.out.println("1. Inventory");
            System.out.println("2. Order Details");
            System.out.println("3. Orders");
            System.out.println("4. Products");
            System.out.println("5. Suppliers");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    handleInventoryMenu();
                    break;
                case 2:
                    handleOrderDetailsMenu();
                    break;
                case 3:
                    handleOrdersMenu();
                    break;
                case 4:
                    handleProductsMenu();
                    break;
                case 5:
                    handleSuppliersMenu();
                    break;
                case 6:
                    System.out.println("Thank you for using thing service");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void handleInventoryMenu() {
        inventoryDb.connectToDb();
        while (true) {
            inventoryDb.printOptions();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    inventoryDb.getInventoryDetails();
                    break;
                case 2:
                    inventoryDb.addInventory();
                    break;
                case 3:
                    inventoryDb.updateInventoryQuantity();
                    break;
                case 4:
                    inventoryDb.deleteInventory();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void handleOrderDetailsMenu() {
        orderDetailsDb.connectToDb();
        while (true) {
            orderDetailsDb.printOptions();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    orderDetailsDb.getOrdersdetailDetails();
                    break;
                case 2:
                    orderDetailsDb.addOrderDetails();
                    break;
                case 3:
                    orderDetailsDb.updateOrderDetailPrice();
                    break;
                case 4:
                    orderDetailsDb.deleteOrderDetails();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void handleOrdersMenu() {
        ordersDb.connectToDb();
        while (true) {
            ordersDb.printOptions();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ordersDb.getOrdersDetails();
                    break;
                case 2:
                    ordersDb.addOrder();
                    break;
                case 3:
                    ordersDb.updateSupplierID();
                    break;
                case 4:
                    ordersDb.deleteOrder();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void handleProductsMenu() {
        productsDb.connectToDb();
        while (true) {
            productsDb.printOptions();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    productsDb.getProductsDetails();
                    break;
                case 2:
                    productsDb.addProducts();
                    break;
                case 3:
                    productsDb.updateSupplierId();
                    break;
                case 4:
                    productsDb.deleteProduct();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void handleSuppliersMenu() {
        suppliersDb.connectToDb();
        while (true) {
            suppliersDb.printOptions();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    suppliersDb.getSuppliersDetails();
                    break;
                case 2:
                    suppliersDb.addSuppliers();
                    break;
                case 3:
                    suppliersDb.updateSupplierName();
                    break;
                case 4:
                    suppliersDb.deleteSuppliers();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
