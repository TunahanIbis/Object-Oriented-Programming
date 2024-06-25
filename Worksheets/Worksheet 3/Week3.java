import java.util.Random;

public class Week3 {

    // Part I:
    // Write a method named diceMult which takes an integer value N as a parameter,
    // throws a fair dice N times, multiplies the biggest two values, and then
    // prints the result in the console.

    public static void diceMult(int lowerbound, int upperbound, int N) {
        System.out.println("PART I");
        Random random = new Random();
        int biggest = 0;
        int biggest2 = 0;
        for (int i = 0; i < N; i++) {
            int randdice = random.nextInt(lowerbound, upperbound);
            System.out.println("Random number: " + randdice);

            if (randdice > biggest) {
                System.out.println("Old biggest: " + biggest);
                biggest2 = biggest;
                biggest = randdice;
                System.out.println("New biggest: " + biggest);
            } else if (randdice > biggest2) {
                biggest2 = randdice;
            }
        }
        System.out.println("Biggestv1: " + biggest);
        System.out.println("Biggestv2: " + biggest2);
        int x = biggest * biggest2;
        System.out.println(x);

    }

    // Part II:
    // Write a method named makeShape that takes an odd integer value N as a
    // parameter. ,
    // Using N to determine the size of the shapes, the method should print the
    // following output shapes.
    public static void makeShape(int N) {
        System.out.println("PART II");
        int i, j;
        for (i = 0; i < 2 * N; i = i + 2) {
            for (j = 2 * N - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diceMult(1, 6, 3);
        makeShape(3);
        makeShape(4);
    }
}