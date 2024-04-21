package ex13_ChatGPT.Person;

public class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PersonFactory{
    protected String name;

    public  Person make_Persons(String name, int age){
        return new Person(name, age);
    }
}
class PersonTest {
    public static void main(String[] args) {
        Person[] persons={new Person("aa", 11), new Person("bb", 22), new Person("dd", 33)};
        for( Person p : persons){
            System.out.println(p);
        }
        System.out.println("-------");
        PersonFactory pf=new PersonFactory();
        Person p1=pf.make_Persons("ee", 43);
        Person[] people={pf.make_Persons("ff", 55), pf.make_Persons("gg", 34)};
        for(Person p : people){
            System.out.println(p);
        }
    }

}
