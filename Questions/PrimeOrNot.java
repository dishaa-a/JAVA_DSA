//1. You have to check whether a number is prime or not.
//2. Take a number 't' as input representing count of input numbers to be tested.
//3. Take a number 'n' as input 't' number of times.
//4. For each input value of n, print 'prime' if the number is prime and 'not prime' otherwise.


import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args){
    System.out.println("Enter the number of inputs to be checked:");

    Scanner scn= new Scanner(System.in);
    int t =scn.nextInt();                 //HOW MANY NUMBERS YOU WANT TO CHECK

    for(int i=0; i<t; i++){               //t WILL START FROM 0 AND CONTINUE TILL YOU REACH THE NO. OF INPUTS

        int n=scn.nextInt();              //n IS THE NUMBER THAT YOU WANT TO CHECK


        // authentic factors of a number n can be found before sq. root of n
        int count=0;                     
        for(int div=2; div*div<=n; div++){       //div starts from 2 as 1 will divide all numbers
                                                 //jbtk (div)^2 <=n, tbtk div will increase

            if(n%div==0){                //agar n divides div then count increase which means no. is not prime
                count++;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    scn.close();
    
    }
}
