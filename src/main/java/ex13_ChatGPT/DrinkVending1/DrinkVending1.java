package ex13_ChatGPT.DrinkVending1;

import java.util.HashMap;
import java.util.Map;

enum DrinkType{
    // private static final COLA cola = new COLA();
    COLA("cola", 15),
    WATER("water", 10),
    SODA("soda",20);

    private String name;
    private int price;

    DrinkType(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price += price;
    }
}

class VendingMachine<T extends Enum<T>>{
    // 이 선언은 VendingMachine 클래스를 정의할 때, 제네릭 타입 T를 사용하며, 이 T는 열거형(Enum) 타입을 확장(상속)한 클래스만을 사용할 수 있음을 의미합니다.
    //
    //여기서 <T extends Enum<T>>는 T가 열거형 타입을 확장한 타입으로 제한한다는 의미입니다. 즉, T는 열거형 클래스와 유사한 특성을 가져야 합니다.
    private Map<Integer, T> drinkMap;

    public VendingMachine(Class<T> enumClass){
        drinkMap=new HashMap<>();
        int index=1;
        for(T drinkType : enumClass.getEnumConstants()){ // Map에 바로, put하는 것.
            drinkMap.put(index++, drinkType);
        }
    }

    public void displayDrinkOptions() {
        System.out.println("Available drinks :" );
        for(Map.Entry<Integer, T> entry : drinkMap.entrySet()){
            DrinkType drinkType= (DrinkType) entry.getValue();
            System.out.println(entry.getKey()+". "+drinkType.getName()+" $"+drinkType.getPrice());
        }
    }

    public T dispenseDrink(int selection) { //selection이 숫자만큼 배분(서빙)하는 것.
       DrinkType drinkType = (DrinkType)  drinkMap.get(selection); // T형을 찾는 것.
       if(drinkType !=null){
           System.out.println(drinkType.getName()+"is dispensed..");
       }
        return (T) drinkType;
    }
}

public class DrinkVending1 {
    public static void main(String[] args) {
// Map<DrinkType, Integer> stocks=new java.util.EnumMap<>(DrinkType.class);

        VendingMachine vm=new VendingMachine(DrinkType.class);

        vm.displayDrinkOptions();



    }
}
