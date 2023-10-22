import java.math.BigInteger;
import java.util.Scanner;

/*

// This Code works just for small Integer bis 10 Digits
public class Counter {

    static int countDigits(int n){
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Integer Number: ");

        int n = sc.nextInt();

        System.out.println("The Number Of Digits Are: " + countDigits(n));
    }
}*/

public class Counter {

    static int countDigits(BigInteger n) {


        int count = 0;
        BigInteger ten = BigInteger.TEN;

        while (n.compareTo(BigInteger.ZERO) > 0) {
            n = n.divide(ten);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Integer Number: ");

        BigInteger n = sc.nextBigInteger();

        System.out.println("The Number Of Digits Are: " + countDigits(n));

    }
}