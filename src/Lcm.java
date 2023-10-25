// ###### This Program To Find LCM (Least Common Multipule) #####
// kleinstes gemeinsames Vielfaches


import java.util.Scanner;

public class Lcm {
    // Brute Force Approach
    // The Time Complexity For This Methode Is: O(a*b - max(a,b))
    static int findLmc(int a, int b) {
        int result = Math.max(a,b);   // Start From Max Int, The Less Ints Can not Be LCM

        while (true){
            if(result % a == 0 && result % b == 0) {
                break;
            }
            result++;
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The First Number: ");
        int a = scan.nextInt();

        System.out.println("Enter The Second Number: ");
        int b = scan.nextInt();

        System.out.println("The LCM Is: " + findLmc(a,b));

    }
}

