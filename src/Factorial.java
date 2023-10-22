import java.math.BigInteger;
import java.util.Scanner;

/*public class Factorial {

// This Methode Calculate just small integers, so better to use Long or BigInteger
        static int  fact(int n){
            int result = 1;
            for (int i = 1; i <= n; i++){
                result *= i; // res = res*i
            }
            return result;
        }


    public static void main(String[] args){
        System.out.println("## This Program To Calculate The Factorial Of Number ##");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Integer: ");

        int n = sc.nextInt();
        System.out.println(fact(n));
    }*/

public class Factorial {

    static BigInteger fact(int n){
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }


    public static void main(String[] args){
        System.out.println("## This Program To Calculate The Factorial Of Number ##");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Integer: ");

        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("The Factorial for negative integer is not defiend!!");
        } else {
            System.out.println(fact(n));
        }
    }
}
