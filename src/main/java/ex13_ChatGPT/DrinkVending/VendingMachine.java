package ex13_ChatGPT.DrinkVending;

public interface VendingMachine {
    void insertCoin(int amount);
    void selectDrink(DrinkType drinkType);
    //void dispenseDrink(T t);
    void printSaleReport();
}
