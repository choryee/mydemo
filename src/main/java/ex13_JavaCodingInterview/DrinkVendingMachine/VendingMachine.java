package ex13_JavaCodingInterview.DrinkVendingMachine;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class VendingMachine implements VendingMachineInterface{
    private Map<String, Integer> inventory; //상품=수량
    private Map<String, Double> prices; //상품= 가격
    private double totalRevenue;

    VendingMachine(){
        inventory=new HashMap<>();
        prices=new HashMap<>();
        totalRevenue=0.0;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "inventory=" + inventory +
                ", prices=" + prices +
                ", totalRevenue=" + totalRevenue +
                '}';
    }

    public void addProduct(String product, int quantity, double price){
        inventory.put(product, quantity); //상품=수량
        prices.put(product, price); //상품= 가격
    }

    public void insertCoin(double amount){
        // 실제로는 동전 처리 로직이 들어갈 수 있음
        //  여기서는 단순히 투입한 금액을 출력
        //if (amount <= 0) {
        //        System.out.println("Invalid coin amount. Please insert a valid amount.");
        //        return;
        //    }
        //예를 들어, 동전을 특정 장치에 투입하고, 투입한 금액을 누적하거나 화면에 표시하는 등의 동작을 수행할 수 있습니다.
        // 이는 구체적인 동전 처리 방식에 따라 달라질 수 있으며, 자판기 시스템에서 사용되는 동전 인식 장치나 알고리즘 등을 활용하여 구현할 수 있습니다.
        System.out.println("Inserted: $"+amount);
    }

    //위의 코드는 자판기의 제품을 구매하는 동작을 구현한 예시입니다.
    // 제품의 재고 여부와 가격을 확인하고, 구매 가능한 경우에는 제품을 출하하고 재고와 매출을 업데이트합니다. 그렇지 않은 경우에는 해당 상황에 맞는 메시지를 출력합니다.
    public void purchaseProduct(String product){
     //일반적으로 제품의 가격이 0 이하인 경우는 제품이 유효하지 않거나 구매할 수 없는 상태를 나타냅니다.
        // 예를 들어, 가격 정보가 제대로 설정되지 않았거나 품절된 제품의 가격을 0으로 설정한 경우 등이 해당될 수 있습니다.
        if( inventory.get(product)>0 ){ //재고 있으면,
           double price = prices.get(product);
           if(price<=0){ //가격 정보가 제대로 설정되지 않았거나
               System.out.println("Product is not available for purchase");
           }else { // 가격 정보가 제대로
              int quan= inventory.get(product);
              inventory.put(product, quan-1);
              totalRevenue=totalRevenue+price;
           }
        }else { //재고 없으면,
            System.out.println("sold out!!");
        }
    }

    public void displayInventory(){ //제품=수량
//        Set<String> keys=inventory.keySet();
//        Iterator<String> it=keys.iterator();
//        while(it.hasNext()){
//            String key=it.next();
//            int value=inventory.get(key);
//            System.out.println("product:"+key+", "+"quantity:"+value);
//        }
        for(String product : inventory.keySet()){
            System.out.println("product : "+product+", quantity:"+inventory.get(product));
        }

    }

    @Override
    public double getTotalRevenue() {
        return totalRevenue;
    }
}
