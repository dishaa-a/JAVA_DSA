// 1
// 2 3              counting
// 4 5 6 
// 7 8 9 10
// 11 12 13 14....

import java.util.Scanner;

public class Pattern11{
    public static void main(String[] args){
        System.out.println("Enter number of rows:");
        Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();

          int val = 1;
          for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(val+"\t");
                val++;
            }
            System.out.println();
          }
    }
}