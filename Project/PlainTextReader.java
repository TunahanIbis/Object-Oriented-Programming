// Problem IV
// Read plainText from a file, cipher the message using the MessageEncoder and write the encoded message into another file.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PlainTextReader {
    public static void main(String[] args) {
        String inputFile = "Selam";
        String encodedFile = "World";
        String decodedFile = "Hello";
        int shift = 7;

        String plainText = readFile(inputFile);
        SubstitutionCipher cipher = new SubstitutionCipher(shift);
        String encodedMessage = cipher.encode(plainText);

        writeFile(encodedFile, encodedMessage);
        String encodedText = readFile(encodedFile);
        String decodedMessage = cipher.decode(encodedText);
        writeFile(decodedFile, decodedMessage);

        System.out.println("Encoded and decoded text has written succesfully!");
    }

// These lines read the content of a file and returns it as a string.

    private static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

// These lines write the given content into a file.

    private static void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}