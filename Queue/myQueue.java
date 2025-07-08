import java.util.*;

public class myQueue {
    public static void main(String[] args){
        Queue<Integer> que = new ArrayDeque<>();

        // Queue adds elements to the end
        // and removes elements from the front
        que.add(10);
        System.out.println(que);
        que.add(20);
        System.out.println(que);
        que.add(30);
        System.out.println(que);
        // Queue is FIFO (First In First Out)

        System.out.println(que.peek());
        System.out.println(que);

        System.out.println(que.remove());
        System.out.println(que);
    }
}
