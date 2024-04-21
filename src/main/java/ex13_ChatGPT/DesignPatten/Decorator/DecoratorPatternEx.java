package ex13_ChatGPT.DesignPatten.Decorator;

// Component 인터페이스
interface Coffee {
    double cost();
    String description();
}

// ConcreteComponent 클래스
class BasicCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String description() {
        return "Basic Coffee";
    }
}

// Decorator 클래스
abstract class CoffeeDecorator implements Coffee {
    //추상 클래스로 만든이유는 이 클래스를 상속한 다른 클래스가 매소드 오버라이드를 하기 위해서 인가?
    //예, 맞습니다. `CoffeeDecorator` 추상 클래스를 만든 주된 이유 중 하나는 이 클래스를 상속한 다른 클래스에서 메서드 오버라이드를 하기 위해서입니다.
    //
    //데코레이터 패턴에서 `CoffeeDecorator` 클래스는 기존의 `Coffee` 객체에 새로운 동작을 추가하는 역할을 합니다. 이때 `CoffeeDecorator` 클래스의 구조는 모든 데코레이터 클래스에 공통적으로 적용되며, 각각의 데코레이터 클래스는 추가되는 동작의 세부 내용을 구현할 필요가 있습니다.
    //
    //따라서 `CoffeeDecorator` 추상 클래스에서는 `Coffee` 인터페이스의 메서드를 구현하면서도, 각각의 데코레이터 클래스에서 오버라이드할 수 있는 메서드를 제공하고 있습니다. 이렇게 함으로써 각 데코레이터 클래스는 자신만의 특화된 동작을 추가하면서도, 공통적인 기능을 재사용할 수 있게 됩니다.
    //
    //즉, `CoffeeDecorator` 클래스를 추상 클래스로 만들어 메서드 오버라이드를 유도하고 효율적인 코드 재사용과 확장성을 가능하게 하는 것이 데코레이터 패턴의 핵심 아이디어입니다.
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }

    @Override
    public String description() {
        return decoratedCoffee.description();
    }
}

// ConcreteDecorator 클래스
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        //super(coffee);는 MilkDecorator 클래스의 생성자에서 부모 클래스인 CoffeeDecorator의 생성자를 호출하는 코드입니다.
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }

    @Override
    public String description() {
        return super.description() + ", Milk";
    }
}

class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }

    @Override
    public String description() {
        return super.description() + ", Caramel";
    }
}

public class DecoratorPatternEx {
    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee();
        Coffee milkCoffee = new MilkDecorator(basicCoffee);
        Coffee caramelMilkCoffee = new CaramelDecorator(milkCoffee);

        System.out.println("Cost: " + caramelMilkCoffee.cost()); // Output: Cost: 4.5
        System.out.println("Description: " + caramelMilkCoffee.description()); // Output: Description: Basic Coffee, Milk, Caramel
    }
}

