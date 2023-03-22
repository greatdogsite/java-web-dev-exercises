package exercises;

import java.util.Scanner;

public class FirstClass {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in); //new object of Scanner type?
        System.out.println("Hey, what is your name?");
        String firstName = input.nextLine();
        System.out.println("Hi, " + firstName);
    }
}
