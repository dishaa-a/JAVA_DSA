import java.util.*;
public class Insert {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of elements :");
        int n = scn.nextInt();
        System.out.println("Enter elements of array : ");
        int[] arr = new int[n];

        for(int i = 0; i < arr.length -1; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the element to be inserted");
        int element = scn.nextInt();

        System.out.println("Enter the position : ");
        int pos = scn.nextInt();

        for(int i = n-1; i > pos; i--){
            arr[i] = arr[i - 1];
        }
        arr[pos] = element;

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
