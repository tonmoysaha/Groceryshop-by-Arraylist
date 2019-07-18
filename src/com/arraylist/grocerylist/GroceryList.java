package com.arraylist.grocerylist;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> grocerylist = new ArrayList<>();

    public void add(String item) {
        grocerylist.add(item);
    }
    public void printGroceryList(){
        System.out.println("totall item in GroceryList: "+grocerylist.size()+"item list: ");
        for (int i=0;i<grocerylist.size();i++){
            System.out.println("list: "+(i+1)+"items: "+grocerylist.get(i));
        }
    }

    public void modifyGroceryList(int position, String newItem) {
        grocerylist.set(position, newItem);
        System.out.println("list: "+(i+1)+"items: "+grocerylist.get(i));

    }

    public void removeItem(int position) {
        String theItem = grocerylist.get(position);
        grocerylist.remove(position);
    }
}
