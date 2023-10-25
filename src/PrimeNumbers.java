// This Program To Check If A Given Number Is Prime Or Not

import java.util.Scanner;

public class PrimeNumbers {

    static String isPrime(int n) {

        while ( n != 1 && n > 0) {

            for (int i = 2; i <= n / 2; i++) {

                if (n % i == 0) {
                    return n + " is NOT Prime Number";
                }


            }
            return n + " is Prime Number";
        }
        return "Your Input Is Not Valid! You Can´t Enter 1 or Negative Number";
    }
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter A Number: ");
    int n = scan.nextInt();

    System.out.println(isPrime(n));

    }
}