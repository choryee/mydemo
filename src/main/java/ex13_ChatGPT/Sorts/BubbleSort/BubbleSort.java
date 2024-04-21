package ex13_ChatGPT.Sorts.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={4,2,7,1,9,8};
        test test=new test();
        test.sort(nums);
        //System.out.println(Arrays.toString(test.sort(test.sort(nums))));
    }
}

class test{
    public int[] sort(int[] nums){
        int idx=nums[0];
        int[] arr=new int[nums.length];
        int[] newArr=new int[nums.length];

        for(int i=1; i<2; i++){
            for(int j=i-1; j>=0; j--){ // j i
                if(nums[j] > nums[i]){
//                    idx=i;
//                    System.out.print(idx);
                    nums[i] = nums[j];
                    nums[j] = nums[i];
                }
//                if(arr[i] > arr[j]){
//                    newArr[i]=arr[j];
//                    newArr[j]=arr[i];
//                }

            }
        }

        for (int num : nums){
            System.out.print(num+" ");
        }

        return arr;
    }
}
