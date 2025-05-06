// Convert any given base to Decimal

import java.util.*;
public class BaseToDec {
    public static void main(String[] args){
        System.out.println("Enter Base b number:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Enter the base of the number:");
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int rv = 0;
        int t = 1;

        while(n > 0){
            int dig = n % 10;
            n = n / 10;

            rv += dig * t;
            t = t * 8;
        }
        return rv;
    }
    
}
