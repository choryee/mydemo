package ex11_DesignPatten_ChoiJuHo.Decoration.notification;

public class Test  {
    public static void main(String[] args) {
        Notifier notifier=new BasicNotifier();
        notifier.send();

        Notifier email=new EmailNotifier();

    }
}
