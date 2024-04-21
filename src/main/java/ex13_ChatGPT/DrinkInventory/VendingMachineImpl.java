package ex13_ChatGPT.DrinkInventory;//package ex13_ChatGPT.DrinkInventory;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static javafx.scene.input.KeyCode.D;
//import static javafx.scene.input.KeyCode.T;
//
//public class VendingMachineImpl implements VendingMachine   {
//    private List<Drink> drinks;
//
//
//
//    public VendingMachineImpl() { //기본 생성자.
//        drinks = new ArrayList<>();
//    }
//
//
//
//    @Override
//    public void removeDrink(DrinkType drinkType, int quantity) {
//        for(int i=0; i<quantity; i++){
//            Drink drink=new Drink(drinkType);
//            drinks.remove(drink);
//        }
//    }
//
//
//    @Override
//    public void addDrink(DrinkType drinkType, int quantity) {
//        for (int i = 0; i < quantity; i++) {
//            Drink drink = new Drink(drinkType);
//            drinks.add(drink);
//            System.out.println("test--addDrink");
//
//        }
//    }
//
//    @Override
//    public int getDrinkStock(DrinkType drinkType) {
////        for(int i=0; i<drinks.size(); i++){
////            Drink drink=new Drink(drinkType);
////
////            boolean stockInt=drinks.get(i).equals(drinkType);
////            if(stockInt){
////                System.out.println("drinks.get>>"+drinks.get(i));
////            }
////        }
//                   int count = 0;
//                   for (Drink drink : drinks) {
//                        if (drink.getDrinkType() == drinkType) {
//                            count++;
//                        }
//                    }
////            for(int i=0; i<drinks.size(); i++){
////                Drink drink=new Drink(drinkType);
////                if(drink.getDrinkType() == drinkType){
////                    count++;
////                }
////            }
//        return count;
//    }
//
//    public int getAllDrinks(){
////        Drink drink =new Drink<>(drinkType);
////        drinks.add(drink);
//
////        for(int i=0; i<drinks.size(); i++){
////            if(drinks.get(i) == drink){
////            System.out.println(drinks.add());
////            }
////         }
//        System.out.println("test----");
//        return 0;
//    }
//
//    @Override
//    public void displayDrinkOptions() {
//
//    }
//}
