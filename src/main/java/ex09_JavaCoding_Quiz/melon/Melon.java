package ex09_JavaCoding_Quiz.melon;

public class Melon {
    private final String type;
    private final int weight;
    private final String origin;

    public Melon(String type, int weight, String origin){
        this.type=type;
        this.weight=weight;
        this.origin=origin;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public String getOrigin() {
        return origin;
    }

    public String toString(){
        return "type :"+type+" "+"weight: "+weight+" "+"origin: "+origin;
    }
}
