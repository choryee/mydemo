package ex11_DesignPatten_YukiHirosi.adater;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    private List<String> items;

    GroceryList(){
        this.items=new ArrayList<>();
    }

    public void addItem(String item){
        items.add(item);
    }

    public void removeItem(String item){
        items.remove(item);
    }

    public void displayList(){
        System.out.println("Items: ");
        for(String s : items){
            System.out.println(s);
        }
    }
}
