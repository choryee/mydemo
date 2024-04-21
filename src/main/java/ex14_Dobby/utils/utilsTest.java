package ex14_Dobby.utils;

import java.util.Calendar;
import java.util.Date;

public class utilsTest {
    public static void main(String[] args) {
       // Date yearIn=new Date();
        //yearIn.setTime(2022-11-2);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022,10,1); //월(Month)은 0부터 시작하므로, 10은 11월을 나타냅니다.
        Date yearIn = calendar.getTime();

        SetAnnualVacation sav=new SetAnnualVacation();
        sav.setBasicAnnualVacation(yearIn);
        System.out.println("Annual Vacation: " + sav.getAnnualVacation());

    }
}
