package homework12;

public class Constructor {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", "Engineer", "john.doe@example.com", "123456789", 30);
        Employee emp2 = new Employee("Jane Smith", "Manager", "jane.smith@example.com", "987654321", 40);

        emp1.printInfo();
        emp2.printInfo();

        Car car = new Car();
        car.start();
    }
}