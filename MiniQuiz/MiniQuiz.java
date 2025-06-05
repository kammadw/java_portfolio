import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Java Quiz!\n");

        System.out.println("1. What is the capital of Germany?");
        System.out.println("A. Berlin\nB. Munich\nC. Frankfurt");
        String answer1 = input.nextLine();
        if (answer1.equalsIgnoreCase("A")) score++;

        System.out.println("\n2. What is 3 + 4?");
        System.out.println("A. 6\nB. 7\nC. 8");
        String answer2 = input.nextLine();
        if (answer2.equalsIgnoreCase("B")) score++;

        System.out.println("\n3. Java is:");
        System.out.println("A. Programming language\nB. Coffee\nC. Country");
        String answer3 = input.nextLine();
        if (answer3.equalsIgnoreCase("A")) score++;

        System.out.println("\nYour final score: " + score + "/3");
    }
}
