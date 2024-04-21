package ex12_ReFactorying_YukiHirosi;

public class TestPerson {
    public static void main(String[] args) {
        Person[] persons=new Person[3];

        persons[0]=new Person("bob", "21");
        persons[1]=new Person("Alice", "11");
        persons[2]=new Person("Chuck", "40");

        for(Person person : persons){
            System.out.println("Person :  "+person.toString());
        }
    }
}
