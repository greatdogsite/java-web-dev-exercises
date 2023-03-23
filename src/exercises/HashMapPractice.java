package exercises;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    static public void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student ID number then Name. ENTER when finished.");
        Integer id;
        String name;
        while (true) {
            System.out.println("Enter a Name");
            name = input.nextLine();
//            String test = input.nextLine();
//            System.out.println(test);
//            Integer test1 = Integer.parseInt(test);
//            System.out.println(test1);
//            System.out.println(test1.getClass());
            if (!name.equals("")) {
                System.out.println("Enter an ID");
                id = input.nextInt();
                students.put(id, name);
                input.nextLine();
            } else {
                break;
            }
        }
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}
