package ex09_JavaCoding_Quiz.P169_FactoryPattern.src.modern.challenge;

public class Main {

    public static void main(String[] args) {

        Melon melon = (Melon) MelonFactory.newInstance("Gac", 2000, "red");
        Gac gac = (Gac) MelonFactory.newInstance(Gac.class);

        System.out.println("Melon: " + melon);
        System.out.println("Gac: " + gac);
    }
    
}
