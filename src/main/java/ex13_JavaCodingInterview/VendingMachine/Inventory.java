package ex13_JavaCodingInterview.VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {
    private Map<T, Integer> inventory=new HashMap<>(); //Skittles:10


    protected int getQuantity(T item){
        Integer quantity=inventory.get(item); //get(key)
        return quantity == null ? null:quantity;
    }

    protected boolean hasItem(T item){
        return getQuantity(item)>0;
    }


    protected void clear() {}
    protected void add(T item) {
        inventory.put(item, 10);
    }
    protected void put(T item, int quantity) {
        inventory.put(item, quantity);
    }
    protected void deduct(T item) {}
    protected void displayAllItems(){
        for(T t : inventory.keySet()){
            System.out.println("Item/Coin :"+ t+", quantity :"+inventory.get(t));
        }
    }


}
