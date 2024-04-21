package ex04_MyungPum;

public class MyClass<T> {
    private T val;
    public void set(T val){
        this.val=val;
    }

    public T get(){
        return val;
    }


    public static  void main(String[] args) {
        MyClass<String> myClass=new MyClass<>();
        myClass.set("good");
        System.out.println("get:"+myClass.get());


    }

}
