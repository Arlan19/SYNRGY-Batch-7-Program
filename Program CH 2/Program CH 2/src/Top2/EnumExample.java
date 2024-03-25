package Top2;



public class EnumExample {

    enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        switch (today){
            case MONDAY -> System.out.println("Today is Monday");
            case WEDNESDAY -> System.out.println("Today is Wednesday");
            default -> System.out.println("Today is not Monday or Wednesday");
        }

        Day[] days = Day.values();
        System.out.println("All days :");
        for (Day day : days){
            System.out.println(day);
        }
    }
}
