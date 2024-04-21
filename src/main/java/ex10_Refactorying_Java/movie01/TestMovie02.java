package ex10_Refactorying_Java.movie01;

import lombok.Data;

import java.util.Optional;

public class TestMovie02 {
    public static void main(String[] args) {


            Person person = new Person();
            Car car = new Car();
            Insurance insurance = new Insurance();
            insurance.setName("Mutual");
            car.setInsurance(Optional.of(insurance));
            person.setCar(Optional.of(car));

//            String name = Optional.of(person)
//                    .map(Person::getCar)
//                    .map(Car::getInsurance)
//                    .map(Insurance::getName)
//                    .orElse("unknown");
                String name =
                        String.valueOf(Optional.of(person)
                                        .flatMap(Person::getCar)
                                                .orElse(new Car()));

            System.out.println(name);
        }


}

@Data
class Person{
    private Optional<Car> car;
    public Optional<Car> getCar(){
        return car;
    }
}
@Data
class Car{
    private Optional<Insurance> insurance;
    public Optional<Insurance> getInsurance(){
        return insurance;
    }
}

@Data
class Insurance{
    private String name;
    public String getName(){
        return name;
    }
}
