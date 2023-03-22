package exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] Args) {
        ArrayList<Double> numbers = new ArrayList<>();
        Double num = 1.;
        while (true) {
            numbers.add(num);
            num++;
            if (num == 10 + 1) {
                break;
            }
        }
        System.out.println(sum(numbers));
        System.out.println("lets do an arraylist of words----------------------");

        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        words.add("fun");
        words.add("fish");
        words.add("super");
        words.add("refactor");
        words.add("hello");
        System.out.println("Pick a number");
        Integer number = input.nextInt();
        printFive(words, number);

        String text =
                "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                        "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                        "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                        "'without pictures or conversation?'";
        String[] textSplit = text.split(" "); //split string into an array of strings
        ArrayList<String> textArrayList = new ArrayList(Arrays.asList(textSplit)); // use Arrays.asList for list view of an Array
        printFive(textArrayList, number);

    }

    public static Double sum(ArrayList<Double> numbers) {
        Double sum = 0.0;
        for (Double num : numbers) {
//            System.out.println(num);
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void printFive(ArrayList<String> words, Integer number) {
        for (String word : words) {
            if (word.length() == number) {
                System.out.println(word);
            }
        }
    }
}
