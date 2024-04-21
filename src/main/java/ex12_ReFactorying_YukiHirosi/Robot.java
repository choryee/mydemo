package ex12_ReFactorying_YukiHirosi;

public class Robot {
//    public static final int COMMAND_WALK=0;
//    public static final int COMMAND_STOP=1;
//    public static final int COMMAND_JUMP=2;

//    public static final RobotCommand COMMAND_WALK=new RobotCommand("WALK");
//    public static final RobotCommand COMMAND_STOP=new RobotCommand("STOP");
//    public static final RobotCommand COMMAND_JUMP=new RobotCommand("JUMP");

    public enum Command{WALK, STOP, JUMP};

    private String _name;
    Robot(String  name){
        this._name=name;
    }

//    public void order(Robot.Command command){ //enum사용시.
//        if(command == Command.WALK){
//            System.out.println(_name+" walks.");
//        }else if(command == COMMAND_STOP){
//            System.out.println(_name+" stop.");
//        }else if(command == COMMAND_JUMP){
//            System.out.println(_name+" jumps.");
//        }else{
//            System.out.println("command error. command="+command);
//        }
//
//    }


}


