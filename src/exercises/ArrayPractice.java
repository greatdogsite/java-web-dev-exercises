package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] Args) {
        int[] firstArray = {1, 1, 2, 3, 5, 8};
        for (int number : firstArray) {
            System.out.println(number);
        }
        System.out.println("----------------------------------");
        for (int number : firstArray) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }
        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arrayText = text.split(" ");
        for (String word : arrayText) {
            System.out.println(word);
        }
        
        System.out.println(Arrays.toString(arrayText)); //use method in Arrays class
    }
}
