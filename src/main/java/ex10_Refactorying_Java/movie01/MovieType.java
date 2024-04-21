package ex10_Refactorying_Java.movie01;

public enum MovieType {
    CHILDREN("어린이",5),
    REGULAR("일반", 10),
    NEW_RELEASE("신작", 5);

    private String name;
    private int quantity;

    MovieType(String name, int quantity){
        this.name=name;
        this.quantity=quantity;
    }

    public String getName(){
        return this.name;
    }

}
