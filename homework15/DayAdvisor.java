package homework15;

public class DayAdvisor implements Advisor {
    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Stay focused and be productive at work!");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend! Visit a park, watch a movie, or enjoy your favorite hobby.");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}

