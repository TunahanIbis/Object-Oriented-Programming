// Part II

import java.util.Arrays;

public class Demo {
    // Let's create an array with Student objects.
    public static void main(String[] args) {
        Student s1 = new Student("Paul", "McCartney", 22);
        Student s2 = new Student("John", "Lennon", 11);
        Student s3 = new Student("George", "Harrison", 11);
        Student s4 = new Student("Ringo", "Starr", 22);
        Student s5 = new Student("Tunahan", "İbiş", 33);

        Student[] studentArray = { s1, s2, s3, s4, s5 };

        // Sort the array of Students.
        Arrays.sort(studentArray);

        // Let's print the sorted array.
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println(studentArray[i]);
        }
    }
}
