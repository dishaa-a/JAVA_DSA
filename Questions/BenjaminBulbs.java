//You are given n number of bulbs. They are all switched off. A wired fluctuation in voltage hitsthe circuit n times.
//In first fluctuation all bulbs are toggled. In second fluctuation every second bulb is toggled. In third fluctuation every third bulb is toggled and so on.
//You have to find which bulbs will be switched on after fluctuations.
//take as input a number n representing the number of bulbs
//print all the bulbs that will be on after the nth fluctuation in voltage


import java.util.Scanner;
public class BenjaminBulbs {
    public static void main(String[] args){
        System.out.println("Enter number of bulbs:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 1;i * i <= n;i++){       //all perfect square number have odd number of factors
                                             //bulbs toggled n times will remain on
            System.out.println("Number of bulbs that are on : " +i * i);
        }
        scn.close();
;    }
    
}
