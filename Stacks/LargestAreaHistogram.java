import java.util.*;
public class LargestAreaHistogram {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements of histogram");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the heights of the histogram bars:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Largest area in histogram: " + largestArea(arr));
    }

    public static int largestArea(int[] heights) {
        int[] right = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        st.push(heights.length - 1);
        right[heights.length - 1] = heights.length;

        for (int i = heights.length - 2; i >= 0; i--) {
            while (st.size() > 0 && heights[i] <= heights[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                right[i] = heights.length; // No greater element found, extend to end
            } else {
                right[i] = st.peek(); // Next greater element index
            }
            st.push(i); // Push current index onto stack
        }

        int[] left = new int[heights.length];
        st = new Stack<>();
        st.push(0);
        left[0] = -1;

        for (int i = 1; i < heights.length; i++) {
            while (st.size() > 0 && heights[i] <= heights[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                left[i] = -1; // No greater element found, extend to start
            } else {
                left[i] = st.peek(); // Next greater element index
            }
            st.push(i); // Push current index onto stack
        }

        int maxArea = 0;
        for(int i = 0; i < heights.length; i++){
            int width = right[i]- left[i] - 1;
            int area = heights[i] * width;
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}
