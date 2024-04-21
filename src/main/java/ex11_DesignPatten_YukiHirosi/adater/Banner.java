package ex11_DesignPatten_YukiHirosi.adater;

public class Banner {
    private String string;

    Banner(String s){
        this.string=s;
    }

    void showWithParen(){
        System.out.println("("+string+")");
    }

    void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
