import java.util.*;
public class DiffOfArray {
    public static void main(String[] args){
        System.out.println("Enter the number of elements of first array");
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the array :");

        for(int i = 0; i < arr1.length; i++){
            arr1[i] = scn.nextInt();
        }
        
        System.out.println("Enter the number of elements of second array");
        int n2 = scn.nextInt();

        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the array :");

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = scn.nextInt();
        }
        int[] diff = new int[n2];
        int c = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;

        while(k >= 0){
            int d = 0;
            int arr1v = i >= 0? arr1[i]: 0;

            if(arr2[j] + c >= arr1v){
                d = arr2[j] + c - arr1v;
                c = 0;             
            } else {
                d = arr2[j] + c + 10 - arr1v;
                c = -1;
            }

            diff[k] = d;
            j--;
            i--;
            k--;
          }
          int idx = 0;
          while(idx < diff.length){
            if(diff[idx] == 0){
                idx++;
            } else {
                break;
            }
          }

          while(idx < diff.length){
            System.out.print(diff[idx]);
            idx ++;
          }
    }
}
