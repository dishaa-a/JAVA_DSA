// * 
//   *                  here '*' is where i = j
//     *
//       *
//         *

import java.util.*;

public class Pattern7 {
    public static void main(String[] args){
        System.out.println("Enter number of rows:");
        Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();

          for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == j){
                     System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
          }
          System.out.println();
        }
    }
}
