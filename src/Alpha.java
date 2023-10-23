import java.util.Scanner;

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
}