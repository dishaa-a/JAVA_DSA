// You are given a number n, representing the count of elements
// You are given n numbers
// You are required to find the span of input. 
// Span is defined as the difference of max value and min value

import java.util.*;
public class SpanOfArray {
    public static void main(String[] args){
        System.out.println("Enter the number of inputs:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println("Enter the  elements of array:");
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println("Span = " + span);
    }
}
