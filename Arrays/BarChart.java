// Take an array as an input and print it in the form of a bar chart
// For eg:
// [3 4 5 2]
//      *
//    * *
//  * * *
//  * * * *
//  * * * *

import java.util.*;
public class BarChart {
    public static void main(String[] args){
        System.out.println("Enter the number of elemnts = ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println("Enter the elements : ");
        
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int floor = max; floor >= 1; floor--){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= floor){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
