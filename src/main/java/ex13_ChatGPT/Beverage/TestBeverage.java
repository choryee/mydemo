package ex13_ChatGPT.Beverage;

import java.lang.reflect.Method;

public class TestBeverage {
    public static void main(String[] args) throws ClassNotFoundException {
        for(Beverage beverage : Beverage.values()){
            System.out.println(beverage.getName());
        }

        VendingMachine<Beverage> vm=new VendingMachine<>();
        vm.addStock(Beverage.COLA, 10);
        vm.addStock(Beverage.CIDER, 10);
        System.out.println(vm.getAvailableBeverages());

        System.out.println(vm.getAvailableBeveragesMap());

        int aa=10;
        String st="11";
        Integer in=aa;
        Integer inSt=Integer.parseInt(st);
        System.out.println(in);
        System.out.println(inSt);

        Class clazz = Class.forName("java.lang.String");
        System.out.println("class name : " + clazz.getName());
//        Method[] methods = clazz.getDeclaredMethods();
//        for(Method method : methods) {
//            System.out.println("method : " + method.getName() + "modifier : " + method.getModifiers() + "return type : " + method.getReturnType());
//        }

        String str= String.format("고객명: %s", "Alice");
        System.out.println(str);
    }
}
