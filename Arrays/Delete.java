import java.util.*;
public class Delete {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of elements :");
        int n = scn.nextInt();
        System.out.println("Enter elements of array : ");
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the position to delete the element : ");
        int pos = scn.nextInt();

        for(int i = pos; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        for(int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
