package ex13_ChatGPT.DrinkVending;

public class TestDrinkVending {
    public static void main(String[] args) {
        DrinkVendingMachine vm=new DrinkVendingMachine();

        vm.addStock(DrinkType.COKE, 10);

        System.out.println("selectDrink>>") ;
        vm.selectDrink(DrinkType.COKE);
        int a=vm.dispenseDrink1(DrinkType.COKE, 4);
        System.out.println(a);

        vm.dispenseDrink(DrinkType.COKE);
        System.out.println(vm.showAllStock());

        vm.printSaleReport();
        System.out.println("------------------------");

        vm.addStock(DrinkType.SPRITE, 20);
        vm.dispenseDrink(DrinkType.SPRITE);
        vm.printSaleReport();


    }
}
