// Problem II
// Create a class SubstitutionCipher that implements the interface MessageEncoder, as described in the previous problem. 
// The constructor should have one parameter called shift. 
// Define the method encode so that each letter is shifted by the value in shift. 
// For example, if shift is 3, a will be replaced by d, b will be replaced by e, c will be replaced by f, and so on.

// Problem III's Modifying Part
// Modify the class SubstitutionCipher, as described in previous problems, 
// so that it implements MessageDecoder as well as the interface MessageEncoder that Problem 1 describes. 

// This method implements both MessageEncoder and MessageDecoder as we are asked to do in problem III. So, it is the modified version.
public class SubstitutionCipher implements MessageEncoder, MessageDecoder {
    private int shift;

    public SubstitutionCipher(int shift) {
        this.shift = shift;
    }

    @Override
    public String encode(String plainText) {
        StringBuilder encodedText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                ch = shiftCharacter(ch, shift);
            }
            encodedText.append(ch);
        }
        return encodedText.toString();
    }

    @Override
    public String decode(String cipherText) {
        StringBuilder decodedText = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++) {
            char ch = cipherText.charAt(i);
            if (Character.isLetter(ch)) {
                ch = shiftCharacter(ch, -shift);
            }
            decodedText.append(ch);
        }
        return decodedText.toString();
    }

// Let's define a private method that shifts a single character.

    private char shiftCharacter(char ch, int shift) {
        if (Character.isLowerCase(ch)) {
            return (char) ((ch - 'a' + shift + 26) % 26 + 'a');
        } else if (Character.isUpperCase(ch)) {
            return (char) ((ch - 'A' + shift + 26) % 26 + 'A');
        } else {
            return ch;
        }
    }
}