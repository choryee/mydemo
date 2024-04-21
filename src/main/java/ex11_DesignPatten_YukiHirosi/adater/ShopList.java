package ex11_DesignPatten_YukiHirosi.adater;

public class ShopList {

    private String[] items;
    public int last = 0;

    ShopList() {
        this.items = new String[4];
    }

    public void addItems(String s) {
        items[last] = s;
        last++;
    }

    public void displayAll(){
        for(int i=0; i<items.length; i++){
            System.out.println("items: "+ items[i]);
        }
    }

    public void removeItem(String input) {
        int idx = -1;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(input)) {
                idx = i;
            }
        }
        String[] newArray = new String[items.length - 1];
        for (int i = 0, j = 0; i < items.length; i++) {
            if (idx != i) {
                newArray[j] = items[i];
                System.out.println("newArray>>" + newArray[j]);
            }
        }
    }


//    public void removeItems(String input) {
//       String match = null;
//       int idx=-1;
//       for(int i=0; i<items.length; i++){
//           if(items[i].equals(input)){
//               System.out.println("input>>"+items[i]);
//               match=items[i];
//               idx=i; //idx=1
//           }
//       }
//       String[] newArray=new String[items.length-1];
//        int newInt=0;
//       for(int i=0, j=0; i<items.length; i++){
//            if( i !=idx){
//                newArray[j]=items[i];
//                j++;
//            }
//               // System.out.println("newArray:"+newArray[i]);
//       }
//
//    }

}
