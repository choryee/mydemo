package ex14_Dobby.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SetAnnualVacation {
    private Date yearIn;
    private int annualVacation;

    public void setBasicAnnualVacation(Date yearIn) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate=new Date();
        // Calendar 객체를 사용하여 작년 어제를 계산합니다.
        Calendar lastYearYesterday = Calendar.getInstance();
        lastYearYesterday.setTime(currentDate);
        lastYearYesterday.add(Calendar.YEAR, -1); // 1년 빼기
        lastYearYesterday.add(Calendar.DAY_OF_YEAR, -1); // 1일 빼기
        System.out.println("lastYearYesterday.getTime()>> "+ lastYearYesterday.getTime()); // 일년전 오늘 하루전

        if(yearIn.before(lastYearYesterday.getTime())){
            System.out.println(yearIn.before(lastYearYesterday.getTime()));
            setAnnualVacation(12);
        }else {
            System.out.println(yearIn.before(lastYearYesterday.getTime()));
            setAnnualVacation(0);
        }
    }

    public void setYearIn(Date yearIn) {
        this.yearIn = yearIn;
    }

    public Date getYearIn() {
        return yearIn;
    }

    public int getAnnualVacation() {
        return annualVacation;
    }

    public void setAnnualVacation(int annualVacation){
        this.annualVacation=annualVacation;
    }
}
