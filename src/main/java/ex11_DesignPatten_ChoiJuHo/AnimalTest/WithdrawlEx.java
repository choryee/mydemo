package ex11_DesignPatten_ChoiJuHo.AnimalTest;

abstract class Withdraw{


    abstract void getName();
    abstract String makeSound();

    void get() {

    }
}

class Hog extends Withdraw{
    private String name;

    Hog(String name){
        this.name=name;
    }

    @Override
    void getName() {
        System.out.println("name >>"+ name);
    }

    @Override
    String makeSound() {
        return "walwal..";
    }
}
public class WithdrawlEx {
    public static void main(String[] args) {
        Withdraw wi=new Hog("pig");
        Hog hog=new Hog("hog");

        wi.getName();
        System.out.println(wi.makeSound());

    }
}
