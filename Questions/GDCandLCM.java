//You are requred to print the Greatest common Divisor(GDC) of two numbers.
//You are required to print the lowest common multiple(LCM) of the same numbers.
//take the input as num1 and num2

import java.util.Scanner;

public class GDCandLCM {

    public static void main(String[] args){
     System.out.println("Enter the first number:");
     Scanner scn = new Scanner(System.in);
     int n1 = scn.nextInt();

     System.out.println("Enter the second number:");
     int n2 = scn.nextInt();

     int on1 = n1;
     int on2 = n2;

     //GCD
     while(n1 % n2 != 0){
        int rem = n1 % n2;
        n1 = n2;
        n2 = rem;
     }

     int gcd = n2;

     //lcm
     int lcm = ( on1 * on2) / gcd;

     System.out.println("GCD = " +gcd);
     System.out.println("LCM = " +lcm);
     scn.close();

    }
}
