package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.*;

public class CountCharacters {
    public static void main(String[] args) {
        String contents = readUsingFiles("C:\\Users\\great\\Desktop\\java\\java-web-dev-exercises\\src\\org\\launchcode\\java\\studios\\areaofacircle\\string.txt");
        String sampleString = "If the product of two terms is zero then common sense says at least one of the " +
                "two terms has to be zero to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        sampleString = contents;

        char[] stringToCharArray = sampleString.toCharArray();
        HashMap<Character, Integer> characterMap = new HashMap<>();
        for (Character c : stringToCharArray) {
            String j = c.toString();
            if (!Pattern.matches("[a-zA-Z]", j)) { //ran out of time
                continue;
            }
            c = c.toLowerCase(c);
            if (characterMap.containsKey(c)) {
                Integer count = characterMap.get(c) + 1;
                characterMap.put(c, count);
            } else {
                characterMap.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> c : characterMap.entrySet()) {
            System.out.println(c.getKey() + ": " + c.getValue());
        }
        System.out.println("--------------------------------------------");
        ArrayList<Object> characterArrayList = new ArrayList<>();
        Object count = 0;
        int index = 0;
        Integer one = 1;
        for (Character c : stringToCharArray) {
            c = c.toLowerCase(c);
            if (characterArrayList.contains(c)) {
                index = characterArrayList.indexOf(c);
                count = characterArrayList.get(index + 1);
                int i = (Integer) count + 1;
                characterArrayList.set(index + 1, i);
            } else {
                characterArrayList.add(c);
                characterArrayList.add(one);
            }
        }
        for (int j = 0; j < characterArrayList.size(); j++) {
            //System.out.println(characterArrayList.get(j));
            if (j % 2 == 0) {
                System.out.println(characterArrayList.get(j) + " : " + characterArrayList.get(j + 1));
            }
        }
    }

    private static String readUsingFiles(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
