import java.util.*;
public class Searching {
    public static void main(String[] args){
        System.out.println("Enter the number of inputs:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println("Enter the  elements of array:");
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the element to search:");
        int s = scn.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == s){
                System.out.println("Required number is at index " + i);
            }
        }
    }
}
