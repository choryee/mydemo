package ex13_ChatGPT.CollectionPractice.List;

public class TestMyList {
    public static void main(String[] args) {

    MyList<String> myListString1=new MyList<>();
    myListString1.add("cup");
    myListString1.add("pen");
    myListString1.add("book");
    myListString1.add("paper");
    myListString1.add("phone"); //size=5

//    for(String s : myListString){
//        System.out.println(s);
//    }
        for(int i=0; i<myListString1.size(); i++){
            System.out.println(myListString1.get(i));
        }
        System.out.println("size>>"+myListString1.size());


        //myListString1.get(10);
        //boolean find=myListString1.contains("cup1");
        //System.out.println(find);

        boolean add= myListString1.addByIndex(6, "watch11");
        System.out.println("addByIndex>>"+add);
        System.out.println("-----------------");
//        boolean add1= myListString1.add(4, "watch");
//        System.out.println(add1);
        for(int i=0; i<myListString1.size(); i++){
            System.out.println(myListString1.get(i));
        }
        System.out.println("size>>"+myListString1.size());

//        int idx=myListString1.indexOf("pen");
//        System.out.println("idx>>"+idx);
//
//        Boolean isEmpty=myListString1.isEmpty();
//        System.out.println("isEmpty>>"+isEmpty);

      //  System.out.println("remove>>"+myListString1.remove(4));

//        for(int i=0; i<myListString1.size(); i++){
//            System.out.println(myListString1.get(i));
//        }

    }

}
