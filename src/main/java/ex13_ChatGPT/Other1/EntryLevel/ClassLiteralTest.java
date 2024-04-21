package ex13_ChatGPT.Other1.EntryLevel;

public class ClassLiteralTest {
}

class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class Example {
    //인스턴스 생성과 클래스 정보을 사용 위해 :
    // 클래스 리터럴을 사용하면, 제네릭 타입에서, 클래스 정보를, 사용할 수 있습니다.
    // 예를 들어, 제네릭 클래스나 메소드에서, 클래스 타입을 인자로 받아, 해당 클래스의 인스턴스를 생성하거나 조작하는 것이 가능합니다.
    public static <T> T createInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }

    public static void main(String[] args) {
        try {
            Box<String> stringBox = createInstance(Box.class); // Create Box<String> instance
            Box<String> stringBox1=new Box<>();
            stringBox.setValue("Hello, Generics!");

            Box<Integer> intBox = createInstance(Box.class); // Create Box<Integer> instance
            intBox.setValue(42);

            System.out.println(stringBox.getValue());
            System.out.println(intBox.getValue());
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

