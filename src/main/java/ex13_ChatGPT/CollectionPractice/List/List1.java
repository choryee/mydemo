package ex13_ChatGPT.CollectionPractice.List;

public class List1 {
    private int[] lists;
    private int last;

    List1(){
        this.lists=new int[4]; // 0 1 2 3
        this.last=0;
    }

    public void insert1(){
        for(int i=0; i<lists.length+1; i++){
           // lists[i]=i;
            int[] newList=new int[lists.length+1]; //5
            newList[i]=i;
            System.out.println("lists[i]>>"+newList[i]);
        }

    }
}
