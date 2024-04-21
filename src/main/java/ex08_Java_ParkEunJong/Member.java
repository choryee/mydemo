package ex08_Java_ParkEunJong;

public class Member {
    private String name;
    private String memberId;

    Member(String name, String memberId){
        this.name=name;
        this.memberId=memberId;
    }

    public String getName(){
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public String toString(){
        return "name:"+name+"  "+"memberId :"+memberId;
    }
}
