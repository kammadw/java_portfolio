import java.util.Scanner;

public class BudgetCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Monthly income:");
        double income = input.nextDouble();

        System.out.println("Rent cost:");
        double rent = input.nextDouble();

        System.out.println("Food expenses:");
        double food = input.nextDouble();

        System.out.println("Other expenses:");
        double other = input.nextDouble();

        double total = rent + food + other;
        double daily = total / 30;
        double weekly = total / 4;

        System.out.println("\nTotal monthly expenses: " + total + " EUR");
        System.out.println("Daily expenses: " + String.format("%.2f", daily) + " EUR");
        System.out.println("Weekly expenses: " + String.format("%.2f", weekly) + " EUR");

        double percent = (total / income) * 100;
        System.out.println("Percent of income spent: " + String.format("%.1f", percent) + "%%");
    }
}