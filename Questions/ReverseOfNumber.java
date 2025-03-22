//You have to display the digits of a number in reverse


import java.util.*;
public class ReverseOfNumber {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        while(n>0){
            int dig=n%10;
            n=n/10;
            System.out.println(dig);
            scn.close();
        }
    }
    
}
