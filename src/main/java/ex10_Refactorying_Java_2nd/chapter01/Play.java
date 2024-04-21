package ex10_Refactorying_Java_2nd.chapter01;

public class Play {
    private String name;
    private PlayType type;

    public Play(String name, PlayType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public PlayType getType() {
        return type;
    }
}

