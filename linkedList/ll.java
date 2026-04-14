import java.util.*;

public class ll {
    public static class Node{
        int data;
        Node next;
    }

    public static class myLinkedList {
        Node head;
        Node tail;
        int size;

        // add last
        void addLast(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;   
            }
            size++;
        } 

         public int size(){
            return size;
         }

         public int getFirst(){
            if(size == 0){
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
         }

         public int getAt(int idx) {
             if(size == 0){
                System.out.println("List is empty");
                return -1;
            } else if(idx < 0 || idx >= size){ 
                System.out.println("Invalid argument");
                return -1;
            } else {
                Node temp = head;
                for(int i = 0; i < idx; i++){
                    temp = temp.next;
                }
                return temp.data;
            }
            }

            public void addFirst(int val) { 
                Node n = new Node();
                n.data = val;
                n.next = head;
                head = n;

                if(size == 0){
                   tail = n;
              }

                size++;
            }

            public void addAtIndex(int val, int idx){
                if(idx < 0 || idx > size){
                    System.out.println("Invalid argument");
                } else if(idx == 0){
                    Node n = new Node();
                n.data = val;
                n.next = head;
                head = n;

                if(size == 0){
                   tail = n;
              }

                size++;
                } else if (idx == size){
                    Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;   
            }
            size++;
                } else {
                    Node n = new Node();
                    n.data = val;

                    Node temp = head;
                    for(int i = 0; i < idx - 1; i++){
                        temp = temp.next;
                    }

                    n.next = temp.next;
                    temp.next = n;
                    size++;
                }
            }

         public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        public void display() {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }   

        public void removeFirst() {
            if(size == 0){
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
            head = head.next;
            size--;
            }
        }

        public void removeLast() {
            if(size == 0){
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else { 
                Node temp = head;
                for(int i = 0; i < size - 2; i++){
                    temp = temp.next;
                }
                tail = temp;
                temp.next = null;
                size--;
            }
        }

        public void removeAtIndex(int idx){
            Node temp = head;
            for(int i = 0; i < idx -1 ; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
    public static void main(String[] args){
        myLinkedList list = new myLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();
        System.out.println("Last: " + list.getLast());    // Output: 30
        list.removeFirst();
        list.display();
        list.getAt(1);
        list.addFirst(6);
        list.display();
        list.addAtIndex(1,4);
        list.addAtIndex(4,1);
        list.display();
        list.removeLast();
        list.display();
        list.removeAtIndex(1);
        list.display();
    }
}

