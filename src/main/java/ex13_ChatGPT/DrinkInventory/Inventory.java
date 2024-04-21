package ex13_ChatGPT.DrinkInventory;

import java.util.HashMap;
import java.util.Map;

public class Inventory implements VendingMachine{
    private Map<DrinkType, Integer> drinkStock;

    Inventory(){
        drinkStock=new HashMap<>();
    }

    @Override
    public void addDrink(DrinkType drinkType, int quantity) {
        drinkStock.put(drinkType, quantity);
    }

    @Override
    public void removeDrink(DrinkType drinkType, int quantity) {
        drinkStock.remove(drinkType, quantity);
    }

    @Override
    public int getDrinkStock(DrinkType drinkType) {
        return drinkStock.get(drinkType);
    }

    @Override
    public void displayDrinkOptions() {
        System.out.println("Available Drinks:"); //제품, 수
        for(DrinkType drinkType : drinkStock.keySet()){
            System.out.println("drink타입: "+drinkType+
                    "개수는 "+drinkStock.get(drinkType));
        }
    }
}
