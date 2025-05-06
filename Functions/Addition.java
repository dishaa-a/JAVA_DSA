// Sum of two same base numbers

import java.util.*;
public class Addition {
    public static void main(String[] args){
        System.out.println("Enter the numbers to be added:");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.println("Enter base of the numbers:");
        int b = scn.nextInt();
        int d = getSum(x, y , b);
        System.out.println(d);
    }

    public static int getSum(int x, int y, int b){    
        int rv = 0;
        int c = 0;
        int t = 1;
        while(x > 0 || y > 0 || c > 0){
            int d1 = x % 10;
            int d2 = y % 10;
            x = x / 10;
            y = y / 10;
            int s = d1 + d2 + c;
            c = s / b;
            int d = s % b;
            rv += d * t;
            t = t * 10;
        }
        return rv;
    }
}
