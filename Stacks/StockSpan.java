import java.util.*;
public class StockSpan {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements of array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                ans[i] = i + 1; // No greater element found, span is index + 1
            } else {
                ans[i] = i - st.peek(); // Span is current index - index of last greater element
            }
            st.push(i); // Push current index onto stack
        }

        System.out.println("Stock Span for each element in the array:");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
