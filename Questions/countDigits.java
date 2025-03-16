//You have to count number of digits in a number

import java.util.*;

public class countDigits {
    public static void main(String[] args){
        System.out.println("Enter the number whose digits are to be counted");
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();

        int dig=0;
        while(n!=0){
            n=n/10;
            dig++;
        }
        System.out.println("The number of digits are: "+dig);
        scn.close();
    }
    
}
