// Convert Decimal base to any given base

import java.util.*;
public class DecToBase {

    public static void main(String[] args){
    System.out.println("Enter decimal base number:");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println("Enter any base:");
    int b = scn.nextInt();
    int dn = getValueInBase(n, b);
    System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int rv = 0;
        int t = 1;
        while(n > 0){
            int dig = n % b;
            n = n / b;

            rv += dig * t;
            t = t * 10;
        }
        return rv;
    }
}
