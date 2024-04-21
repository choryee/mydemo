package ex09_JavaCoding_Quiz.melon2;

public class GacMelonPredicate implements MelonPredicate{

    @Override
    public boolean test(Melon melon) {
        return "haha".equalsIgnoreCase(melon.getType());
    }

//    @Override
//    public boolean testTwoParameter(Melon melon, String type) {
//        return melon.getType() == type;
//    }
}
