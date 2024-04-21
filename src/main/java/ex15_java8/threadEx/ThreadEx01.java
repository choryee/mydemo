package ex15_java8.threadEx;

class MyThread extends Thread{
    NumberAdd numberAdd;

    MyThread(NumberAdd numberAdd){
        this.numberAdd=numberAdd;
    }

    @Override
    public void run() {
        System.out.println("result : "+numberAdd.calNumber(3));
        numberAdd.calNumber(3);
    }
}

class NumberAdd{
    private int myData;

    NumberAdd(int inputData){
        myData=3;
        this.myData=inputData;
    }
    public int calNumber(int data){
        return  myData+data;

    }
}
public class ThreadEx01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(new NumberAdd(4));
        myThread.start();;

        Thread myThread1= new MyThread(new NumberAdd(5));
        myThread1.start();
        System.out.println(myThread1.getState());

    }

}
