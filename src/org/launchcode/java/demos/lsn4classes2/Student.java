package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
//     This method returns the student’s level based on the number of credits they have earned:
//    Freshman (0-29 credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits)
    public String getGradeLevel() {
        String level = "";
        if (this.numberOfCredits >= 0 && this.numberOfCredits <= 29) {
            level = "Freshman";
        }
        if (this.numberOfCredits >= 30 && this.numberOfCredits <= 59) {
            level = "Sophomore";
        }
        if (this.numberOfCredits >= 60 && this.numberOfCredits <= 89) {
            level = "Junior";
        }
        if (this.numberOfCredits > 90) {
            level = "Senior";
        }
        return level;
    }

    // TODO: Complete the addGrade method.
//    This method accepts two parameters—a number of course credits and a numerical grade (0.0-4.0).
//    With this data, you need to update the student’s GPA.
//    To update the student’s GPA:
    //gpa = (total quality score) / (total number of credits)
//    Calculate their current total quality score by using the formula gpa * numberOfCredits.
//    Use the new course grade and course credits to update their total quality score.
//    Update the student’s total numberOfCredits.
//    Compute their new GPA.
    public void addGrade(int courseCredits, double grade) {
        Double currentTotalQualityScore = this.gpa * this.numberOfCredits;
        currentTotalQualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = currentTotalQualityScore / this.numberOfCredits;

    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally", 1, 1, 4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        System.out.println(sally.getGradeLevel());
        sally.addGrade(12, 3.5);
        System.out.println(sally.getGpa());
        sally.addGrade(25, 3.8);
        System.out.println(sally.getGpa());
        System.out.println(sally.getGradeLevel());
        System.out.println(sally.equals(sally));
        System.out.println(sally.toString());
    }
}
