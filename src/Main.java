public class Main {
    public static void main(String[] args) {
        double price = 10.00;
        double salesTax;
        double tax = 0.05;

        salesTax = price * tax;

        System.out.println("Your purchase of $" + price + " has an added tax of $" + salesTax + " for a total of $" + (salesTax+price));

    }
}