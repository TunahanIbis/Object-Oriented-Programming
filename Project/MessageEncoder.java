// Problem I
// Create an interface MessageEncoder that has a single abstract method encode(plainText), where plainText is the message to be encoded. 
// The method will return the encoded message.

public interface MessageEncoder {
    String encode(String plainText);
}