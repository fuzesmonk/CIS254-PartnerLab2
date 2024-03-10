import java.util.Scanner;
/**
 * Partner Lab 3 Tester Program
 * @author Hellen Pacheco (main method)
 */

public class WordTester extends Antics{

    /**
     * Method to test the Antics methods
     * @param args Command-line arguments (not used)
     */

    public static void main(String[] args) {
        // Test words
        String word;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter word (exit to end): ");
            word = input.nextLine();
            System.out.println("Word: " + word);
            System.out.println("Is Palindrome: " + Antics.isPalindrome(word));
            System.out.println("Is Abecedarian: " + Antics.isAbecedarian(word));
            System.out.println("Capitalized: " + Antics.capitalizeFirstLetter(word));
            System.out.println("--------------------------------------------------");
        } while (!word.equalsIgnoreCase("exit"));
        System.out.println("Goodbye");
        input.close();
    }
}
