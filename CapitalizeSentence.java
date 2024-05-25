package pradeep;

import java.util.Scanner;

public class CapitalizeSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Convert the sentence to uppercase
        String capitalizedSentence = sentence.toUpperCase();

        // Display the capitalized sentence
        System.out.println("Capitalized Sentence: " + capitalizedSentence);

        // Close the scanner
        //scanner.close();
    }
}
