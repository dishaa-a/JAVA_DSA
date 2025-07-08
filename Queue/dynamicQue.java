import java.util.*;

public class dynamicQue {
    public static class CustomQueue {
        int[] data;
        int front;
        int size;

        public CustomQueue(int cap){
            data = new int[cap];
            front = 0;
            size = 0;
        }

        int size(){
            return size;
        }

        void display() {
            for(int i = 0; i < size; i++){
                int idx = (front + i) % data.length;
                System.out.print(data[idx] + " ");
            }
            System.out.println();
        }

        void add(int val){
            if(size == data.length){
                int[] newData = new int[2 * data.length];
                for(int i = 0; i < size; i++){
                    int idx = (front + i) % data.length;
                    newData[i] = data[idx];
                }
                data = newData;
                front = 0;

                int rear = (front + size) % data.length;
                data[rear] = val;
                size++;
            } else {
                int rear = (front + size) % data.length;
                data[rear] = val;
                size++;
            }
        }

        int remove() {
            if(size == 0){
                System.out.println("Queue underflow");
                return -1;
            } else {
                int val = data[front];
                front = (front + 1) % data.length;
                size--;
                return val;
        }
    }
         int peek() {
            if(size == 0){
                System.out.println("Queue underflow");
                return -1;
            } else {
                return data[front];
            }
         }
    }

    public static void main(String[] args) {
        CustomQueue q = new CustomQueue(5); // capacity = 5

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(70);
        q.display();  // Output: 10 20 30 40 50

        q.add(60);    // Overflow

        System.out.println("Removed: " + q.remove()); // 10
        System.out.println("Peek: " + q.peek());      // 20

        q.display();  // Output: 20 30 40 50

        q.add(60);
        q.display();  // Output: 20 30 40 50 60

        System.out.println("Size: " + q.size());      // 5
    }
}
