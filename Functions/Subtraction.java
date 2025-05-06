import java.util.Scanner;

public class Subtraction {
     public static void main(String[] args){
        System.out.println("Enter the numbers to be added:");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.println("Enter base of the numbers:");
        int b = scn.nextInt();
        int d = getdifference(x, y , b);
        System.out.println(d);
     }

     // y is greater than x

     public static int getdifference(int x, int y, int b){
        int rv = 0;
        int c = 0;
        int t = 1;
        while(y > 0){
            int d1 = x % 10;
            int d2 = y % 10;
            x = x / 10;
            y = y / 10;

            int d = 0;
            d2 = d2 + c;

            if(d2 >= d1){
                c = 0;
                d = d2 - d1;
            } else {
                c = -1;
                d = d2 + 8 - d1; 
            }
            rv = rv + d * t;
            t = t * 10;
        }
        return rv;
     }
}
