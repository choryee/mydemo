package ex12_ReFactorying_YukiHirosi;

//import static Factorying_YukiHirosi.Test.degreeToRadian;

class Test{
    public double radian=180.0d;
    public double pi=3.141592d;

    public double degreeToRadian(double degree){
        return degree/radian*pi;
    }


}

public class TestRobot {
    public static void main(String[] args) {
        Robot robot = new Robot("Park");
       // robot.order(Robot.COMMAND_WALK);
     //   RobotCommand robotCommandWalk=new RobotCommand("WALK");
      //  robot.order(Robot.COMMAND_WALK); //상수 접근시. Robot.써야.
       // System.out.println(robot.order(2));

        Test test=new Test();
        System.out.println(test.degreeToRadian(100));


        //System.out.println(  degreeToRadian(100));


    }



}
