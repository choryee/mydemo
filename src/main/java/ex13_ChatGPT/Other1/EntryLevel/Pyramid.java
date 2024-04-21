package ex13_ChatGPT.Other1.EntryLevel;

public class Pyramid {
    public static void main(String[] args) {
        int RowNum=6;
        for(int i=RowNum; i>0; i--){ //이 맨위 for는 전체의 반복에 관한것이고, 밑은 2개는 그 안에서 각각의 for문인것.
          //첫 한줄에 대해, 밑 2개의 for문이 각각 포함된 것.

            for(int j=0; j<=RowNum-j; j++){
                System.out.print(" ");
            }
            for(int k=RowNum; k>RowNum-i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
