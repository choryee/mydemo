package ex08_Java_ParkEunJong;


import ex12_ReFactorying_YukiHirosi.Member;

import java.util.ArrayList;

public class MemberArrayList {

    //addMember(), removeMember(), showAllMember()

    ArrayList<Member> ArrayList;

    MemberArrayList(){
        this.ArrayList=new ArrayList<Member>();
    }

   // ArrayList<Member> ArrayList=new ArrayList<>();

    public int addMember(String name, String memberId){
        ArrayList.add(new Member(name, memberId));
        return ArrayList.size();
    }

    public ArrayList removeMember(String index) {
        int idx = 0;
        for (Member member : ArrayList) {
            String tmp = member.getMemberId();
            // int tmp1=Integer.parseInt(tmp);
            // String index=Integer.toString(idx);
            if (tmp == index) {
                idx = Integer.parseInt(index);
                ArrayList.remove(idx);
                return ArrayList;

            }
        }
        System.out.println(idx + "가 존재하지 않습니다.");
        return ArrayList;
    }

    public void showAllMember(){
        for(Member member : ArrayList){
            System.out.println("toString :"+member);
        }
        System.out.println();
    }

}
