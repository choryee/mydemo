package ex11_DesignPatten_YukiHirosi.adater;

public class PrintBanner extends Banner implements Print { //PrintBanner 어댑터 역할.
    PrintBanner(String s){
        super(s);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
