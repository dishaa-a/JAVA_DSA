//You are required to display prime factorization of a number
//Take as input a number n
//Print all its prime factors from smallest to largest.

import java.util.Scanner;

public class PrimeFactorization {
     public static void main(String[] args){
     System.out.println("Enter the number:");
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();

     for(int div = 2; div * div <=n;div ++ ){
        while(n % div == 0){
            n = n / div;
            System.out.println(div);
        }
     }

     if(n != 1){
        System.out.println(n);
     }
     scn.close();
    }
}
