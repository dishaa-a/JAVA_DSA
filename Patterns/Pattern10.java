//                   outer space ,inner space
//     *             2            
//   *   *           1             1
// *       *         0             2
//   *   *           1             1
//     *             2

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args){
        System.out.println("Enter number of rows:");
        Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          
          int os = n / 2;
          int is = -1;

          for(int i = 1; i <= n; i++){
            for(int j = 1; j <= os; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");

            for(int j = 1; j <= is; j++){
                System.out.print("\t");
            }

            if(i > 1 && i < n){
                System.out.print("*\t");
            }

            if(i <= n/2){
                os--;
                is += 2;
            } else {
                os++;
                is -= 2;
            }
            System.out.println();
          }
    }
}
