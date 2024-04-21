package ex13_JavaCodingInterview.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class TestVendingMachine {
    public static void main(String[] args) {
    VendingMachine vm=new VendingMachine();

//    Selector selector=new VendingMachine();
//    List<Coin> coins=new ArrayList<>();
//    coins.add(1, Coin.DIME);
//    coins.add(2,Coin.QUARTER);
    // selector.buyBtn().putIfAbsent(Item.SKITTLES, coins);

    Inventory<Item> itemInventory=new Inventory<>();
    itemInventory.add(Item.SKITTLES);
    itemInventory.displayAllItems();

    Inventory<Coin> coinInventory=new Inventory<>();
    coinInventory.add(Coin.DIME);
    coinInventory.displayAllItems();

    }
}
