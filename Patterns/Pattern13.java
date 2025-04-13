// 
// 1
// 1  1  
// 1  2  1                combination:icj    
// 1  3  3   1            i = rows
// 1  4  6   4   1        j = columns
// 1  5  10  10  5  1

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args){
        System.out.println("Enter number of rows:");
        Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();

          for(int i = 0; i < n; i++){
            int icj = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(icj+"\t");
                int icjp1 = icj * (i - j) / (j + 1);
                icj = icjp1;
            }
            System.out.println();
          }
    }
}
