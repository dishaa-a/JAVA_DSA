import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
   
    public static void main(String[] args) {
        System.out.println("Enter the number of elements of array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

            Stack<Integer> st = new Stack<>();
            int[] ans = new int[arr.length];

            for(int i = arr.length - 2; i >= 0; i--){
                while(st.size() > 0 && arr[i] >= st.peek()){
                    st.pop();
                }
                if(st.size() == 0){
                    ans[i] = -1; // No greater element found
                } else {
                    ans[i] = st.peek(); // Next greater element
                }
                st.push(arr[i]); // Push current element onto stack
            }
            ans[arr.length - 1] = -1; // Last element has no next greater element
            System.out.println("Next Greater Element for each element in the array:");
            for(int i = 0; i < ans.length; i++){
                System.out.print(ans[i] + " ");
            }
        }
    }
