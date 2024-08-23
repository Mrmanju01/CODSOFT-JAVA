import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");

        // Hardcoded exchange rates (as of the last knowledge update in 2022)
        double usdToEuroRate = 0.85;
        double usdToGBPRate = 0.73;

        System.out.print("Enter the amount in USD: ");
        double amountInUSD = scanner.nextDouble();

        System.out.println("Choose the currency to convert to:");
        System.out.println("1. Euro (EUR)");
        System.out.println("2. British Pound (GBP)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double amountInEuro = convertToEuro(amountInUSD, usdToEuroRate);
                System.out.printf("%.2f USD is equal to %.2f Euro%n", amountInUSD, amountInEuro);
                break;

            case 2:
                double amountInGBP = convertToGBP(amountInUSD, usdToGBPRate);
                System.out.printf("%.2f USD is equal to %.2f GBP%n", amountInUSD, amountInGBP);
                break;

            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }

        scanner.close();
    }

    private static double convertToEuro(double amountInUSD, double usdToEuroRate) {
        return amountInUSD * usdToEuroRate;
    }

    private static double convertToGBP(double amountInUSD, double usdToGBPRate) {
        return amountInUSD * usdToGBPRate;
    }
}
