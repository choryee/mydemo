package ex13_ChatGPT.EnumMapTest;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumClassExample {
    public static void main(String[] args) {
        Class<Day> enumClass=Day.class;
        //System.out.println(enumClass);

        Day[] days=enumClass.getEnumConstants();
        for(Day d : days){
            System.out.println(d);
        }

        // Get enum constant by name
        String dayName = "FRIDAY";
        Day friday = Enum.valueOf(enumClass, dayName);
        System.out.println("Enum constant " + dayName + " is " + friday);

        // Check if the class is an enum
        boolean isEnum = enumClass.isEnum();
        System.out.println("Is " + enumClass.getSimpleName() + " an enum? " + isEnum);
    }

    }

