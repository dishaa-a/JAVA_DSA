//Print the given digits of a number in separate lines
import java.util.*;
public class digitsOfNumber {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();

        int dig=0;
        int temp=n;
        while(temp!=0){
            temp=temp/10;
            dig++;
        }

        int div=(int)Math.pow(10, dig - 1);       //pow gives number in decimal. (int)Math gives number in integer
                                                    //here we have converted decimal to int
        //jitne number of digits hain uski ek power 10 me kam karke input number se divide karna hai or quotient print karna hai
        //jo remainder hoga usko naya input number bana dena hai jab tak 0 na aaye

        while(div!=0){
            int q=n/div;
            System.out.println(q);

            n=n%div;
            div=div/10;
        }
        scn.close();
     }
}
