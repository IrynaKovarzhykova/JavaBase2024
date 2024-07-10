package homework15;

public class Demonstration {
    public static void main(String[] args) {
        Advisor advisor = (Advisor) new DayAdvisor();

        System.out.println("Advice for Monday:");
        advisor.advise(Day.MONDAY);

        System.out.println("\nAdvice for Friday:");
        advisor.advise(Day.FRIDAY);

        System.out.println("\nAdvice for Sunday:");
        advisor.advise(Day.SUNDAY);
    }
}

