// Perform the functions:
// 1. Push -> Should accept new data if there is space in the stack or print "Stack Overflow" if the stack is full.
// 2. Pop -> Should remove the top element from the stack and return it, or print "Stack Underflow" and return -1 if the stack is empty.
// 3. Top -> Should return the top element of the stack without removing it, or print "Stack is empty" and return -1 if the stack is empty.
// 4. Size -> Should return the number of elements currently in the stack.
// 5. Display -> Should print all elements in the stack from top to bottom.

import java.util.*;
public class NormalStack {
    public static void main(String[] args) {
        customStack stack = new customStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Top element: " + stack.top());
    }



    public static class customStack{
        int[] data;
        int top;

        public customStack(int size){      // Constructor to initialize the stack with a given size
            data = new int[size];    // Initialize the stack with the given size
            top = -1;                // Initialize the top index to -1 (indicating an empty stack)
        }

        int size() {
            return top + 1; // Return the number of elements in the stack
        }

        void display(){
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {
                System.out.print("Stack elements: ");
                for (int i = top; i >= 0; i--) {
                    System.out.print(data[i] + " ");
                }
                System.out.println();
            }
        }

        void push(int value){
            if (top == data.length - 1) {
                System.out.println("Stack Overflow");
            } else {
                top++;
                data[top] = value; // Add the new value to the top of the stack
            }
        }

        int pop(){
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1; // Return -1 if the stack is empty
            } else {
                int value = data[top]; // Get the top value
                top--; // Remove the top element
                return value; // Return the removed value
            }
        }

        int top(){
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1; // Return -1 if the stack is empty
            } else {
                return data[top]; // Return the top value without removing it
            }
        }
    }
}
