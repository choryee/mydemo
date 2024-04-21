package ex13_ChatGPT.Other1.EntryLevel.primeNumber;

public class PrimeNumber {

    public static void main(String[] args) {
       PrimeNum primeNum=new PrimeNum();
       primeNum.pNumber(11);
    }
}


class PrimeNum{

    public int pNumber(int number) throws ArrayIndexOutOfBoundsException{
        int num=1;
        int idx=0;
        boolean found=false;
        int[] arr=new int[2];
       // int[] newArr=new int[2];
        try {
            for(int i=1 ; i<=number; i++){
                if(number % i == 0 ){
                    arr[idx]=i;
                    idx++;
                    found=true;

                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }


        System.out.println(found);

        for(int n : arr){
            System.out.print(n+", ");
        }
        return num;

    }
}
