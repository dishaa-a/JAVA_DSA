//                 Stars prints at:
// * * *   *       i = 1; [j == n || j <= n / 2 + 1 ]
//     *   *       i <= n / 2; [j == n || j == n / 2 + 1] (for input 7, there will be two such rows)
// * * * * *       i = n / 2 + 1 [all columns]    
// *   *           i > n / 2 + 1 [j == 1 || j == n / 2 + 1]  (for input 7, there will be two such rows)
// *   * * *       i == n [j == 1 || j >= n / 2 + 1]

import java.util.Scanner;

public class Pattern19 {
public static void main(String[] args){
        System.out.println("Enter number of rows:");
        Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    
                    if(i == 1){
                        if(j <= n / 2 + 1 || j == n){
                            System.out.print("*\t");
                        } else{
                            System.out.print("\t");
                        }

                    } else if(i <= n / 2){
                        if(j == n / 2 + 1 || j == n){
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }

                    } else if(i == n / 2 + 1){
                        System.out.print("*\t");

                    } else if(i < n){
                        if(j == 1 || j == n / 2 + 1){
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }

                    } else {
                        if(j == 1 || j >= n / 2 + 1){
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }
                    }
                    } 
                System.out.println();
            }
     }     

}
