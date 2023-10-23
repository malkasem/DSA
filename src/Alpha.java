import java.math.BigInteger;
import java.util.Scanner;

// This Code To Find the Number Of Trailing Zeros In A Factorial
/*
public class Alpha {

    static long trailingZeros(long n) {
        long result = 0;
        long powerOf5 = 5;

        while (n >= powerOf5) {
            result += (n/powerOf5);

            powerOf5 *= 5;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println("Enter A Number: ");

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println("The Number Of Trailing´s Zeros Are: " + trailingZeros(n));

    }
}*/

// This is With BigInteger
public class Alpha {

    static int trailingZeros(BigInteger n) {
        int result = 0;
        BigInteger powerOf5 = BigInteger.valueOf(5);

        while (n.compareTo(BigInteger.ZERO) >= powerOf5) {
            result = result.add(n.divide(powerOf5)) ; //(n/powerOf5);

            powerOf5 = powerOf5.multiply(BigInteger.valueOf(5));
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println("Enter A Number: ");

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println("The Number Of Trailing´s Zeros Are: " + trailingZeros(n));

    }
}
