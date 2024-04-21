package ex10_Refactorying_Java_2nd.chapter01.performanceCalculator;

import ex10_Refactorying_Java_2nd.chapter01.Performance;
import ex10_Refactorying_Java_2nd.chapter01.Play;

public class PerformanceCalculatorFactory {

    //PerformanceCalculator반환형 매소드.
    // TRAGEDY, COMEDY 인지에 따라, xxxCalculator종류를 다르게 반환하는 것.
    public PerformanceCalculator createPerformanceCalculator(Performance performance, Play play) throws Exception {

        switch (play.getType()) {
            case TRAGEDY:
                return new TragedyCalculator(performance, play);
            case COMEDY:
                return new ComedyCalculator(performance, play);
            default: // 위 둘에 해당 없을때, 타는 것.
                throw new Exception("알 수 없는 타입입니다.");
        }

    }
}
