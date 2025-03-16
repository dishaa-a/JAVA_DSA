//1. YOU ARE GIVEN AS INPUT MARKSOF A STUDENT 
//2. DISPLAY AN OUTPUT MESSAGE BASED ON THE FOLLOWING RULES
//2.1 FOR MARKS ABOVE 90, PRINT EXCELLENT
//2.2 FOR MARKS ABOVE 80 AND LESS THAN EQUAL TO 90, PRINT GOOD
//2.3 FOR MARKS ABOVE 70 AND LESS THAN EQUAL TO 80, PRINT FAIR
//2.4 FOR MARKS ABOVE 60 AND LESS THAN EQUAL TO 70, PRINT MEETS EXPECTATIONS
//2.5 FOR MARKS LESS THAN EQUAL TO 60, PRINT BELOW PAR

import java.util.*;
public class Conditional{
    public static void main(String[] args){
        
        System.out.println("Enter marks=");
        Scanner num = new Scanner(System.in);
        int marks = num.nextInt();             //TAKING INPUT

        //code
        if(marks>90){
          System.out.println("EXCELLENT");
        }

        else if(80<marks){
          System.out.println("GOOD");
        }
        else if(70<marks){
          System.out.println("FAIR");
        }
        else if(60<marks){
          System.out.println("MEETS EXPECTATIONS");
        }
        else{
          System.out.println("BELOW PAR");
          num.close();
        }
    }
}