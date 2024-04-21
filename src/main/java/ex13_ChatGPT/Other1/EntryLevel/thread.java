package ex13_ChatGPT.Other1.EntryLevel;

public class thread {
    public static void main(String[] args) {
        Thread thread1=new NumberPrinterThread("Thread1");
        Thread thread2=new NumberPrinterThread("Thread2");

        thread1.start();
        thread2.start();
    }

}

 class NumberPrinterThread extends Thread{
    private String threadName;

    NumberPrinterThread(String name){
        this.threadName=name;
    }

     @Override
     public void run() {
         for(int i=0; i<=5; i++){
             System.out.println(threadName + ": "+ i);
         }
         try {
             Thread.sleep(500);
         }catch (InterruptedException e){
             e.printStackTrace();
         }
     }
 }
