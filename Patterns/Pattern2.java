// * * * * *
// * * * * 
// * * * 
// * * 
// * 

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args){
        System.out.println("Enter number of rows:");
        Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();

          for(int i = n; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*\t");
            }
            System.out.println();
          }
          
        /*  IT WILL ALSO RUN BUT IT IS NOT APPROPRIATE
        for(int i = n; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*\t");
            }
            System.out.println();
          }*/
    }
    
}
