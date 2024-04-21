package ex04_MyungPum;

import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList<String> arr = new ArrayList<String>();

		for(int i=0; i<4; i++) {
			System.out.println("이름을 입력하세요");
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			arr.add(name);
		}// for
		// System.out.println("arr" + arr);
		for(int i=0; i<arr.size(); i++){
			System.out.println("name:"+arr.get(i));
		}

		System.out.println("-----------------");
//		String longestName="";
//		for(int i=0; i<arr.size(); i++){
//			if( arr.get(i).length()> longestName.length()) {
//				longestName = arr.get(i);
//			}
//		}

		int longestIndex=0;
		for(int i=0; i<arr.size(); i++){
			if( arr.get(longestIndex).length() < arr.get(i).length()){
				longestIndex=i;
			}
		}
			System.out.println("longestName:"+arr.get(longestIndex));

	}
}
