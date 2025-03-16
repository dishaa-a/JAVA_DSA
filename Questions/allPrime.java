//You have to print all prime numbers betweeen a range
//take as input 'low',the lower limit of range
//take as input 'high', the higher limit of range
//For the range print all the numbers between low and high(both included)
import java.util.*;
public class allPrime {
    public static void main(String[] args){
        System.out.println("Enter lower limit:");

        Scanner scn=new Scanner(System.in);
        int low=scn.nextInt();

        System.out.println("Enter upper limit:");

        int high=scn.nextInt();

        for(int n=low; n<=high; n++){

            int count=0;
            //try to divide n and increase count

            for(int div=2; div*div<=n; div++){
                if(n%div==0){
                    count++;
                }
            }

            if (count==0){
                System.out.println(n+" Prime");
            }
            else{
                System.out.println(n+" Not Prime");
            }
        }
            scn.close();
        }
    }