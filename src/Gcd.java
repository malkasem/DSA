
/*
This Project To Find GCD " The Greadest Common Divisor" Of Tow Given Number
*/

import java.util.Scanner;


/*
     ###### Algorithm of the Implementatio ######

     1. Find the Minimum Number of both a and b
     2. Use a for the Loop and start form the i = min and go till One
     3. Inside the loop, check if i is a Common Divisor
*/

/* ####

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

 //     System.out.println("The GCD Is: " + gcd(a,b));
  //  }
//}



/*
###### The Time complexity For The Previous Code Is Linear O(min(a,b))#####
                ###### Efficient Brute Force Approach ########
*/
/*
                ##### Here Depends on Euclid´s Algorithm ####
                1. Find the Larger Number
                2. Find the Difference between the Larger and the Smaller Number(DifNumber)
                3. Replace the Larger by the (DifNumber)
                4. Repeat all previous Steps until both Numbers become equal
                5. Return any one Number, which is the GCD
*/

// The Time complexity For This Code Is Linear O(max(a,b)

public class Gcd {

    static int euclidGcd(int a, int b) {


      while (a != b) {
          if( a > b) {
              a = a - b;
          } else {
              b = b - a;
          }
      }
        return a;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int a = scan.nextInt();

        System.out.println("Enter The Second Number: ");
        int b = scan.nextInt();

        System.out.println("The GCD Is: " + euclidGcd(a,b));
    }
}



