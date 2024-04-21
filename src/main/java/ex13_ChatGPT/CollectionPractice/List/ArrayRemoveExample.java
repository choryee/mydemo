package ex13_ChatGPT.CollectionPractice.List;

public class ArrayRemoveExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int indexToRemove = 3; // 삭제할 요소의 인덱스. 3번.
        System.out.println("numbers.length>>"+numbers.length);//5

       // int[] newArr=new int[];
        int[] newArr=new int[numbers.length-1];
        int newIndex=0;
        for(int i=0; i<numbers.length; i++){ //i<numbers.length; 를 newArr.length로 하니 안 나옴.
            if(i !=indexToRemove) {
                newArr[newIndex]=numbers[i];
                newIndex++;
            }
        }


//        for(int i=0; i<numbers.length; i++){
//            if( (i != indexToRemove)){
//               // int num=numbers[indexToRemove]; //3번
//                for(int k=0,j=0; k<newArr.length; k++){
//                    newArr[j]=numbers[k];
//                }
//            }
//        }


        for(int a=0; a<newArr.length; a++){
            System.out.println(newArr[a]);
        }

    }
}
