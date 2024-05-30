package homework4;

public class HW5 {
    public static void main(String[] args) {
        double income = 30000;
        double taxAmount = 0;

        if (income <= 10000) {
            taxAmount = income * 0.025;
        } else if (income <= 25000) {
            taxAmount = income * 0.025 + (income - 10000) * 0.043;
        } else {
            taxAmount = (income * 0.025 + 15000 * 0.043 + (income - 25000) * 0.067);

            System.out.println("Income: " + income);
            System.out.println("Tax Amount: " + taxAmount);
        }
    }

}
