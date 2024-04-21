package ex13_ChatGPT.CollectionPractice.List;

import java.util.Arrays;

public class MyList<E> {// List컬렉션을 순수하게 구현하기 연습. 230517
    // get(); size(), add(), addByIndex(), delete()함수 구현하기.


    private static final int DEFAULT_CAPACITY = 4;
    private Object[] elements;
    private int size;

    MyList(){
        elements=new Object[DEFAULT_CAPACITY]; //0 1 2 3
        size=0;
    }

     public E get(int index){
        if(index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }
      return (E) elements[index];
    }

    public int size(){
        return size;
    }

    public int expandCapacity(){
        //Object[] newElements=new Object[size+1];
        //기존 배열요소 유지하면서, 크기가 1 커짐.
        elements= Arrays.copyOf(elements, elements.length+1); //4(DEFAULT_CAPACITY = 4)+1
        System.out.println("expandCapacity() length>> "+elements.length);
        return elements.length;
    }

    public void add(E element){
        if(elements.length == size){//4
            expandCapacity();
        }
        elements[size]=element;
        size++; // 5
    }

    public Boolean addByIndex(int index, E element) { // index=5
        //myListString1.인스턴스만들면서, 원칙은 size=0됨.
        Boolean added =false;
        if (elements.length == size) { //5 >=  5
            System.out.println("size, if (index >= size)>>"+size);
            expandCapacity(); //6
            added=true;
        }
            elements[index] = element;
            size++;
       return added;
    }


    public void set(int index, E element) {
        if(size >= index){
            elements[index]=element;
        }else
            throw new IndexOutOfBoundsException();
    }

    public void delete(int index){
//        int[] numbers = {1, 2, 3, 4, 5};
//        int index = 3; // 삭제할 요소의 인덱스. 3번.
        Object[] newArray=new Object[elements.length-1];
        int newIdx=0;
        for(int i=0; i<elements.length; i++){
            if(i !=index){
                newArray[newIdx]= elements[i];
                 newIdx++;
            }
        }
    }

    public Boolean remove(int index) {
        if(index <= size){
           delete(index);
           return true;
        }
        return false;
    }


    public boolean contains(E element) {
        for(int i=0; i<elements.length; i++){
            if(elements[i] == element){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element) {
        int idx=0;
        for(int i=0; i<elements.length; i++){
            if( elements[i].equals(element)){
                idx=i;
                break; //여기서 break안 하면, 일치해도 -1나옴.
            }else
                idx=-1;
        }// --for
        return idx;
    }

    public boolean isEmpty() {
        for(Object o : elements){
            if(o.equals(""))
                return true;
        }
     return false;
    }

    public void clear() {

    }



}
