package ex13_ChatGPT.CollectionPractice.List;

public class List<T> {
    private T[] lists;

    public List(){
        this.lists= (T[]) new Object[3];
    }

    public void insert(T t){

//        for(int i = 0; int<lists.length; i++){
//        }
        for(T t1 : lists){
            System.out.println(t);
        }
    }



}
