package ex11_DesignPatten_ChoiJuHo.Decoration.notification;

public class EmailNotifier implements Notifier{

    @Override
    public void send() {
        System.out.println("이메일 알람...");
    }
}
