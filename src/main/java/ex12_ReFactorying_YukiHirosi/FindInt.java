package ex12_ReFactorying_YukiHirosi;

public class FindInt {
    public static boolean find(int[] data, int target){
//        boolean flag=false;
//        for( int i=0; i<data.length && !flag; i++){
//            if(data[i] == target){
//                flag=true;
//            }
//        }
//        return flag;

        boolean found=false;
        for (int i=0; i<data.length; i++){
            if(data[i] == target){
                found=true;
                break;
            }
        }
        return found;
    }
}
