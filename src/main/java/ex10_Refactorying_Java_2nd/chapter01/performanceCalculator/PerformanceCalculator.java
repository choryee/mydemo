package ex10_Refactorying_Java_2nd.chapter01.performanceCalculator;

import ex10_Refactorying_Java_2nd.chapter01.Performance;
import ex10_Refactorying_Java_2nd.chapter01.Play;
import ex10_Refactorying_Java_2nd.chapter01.PlayType;

public class PerformanceCalculator { // xxxCalculator의 부모인 클래스.
    protected Performance performance;
    protected Play play;

    public PerformanceCalculator(Performance performance, Play play) {
        this.performance = performance;
        this.play = play;
    }

    public int amountFor() throws Exception {
        throw new Exception("서브 클래스에서 이르 모두 구현했습니다.");
    }

    public int volumeCreditFor() throws Exception {
        throw new Exception("서브 클래스에서 이르 모두 구현했습니다.");
    }
}
