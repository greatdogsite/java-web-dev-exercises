package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    String topic;
    Teacher instructor;
    ArrayList<Student> students = new ArrayList();

    public Course(String topic, Teacher instructor, Student student) {
        this.topic = topic;
        this.instructor = instructor;
        this.students.add(student);
    }
}
