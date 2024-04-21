package ex11_DesignPatten_YukiHirosi.adater;

public class TestShopList {

    public static void main(String[] args) {
        ShopList list=new ShopList();
        list.addItems("cup");
        list.addItems("pen");
        list.addItems("car");
        list.addItems("glasses");

        list.displayAll();

        list.removeItem("pen");
    }
}
