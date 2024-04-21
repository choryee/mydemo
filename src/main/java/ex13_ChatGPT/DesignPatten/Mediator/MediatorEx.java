package ex13_ChatGPT.DesignPatten.Mediator;


import java.util.ArrayList;
import java.util.List;

// Mediator 인터페이스
interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

// ConcreteMediator 클래스
class ChatRoom implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }
    @Override
    public void addUser(User user) {
        users.add(user);
    }
}

// Colleague 클래스
class User {
    private String name;
    private ChatMediator chatMediator; // interface를 필드로 가질 수 있다.

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
        chatMediator.addUser(this);
    }

    public void sendMessage(String message) {
        chatMediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}

public class MediatorEx {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();

        User user1 = new User("Alice", chatMediator);
        User user2 = new User("Bob", chatMediator);
        User user3 = new User("Charlie", chatMediator);

        user1.sendMessage("Hello, everyone!"); // Output: Bob received message: Hello, everyone!
        //         Charlie received message: Hello, everyone!
       // user2.sendMessage("Hi, Alice!");      // Output: Alice received message: Hi, Alice!
        //         Charlie received message: Hi, Alice!
    }
}
