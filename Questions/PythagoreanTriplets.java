//You are required to check if a given set of numbers is a valid pythagorean triplet
//Take as input 3 numbers a,b,c
//Print true if they can form a pythagorean triplet and false otherwise

import java.util.Scanner;
public class PythagoreanTriplets {
    public static void main(String[] args){
        System.out.println("Enter the numbers a, b and c:");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max = a;
        if(b >= a){
            max = b;
        }

        if(c >= max){
            max = c;
        }

        if(max == a){
            boolean flag = (b* b + c * c) == (a * a);
            System.out.println(flag);
        } else if(max == b){
            boolean flag = (a* a + c * c) == (b * b);
            System.out.println(flag);
        } else{
            boolean flag = (b* b + a * a) == (c * c);
            System.out.println(flag);

        }

    }
}
