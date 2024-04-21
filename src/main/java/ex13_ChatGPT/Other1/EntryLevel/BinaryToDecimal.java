package ex13_ChatGPT.Other1.EntryLevel;

public class BinaryToDecimal {
    int binary=101110;

    int originalNum=binary;
    int numDigit=(int) Math.log10(originalNum)+1; // 6자리. 자리수 알아내기.
    int[] arr=new int[numDigit];
    public int[] intToIntArray(){
        //int num=0;
        for(int i=numDigit-1; i>0; i--){
            arr[i]=originalNum % 10;
            originalNum/=10;
            //System.out.print(arr[i]+" ");
        }
            return arr;
    }

    public int make_Decimal(){
        int base=2;
        int sum=0;
        int idx=0;

        for(int i=numDigit-1; i>0; i--){
            int result=(int) Math.pow(base, idx) * arr[i];
            sum+=result;
            idx++;
        }
        return sum;
    }


}
