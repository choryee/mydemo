package ex11_DesignPatten_YukiHirosi.adater;

public class TestAdapter {
    public static void main(String[] args) {
        GroceryList lists=new GroceryList();
        lists.addItem("apple");
        lists.addItem("water");
        lists.displayList();
    }
}
