package ex13_JavaCodingInterview.DrinkVendingMachine;

public interface VendingMachineInterface {
    void addProduct(String product, int quantity, double price);
    void insertCoin(double amount);
    void purchaseProduct(String product);
    void displayInventory();
    double getTotalRevenue();
}
