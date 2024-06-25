// Problem III
// Create an interface MessageDecoder that has a single abstract method decode(cipherText), where cipherText is the message to be decoded. 
// The method will return the decoded message.

public interface MessageDecoder {
    String decode(String cipherText);
}