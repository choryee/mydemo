package ex13_ChatGPT.Other1.EntryLevel;

public class PersonExample {
    public static void main(String[] args) {
        Person person1=createPerson("Alice", 30);
        Person person2=new Person("Kim", 11);


    }
    public static Person createPerson(String name, int age){
        return new Person(name, age);
    }

}

class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
