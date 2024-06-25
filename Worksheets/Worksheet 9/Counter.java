// Worksheet 9
// Create a Counter class and implement a constructor that takes an array of generic type items. 
// Counter should have a HashMap field named counts to store the occurrence count of each item. 
// Then, in the constructor, write a logic that counts the items in the array, and updates the counts field accordingly. 
// Finally, read an array of items from a file and write the counts in another file to test your class.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;

public class Counter<T> {
    private HashMap<T, Integer> counts;

    public Counter(T[] items) {
        counts = new HashMap<>();
        for (T item : items) {
            counts.put(item, counts.getOrDefault(item, 0) + 1);
        }
    }

    public HashMap<T, Integer> getCounts() {
        return counts;
    }

    public void writeCountsToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            for (T key : counts.keySet()) {
                writer.println(key + " " + counts.get(key));
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while writing the data to the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[] items = {
            "eraser",
            "pencil",
            "eraser",
            "sharpener",
            "eraser" ,
            "pencil",
            "pen"
        };

        Counter<String> counter = new Counter<>(items);
        counter.writeCountsToFile("counts");
        System.out.println("Items have written to the file named 'counts'");
    }
}