//You are given two numbers n and k. You are reuired to rotate n, k times to the right. 
//If k is positive , rotate to the right i.e. remove rightmost digit and make it leftmost.
//Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
//Take as input n and k.
//Print the rotated number.
//Note : Assume that the number of rotations will not cause leading 0's in the result e.g.,such as input will not be given
//n=12340056
//k=3
//r=05612340

import java.util.Scanner;
public class RotateNumber {
    
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();                 //number to be rotated

        System.out.println("Enter the value by which no. is to be rotated:");
        int k = scn.nextInt();                //value by which it will be rotated

        int dig=0;
        int temp=n;
        while(temp!=0){
            temp=temp/10;
            dig++;
        }

        int div = 1;
        int mult = 1;

        for(int i = 1; i <= dig; i++){
            if(i <= k){
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }

        int q = n / div;
        int r = n % div;

        int p = r * mult + q;
        System.out.println(p);
        scn.close();
    }
}
