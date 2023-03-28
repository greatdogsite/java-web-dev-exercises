package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    //A = pi * r * r
    public static final Double PI = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius?");
//        Double radius = input.nextDouble();
//        System.out.println(radius instanceof Double);
        Double radius;
        while (true) {
            try {
                radius = input.nextDouble();
                if (radius instanceof Double && radius > 0) {
                    break;
                } else {
                    System.out.println("Please enter a number.");
                    input.nextLine(); //read in next line
                }

            } catch (Exception e) {
                System.out.println("Please enter a number.");
                input.nextLine(); //read in next line
            }
        }
        System.out.println("The area of your circle is " + Circle.getArea(radius));
    }

}
