package ex13_JavaCodingInterview.DrinkVendingMachine;

public class TestDrinkVendingMachine {
    public static void main(String[] args) {
        VendingMachine vm=new VendingMachine();
        vm.addProduct("Coke", 5, 1000);
        vm.addProduct("Pepsi", 10, 2000);
        vm.addProduct("Fanta", 9,1500);

        System.out.println(vm); //Coke=5, Coke=1000
        vm.displayInventory();
    }
}
