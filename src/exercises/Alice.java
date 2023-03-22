package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        String text =
                "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                        "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                        "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                        "'without pictures or conversation?'";
        text = text.toLowerCase();
        System.out.println("What would you like to search for?");
        String word = input.nextLine();
        word = word.toLowerCase();
        Boolean contains = text.contains(word);
        if (contains) {
            System.out.println("The word " + word + " is in the text.");
        } else if (!contains) {
            System.out.println("The word " + word + " is not in the text.");
        }
        System.out.println("Part 2 of Alice");

        System.out.println(word + " is at index " + text.indexOf(word) + " and is " + word.length() + " characters");

//        String[] arrayText = text.split(" ");
        text = text.replace(word, "");
        System.out.println(text);
    }
}
