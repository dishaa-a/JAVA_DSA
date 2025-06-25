import java.util.*;

public class Class {
    public static class Person{
        int age;
        String name;

        void saysHi(){
            System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
        }
    }
    
    public static void main(String[] args){
        Person p1 = new Person();
        p1.age = 25;
        p1.name = "John";
        p1.saysHi(); // Output: Hi, my name is John and I am 25 years old.

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "Alice";
        p2.saysHi(); // Output: Hi, my name is Alice and I am 30 years old.
    }
}
