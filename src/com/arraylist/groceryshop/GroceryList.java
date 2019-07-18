package com.arraylist.groceryshop;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> grocerylist = new ArrayList<>();

    public void addItem(String item) {
        grocerylist.add(item);
    }

    public void printGroceryList() {
        System.out.println("totall item in GroceryList: " + grocerylist.size() + " the items: ");
        for (int i = 0; i < grocerylist.size(); i++) {
            System.out.println("list: " + (i + 1) + " items: " + grocerylist.get(i));
        }
    }

    public void modifyGroceryList(int position, String newItem) {
        grocerylist.set(position, newItem);
        System.out.println("list: " + (position + 1) + " has been modfied");

    }

    public void removeItem(int position) {
        String theItem = grocerylist.get(position);
        grocerylist.remove(position);
        System.out.println("the item: " + theItem + " is removed");
    }

    public String findItem(String searchItem) {
        int position = grocerylist.indexOf(searchItem);
        if (position >= 0) {
            return grocerylist.get(position);
        }
        return null;
    }
}
