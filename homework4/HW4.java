package homework4;

public class HW4 {
    public static void main(String[] args) {
        int productNumber = 1;
        String productName = "Smartphone";
        double totalSales = 12153.41;
        int days = 5;
        double result = totalSales / days;

        System.out.printf("Product No %d:%s \n", productNumber, productName);
        System.out.printf("total sales for %d days is EUR %.2f,\n", days, totalSales);
        System.out.printf("sales by day is EUR %.2f.\n", result);


        productNumber = 2;
        productName = "Laptop";
        totalSales = 10486.85;
        days = 7;
        double result1 = totalSales / days;


        System.out.printf("Product No %d: %s,\n", productNumber, productName);
        System.out.printf("total sales for %d days is EUR %.2f,\n", days, totalSales);
        System.out.printf("sales by day is EUR %.2f.\n", result1);
    }
}
