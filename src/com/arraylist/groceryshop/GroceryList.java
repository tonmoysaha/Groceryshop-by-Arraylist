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
    public void  modifyGroceryList(String searchItem , String newItem){
        int position = findItem(searchItem);
        if (position >=0){
            modifyGroceryList(position, newItem);
        }else {
            System.out.println("Item: "+ searchItem +"not found");
        }

    }

    private void modifyGroceryList(int position, String newItem) {
        grocerylist.set(position, newItem);
        System.out.println("list: " + (position + 1) + " has been modfied");

    }
    public void removeItem(String searchItem){
        int position = findItem(searchItem);
        if (position >=0){
            removeItem(position);
        }else {
            System.out.println("Item: "+ searchItem +"not found");
        }

    }

    private void removeItem(int position) {
        String theItem = grocerylist.get(position);
        grocerylist.remove(position);
        System.out.println("the item: " + theItem + " is removed");
    }

    public boolean searchItem(String searchItem){
        int position = findItem(searchItem);
        if (position >=0){
            return true;
        }else {
            return  false;
        }

    }
    private int findItem(String searchItem) {
        return  grocerylist.indexOf(searchItem);

    }
}
