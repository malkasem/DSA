// This Program To Check If A Given Number Is Prime Or Not

import java.util.Scanner;

/*
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
}*/

//########################################################################################

// Time Complexity Is O(sqrt(n))
/*
public class PrimeNumbers {

    static String isPrime(int n) {

        while ( n != 1 && n > 0) {

            for (int i = 2; i <= Math.sqrt(n); i++) { // sqrt(n)

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
}*/

//##############################################################################################

public class PrimeNumbers {

    static String isPrime(int n) {

        while ( n != 1 && n > 0) {

            for (int i = 2; i <= Math.sqrt(n); i++) { // sqrt(n)

                if (n % i == 0) {
                    return n + " is NOT Prime Number";
                }


            }
            return n + " is Prime Number";
        }
        return "Your Input Is Not Valid! You Can´t Enter 1 or Negative Number";
    }


    static String checkPrime(int n) {

        while ( n != 1 && n > 0) {

            if( n == 2 || n == 3) {
                return n + " is Prime Number";
            }
            if(n%2 ==0 || n%3 == 0){
                return n + " is NOT Prime Number";
            }

            for (int i = 5; i*i <= n; i+=6) { //[i*i <= n] = [i =  sqrt(n)]
                    if(n%i==0 || n%(i+2)==0){
                        return n + " is NOT Prime Number";
                    }
                return n + " is Prime Number";
            }
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
