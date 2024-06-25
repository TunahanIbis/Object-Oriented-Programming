// Part II
// Write a method that gets inputs from user and logs them into a file.

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LogFile {

    // This method reads the user input.
    // It wants the user to enter an input and reads the next line of text entered by the user.
    public static String readUserInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an input: ");
            String input = scanner.nextLine();
            return input;
        }
    }

    // This method writes the taken content to a file with the file name.
    // It throws an IOException if there is an error in performing the file operations.
    public static void writeToFile(String content, String filename) throws IOException {
        File file = new File(filename);
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        out.write(content);
        out.close();
    }

    // This method reads the content from a file with the filename.
    // It throws a FileNotFoundException if the file does not exist or cannot be opened for reading.
    public static String readFromFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        try (Scanner scanner = new Scanner(file)) {
            String content = "";
            while (scanner.hasNext()) {
                content += scanner.nextLine();
            }
            return content;
        }
    }

    // Let's try entering some inputs to see if the method logs them in a file.
    public static void main(String[] args) throws IOException {
        writeToFile("35824", "info");
        String content = readFromFile("info");
        System.out.println(content);
    }
}