import java.util.*;
import java.util.Stack;

public class min {
    public static void classMinStack() {

        Stack<Intentger> allData;
        Stack<Integer> minData;

        public MinStack() {
            allData = new Stack<>();
            minData = new Stack<>();
        }

        int size() {
            return allData.size();
        }

        void push(int val) {
            allData.push(val);
            if(minData.peek() >= val || minData.size() = 0){
                minData.push(val);
            }
        }

        int pop() {
            if(alldata.size() == 0){ 
                System.out.println("Stack is empty");
                return -1;
            } else {
                int val = allData.pop();
                if(minData.peek() = val) {
                    minData.pop();
                }
            }
        }

        int top() {
            if(allData.size() == 0) {
                System.out.println("Stack is empty");
                return -1;
            } else {
                return allData.peek();
            }
        }

        int min() {
            if(minData.size() == 0) {
                System.out.println("Stack is empty");
                return -1;
            } else {
                return minData.peek();
            }
        }
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(3);
        stack.push(7);
        System.out.println("Minimum: " + stack.min()); // Output: 3
        System.out.println("Top: " + stack.top()); // Output: 7
        stack.pop();
        System.out.println("Minimum after pop: " + stack.min()); // Output: 3
    }
}
