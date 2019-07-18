package com.arraylist.groceryshop;

import java.util.Scanner;

public class GroceryShop {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        int choice = 0;
        boolean quit = false;

        while (!quit) {
            System.out.println("enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    addItems();
                    break;
                case 2:
                    groceryList.printGroceryList();
                    break;
                case 3:
                    modifyGroceryLists();
                    break;
                case 4:
                    removeItems();
                    break;
                case 5:
                    findItems();
                    break;
                case 6:
                    quit = false;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("0-for choose the instructions");
        System.out.println("1-for choose the add items");
        System.out.println("2-for choose the print grocerist");
        System.out.println("3-for choose the modify grocerylist");
        System.out.println("4-for choose the remove items");
        System.out.println("5-for choose the find a items");
        System.out.println("6-for choose the exit");
    }

    public static void addItems() {
        System.out.println("enter the item you want to add: ");
        String item = scanner.nextLine();

        groceryList.addItem(item);
    }

    public static void modifyGroceryLists() {
        System.out.println("enter item number: ");
        int item_no = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter replace item");
        String replace_item = scanner.nextLine();
        groceryList.modifyGroceryList(item_no - 1, replace_item);
    }

    public static void removeItems() {
        System.out.println("enter item number you want to remove: ");
        int position = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeItem(position - 1);
    }

    public static void findItems() {
        String item_name = scanner.nextLine();
        if (groceryList.findItem(item_name) != null) {
            System.out.println("Found " + item_name + " in our grocerylist");
        } else {
            System.out.println("Searchitem: " + item_name + "is not in the shopping list");
        }

    }
}
