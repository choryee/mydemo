package ex13_JavaCodingInterview.VendingMachine;

public enum Item {
    SKITTLES("Skittles", 15), TWIX("Twix", 35   ),SNICKERS("Snickers", 25);

    private String name;
    private int price;
    Item(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


}
