package ex12_ReFactorying_YukiHirosi;

public class RobotCommand {
    private String _name;
    RobotCommand(String name){
        _name=name;
    }

    public String toString(){
        return "[RobotCommand :"+_name+"]";
    }
}
