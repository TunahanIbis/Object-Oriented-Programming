import java.util.Random;


public class Coin {
    int value;
    String origin;

    public Coin(int value, String origin) {
        this.value = value;
        this.origin = origin;
    }

    // Should this be a static method?
    // ANSWER: Yes. To do static actions with flip function, we should add "static" before it at 15th line. Then it becomes changable. 
    public static String flip() {
        Random rand = new Random(1);
        boolean result = rand.nextBoolean();
        if (result) return "heads";
        else return "tails";
    }

    // Should this be a static method?
    // ANSWER: No. In fact, we can make this method either static or non-static but if it would be static, the "this" will not work at the 25th line.
    public boolean compareOrigin(Coin otherCoin) {
        if (this.origin == otherCoin.origin) return true;
        else return false;
    }

    // Should this be a static method?
    // ANSWER: Yes. To sum the coins in the same enviroment, the method should be static. Other than that, to sum three coins we should change the "sumValues" code too by adding coin3 to the paranthesis.
    public static int sumValues(Coin coin1, Coin coin2,Coin coin3) {
        return coin1.value + coin2.value + coin3.value;
    }

    public static void main(String args[]) {
        Coin coin1 = new Coin(5, "Canada");
        Coin coin2 = new Coin(3, "Turkey");
        Coin coin3 = new Coin(9, "Morocco");

        // Trying to compare coin1 and coin2, what is wrong here?
        // ANSWER: To compare coins we should add boolean befoere it because result is going to be true or false. I am adding a println sentence at 43rd line to see the result clearly.
        boolean sameOrigin = coin1.compareOrigin(coin2); 
        System.out.println("Does coin1 and coin2 have the same value?: " + sameOrigin);

        // Trying to flip 2 coins, what is wrong here?
        // ANSWER: Since it is static, the Coin method can not take any values in its paranthesis. So I deleted the code of the paranthesis at 48th line. I added println sentences again at 49 and 50th lines.
        String flip1 = Coin.flip();
        String flip2 = Coin.flip();
        System.out.println("Result of the first flip: " + flip1);
        System.out.println("Result of the second flip: " + flip2);

        // Trying to sum values of coin3 coin1 and coin2, what is wrong here?
        // ANSWER: The original "sumValues" code doesn't accept three values at the same time. So, I changed the code at 31 and 32nd lines to add the coin3 too. Again, I added println sentence at the end of it to see the result.
        int sum = Coin.sumValues(coin1, coin2, coin3);
        System.out.println("Sum of the values of coin 1, coin 2 and coin3: " + sum);
    }
}