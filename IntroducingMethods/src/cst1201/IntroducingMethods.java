package cst1201;

import java.util.Scanner;

/**
 * This program allow user to count words from string
 *
 * @author Niaz Morshed and Devya Gurung
 */
public class IntroducingMethods {

    public static void main(String[] args) {

        // TODO: Fill in the body with your code
        System.out.print("Enter a string: ");

        Scanner keyboard = new Scanner(System.in);
        getInputString(keyboard);

    }

    private static String getInputString(Scanner inScanner) {

        String input = inScanner.nextLine();

        while (input.length() == 0) {

            System.out.println("ERROR - string must not be empty.");
            System.out.println("Enter a string: ");

            input = inScanner.nextLine();

        }

        getWordCount(input);
        getFirstWord(input);

        System.out.println("Which number of word you want to get: ");
        int n = inScanner.nextInt();
        getWord(input, n);

        return input;

    }

    private static int getWordCount(String input) {

        int wordCount = input.split(" ").length;

        System.out.println("Your string has " + wordCount + " words in it");

        return wordCount;

    }

    private static String getFirstWord(String input) {

        if (input.indexOf(' ') > -1) {

            System.out.println("The first word is: " + input.substring(0, input.indexOf(' ')));
            return input.substring(0, input.indexOf(' '));

        } else {

            System.out.println("The first word is: " + input);
            return input;
        }
    }

    private static String getWord(String input, int n) {

        String arr[] = input.split(" ");
        String word = arr[n];
        System.out.println("The word you search:  " + word);
        return word;
    }

}
