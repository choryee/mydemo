package ex13_ChatGPT.DrinkInventory;

public interface VendingMachine {
    void addDrink(DrinkType drinkType, int quantity);
    void removeDrink(DrinkType drinkType, int quantity);
    int getDrinkStock(DrinkType drinkType);
    void displayDrinkOptions();
}
