
package ex04_MyungPum1;

class Person {
    public int age;

    Person(int age) {
        this.age = age;
    }

    public void result(int age) {
        System.out.println(age);
    }
}

public class objectTest1 {
    public static void main(String[] args) {
        // Person p = new Person();
        // p.age = 17;
        Person p = new Person(13);
        System.out.println(p.age);
        System.out.println("aaa");

    }
}