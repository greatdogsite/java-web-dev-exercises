package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    static public void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How long is your rectangle?");
        Integer length = input.nextInt();
        System.out.println("How tall is your rectangle?");
        Integer width = input.nextInt();
        System.out.println("The area of your Rectangle is " + (length * width));

    }
}
