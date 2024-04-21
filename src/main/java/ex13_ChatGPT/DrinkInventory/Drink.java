package ex13_ChatGPT.DrinkInventory;

public class Drink<T extends Enum<T>> {
    private T drinkType; //private String drinkType;

    Drink(T drinkType){
        this.drinkType=drinkType;
    }

    public T getDrinkType() {
        return drinkType;
    }
}
