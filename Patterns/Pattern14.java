// x * 1 = x
// x * 2 = 2x
// x * 3 = 3x
// .......
// x * 10 = 10x

import java.util.*;
public class Pattern14 {
    public static void main(String[] args){
        System.out.println("Enter number x:");
        Scanner scn = new Scanner(System.in);
          int x = scn.nextInt();

          for(int i = 1; i <= 10; i++){
            int v = x * i;
            System.out.println(x + "*" + i + "=" + v);
          }
        }

}
