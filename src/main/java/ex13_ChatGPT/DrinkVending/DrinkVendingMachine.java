package ex13_ChatGPT.DrinkVending;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//enum, 인터페이스, Map, List , 제네릭 클랙스를 사용해서 음료수 자판기를 구현하는 코드를 개별 클래스로 만들어라
public class DrinkVendingMachine<T extends Enum<T>> implements  VendingMachine {
    private Map<T, Integer> stock; //COKE, SPRITE, FANTA 마다 상품:수량
    private List<T> salesHistory; // COKE, SPRITE, FANTA 마다 기록
    private int currentCoin;
    private int totalQuantity;

    DrinkVendingMachine(){
        stock=new HashMap<>();
        salesHistory=new ArrayList<>();
        currentCoin=0;
        totalQuantity=0;
    }



    @Override
    public void insertCoin(int amount) { //투입한 동전의 갯수 합.
        currentCoin+=amount;
        System.out.println(amount + "원이 투입되었습니다.");
    }

    @Override
    public void selectDrink(DrinkType drinkType) {
        //stock.put(T t , 1);
        if(! stock.containsKey(drinkType) || stock.get(drinkType)<0){
            System.out.println(drinkType + "은(는) 품절되었습니다.");
        }else {
            System.out.println(drinkType + "을 선택하셨습니다..");
        }

//        for(T t : stock.keySet()){
//            System.out.println("type : "+t+" 수량: "+stock.get(t));
//        }
    }


    public int dispenseDrink1(DrinkType drinkType,  int quan) {
        // 음료수를 실제로 제공하는 로직
        // ...
        // 판매 이력에 추가
       // salesHistory.add(T t);

        // 재고 감소.
        int quant=0;

        quant=stock.get(drinkType);
        System.out.println("quant>>"+quant);

        totalQuantity=quant-quan;
        //System.out.println("totalQuantity>>"+totalQuantity);
        return totalQuantity;
    }

   // @Override
    public void dispenseDrink(T t) {// 자판기에서 제품 내보내기.
        salesHistory.add(t);
        stock.put(t, stock.get(t)-1);
        System.out.println(t + "이(가) 나왔습니다.");
    }

    public Map<T, Integer>showAllStock(){
//        for(T t : stock.keySet()){
//            System.out.println("type : "+t+"수량은 "+stock.get(t));
//        }
        return stock;
    }

    public  Map<T, Integer> addStock(T drinkType, int quantity){
        stock.put(drinkType, quantity);//int형됨.
        return stock;
    }

    @Override
    public void printSaleReport() {
        // private List<T> salesHistory; // COKE, SPRITE, FANT 상품 마다 기록

        for(T t : salesHistory){
            System.out.println("type 은 "+t+"입니다.");
        }

    }
}
