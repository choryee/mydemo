package ex09_JavaCoding_Quiz.melon;

public class GacMelonPredicate implements MelonPredicate    {

    @Override
    public boolean test(Melon melon) {
        return "Gac".equals(melon.getType());
    }
}
