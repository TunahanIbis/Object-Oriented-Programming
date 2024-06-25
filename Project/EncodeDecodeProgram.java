// Rest of Problem III
// Finally, write a program that allows a user to encode and decode messages entered on the keyboard.

import java.util.Scanner;

public class EncodeDecodeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer as shift value: ");
        int shift = scanner.nextInt();
        scanner.nextLine();

        SubstitutionCipher cipher = new SubstitutionCipher(shift);

        System.out.print("Enter the text to encode: ");
        String plainText = scanner.nextLine();
        String encodedText = cipher.encode(plainText);
        System.out.println("Encoded Text: " + encodedText);

        System.out.print("Enter the text to decode: ");
        String cipherText = scanner.nextLine();
        String decodedText = cipher.decode(cipherText);
        System.out.println("Decoded Text: " + decodedText);

        scanner.close();
    }
}