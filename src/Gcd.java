
/*
This Project To Find GCD " The Greadest Common Divisor" Of Tow Given Number
*/

import java.util.Scanner;

public class Gcd {

    static int gcd(int a, int b){
        int minNumber = 0;
        if (a < b ) {
            minNumber = a;
        } else {
            minNumber = b;
        }

        for (int i = minNumber; i >= 1; i--){
            if(a%i == 0 && b%i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int a = scan.nextInt();

        System.out.println("Enter The Second Number: ");
        int b = scan.nextInt();

       /* int minNumber = 0;
        if (a < b ) {
            minNumber = a;
        } else {
            minNumber = b;
        }

        for (int i = minNumber; i >= 1; i--){
            if(a%i == 0 && b%i == 0) {
                System.out.println("The GCD Is: " + i);
                break;
            }
        }*/

        System.out.println("The GCD Is: " + gcd(a,b));

    }
}

/*
###### The Time complexity For The Previous Code Is Linear O(min(a,b))#####
*/
