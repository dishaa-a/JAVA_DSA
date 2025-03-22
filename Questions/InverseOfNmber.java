//1.You are given a number following certain constraints
//2.The inverse of a number is defined as the nuumber created by interchanging the face value and index of digits of number

import java.util.*;
public class InverseOfNmber {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int inv = 0;
        int op = 1;            //op=original position
        while(n!=0){
            int od = n % 10;     //od=original digit
            int id = op;       //id=inverted digit
            int ip = od;       //ip=inverted position

            //adding numbers in inv
            inv = inv + id * (int)Math.pow(10, ip-1);

            n = n / 10;
            op++;
        }
        //printing inverse number
        System.out.println(inv);
        scn.close();
    }
}
