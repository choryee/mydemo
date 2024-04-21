package ex11_DesignPatten_ChoiJuHo.Decoration.notification;

public class BasicNotifier implements Notifier{


    @Override
    public void send() {
        System.out.println("기본 알림...");
    }
}
