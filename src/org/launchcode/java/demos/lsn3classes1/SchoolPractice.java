package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        Student me = new Student();
        me.setName("Paul");
        me.setStudentId(112);
        me.setNumberOfCredits(1);
        me.setGpa(4.0);
        System.out.println(me.getGpa());

        Teacher teach = new Teacher();
        teach.setFirstName("Donny");
        teach.setLastName("Smith");
        teach.setSubject("Maff");
        teach.setYearsTeaching(5);
        System.out.println(teach.getFirstName() + " " + teach.getLastName());

        Course firstCourse = new Course("Maff", teach, me);
        System.out.println(firstCourse.topic);
        System.out.println(firstCourse.instructor.getFirstName());
        System.out.println(firstCourse.students.get(0).getName());
    }
}
