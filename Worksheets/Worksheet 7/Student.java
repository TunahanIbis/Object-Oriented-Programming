// Part I

import java.lang.Comparable;

public class Student implements Comparable<Student> {
    private String name;
    private String lastName;
    private int studentId;

    public Student(String name, String lastName, int studentId) {
        this.name = name;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public String toString() {
        return "Student [name =" + name + ", lastName =" + lastName + ", studentId =" + studentId + "]";
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public int compareTo(Student otherStudent) {
        // To compare studentId and lastName, we should design a method that compares a student with another.
        int idComparison = Integer.compare(this.studentId, otherStudent.studentId);
        if (idComparison != 0) {
            return idComparison;
        }

        // If the students have the same studentId, then the method should compare their lastNames in an alphabetical order.
        int lastNameComparison = this.lastName.compareTo(otherStudent.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        return this.name.compareTo(otherStudent.name);

    }
}
