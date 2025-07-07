public class DynamicStack{
       public static void main(String[] args) {
        customStack stack = new customStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // This will trigger resizing of the stack

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
           if(top == data.length - 1){
            int[] newData = new int[2 * data.length];
            for(int i = 0; i < data.length; i++){
                newData[i]= data[i];
            }

            data = newData; // Resize the stack to double its current size
            top++;
            data[top] = value; // Add the new value to the top of the stack
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
