package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();
//        for (Flavor item : flavors) {
//            System.out.println(item.toString());
//        }
        flavors.sort(comparator);
        flavors.sort(new FlavorComparator()); //this works too without creating a comparator object.

        for (Flavor item : flavors) {
            System.out.println(item.getName());
            //System.out.println(item.toString());
        }

        cones.sort(new ConeComparator());
        for (Cone item : cones) {
            System.out.println(item.toString());
        }
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
