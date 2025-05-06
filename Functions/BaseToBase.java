// Convert any base to any other given base

import java.util.*;
public class BaseToBase {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Enter thebase of the number:");
        int s = scn.nextInt();
        System.out.println("Base in which n is to be converted");
        int b = scn.nextInt();
        int dn = getValueInBase(n , s , b);
        System.out.println(dn);
    }
     
    public static int getValueInBase(int n, int s, int b){
        int rv = 0;
        int t = 1;

        while(n > 0){
            int dig = n % b;
            n = n / b;

            rv += dig * t;
            t = t * s;
        }
        return rv;
    }
    
}
