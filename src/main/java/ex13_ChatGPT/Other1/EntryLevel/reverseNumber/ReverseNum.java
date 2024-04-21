package ex13_ChatGPT.Other1.EntryLevel.reverseNumber;

public class ReverseNum {

    public static final int reverseNum=4567;
    int num=6789;

    public int[] reverseNumber(int input){ // 3456
        Integer integer=input;
        int[] nums=new int[4];
        int index=10;
        for(int i=0; i<nums.length; i++){
                int newNum=input%index;
                nums[i]=newNum;
                index*=10;
        }
        return nums;
    }

    public int[] Array(int[] arr){
        int idx=1;
        int[] newArr=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int num=arr[i]/idx;
            newArr[i]=num;
            idx*=10;

        System.out.println(newArr[i]);
        }
        return newArr;
    }

}
