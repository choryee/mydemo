package ex10_Refactorying_Java_2nd.chapter06.introduceParameterObject;

import java.time.LocalDateTime;

public class Reading {
    protected int temp;
    protected LocalDateTime time;

    public Reading(int temp) {
        this.temp = temp;
        time = LocalDateTime.now();
    }
}
