package ex09_JavaCoding_Quiz.P169_FactoryPattern.src.modern.challenge;

public class Melon implements Fruit{

    private final String type;
    private final int weight;
    private final String color;

    public Melon(String type, int weight, String color) {
        this.type = type;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return type + "(" + weight + "g, " + color + ")";
    }
}
