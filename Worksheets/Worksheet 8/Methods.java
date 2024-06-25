// Part I
// Write at least 3 different method that throws exceptions.

import java.util.ArrayList;

public class Methods {

    // First Method: Length
    public static int getLength(String text) {
        return text.length();
    }
    // This method throws a NullPointerException if the given text is null (empty).

    // Second Method: Element
    public static String getElement(ArrayList<String> list, int index) throws IndexOutOfBoundsException {
        return list.get(index);
    }
    // This method throws an IndexOutOfBoundsException if the given index is out of bounds for the ArrayList.

    // Third Method: Divide
    public static int divide(int a, int b) {
        return a / b;
    }
    // This method throws an ArithmeticException if the given divisor ("b") is zero.

    // Fourth Method: Multiply
    public static int multiply(int c, int d) throws IllegalArgumentException {
        return c * d;
    }
    // This method throws an IllegalArgumentException if -at least- one of the given integers ("c", "d") is null (empty).
}