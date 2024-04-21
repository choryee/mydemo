package ex13_ChatGPT.DesignPatten.command;


import java.time.LocalDate;

interface Command{
    void execute();
}

class LightOnCommand implements Command{
    private Light light;

    LightOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
            light.turnOn();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

class Light{

    public void turnOn(){
        System.out.println("Light is ON");
    }

    public void turnOff(){
        System.out.println("Light is OFF");
    }
}

class RemoteControl{
    private Command command;

    public void setCommand(Command command){
        this.command=command;
    }

    public void pressButton(){
        command.execute();
    }
}

public class CommandPatternEx {
    public static void main(String[] args) {
        LightOnCommand loc=new LightOnCommand(new Light());
        loc.execute();

        RemoteControl rc=new RemoteControl();
        rc.setCommand(loc);

        LocalDate localDate;
        LocalDate now=LocalDate.now();
        System.out.println(now);




    }
}
