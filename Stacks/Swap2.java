public class Swap2 {
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


        swap1(p1, p2);
        p1.saysHi();
        p2.saysHi();
    }

    public static void swap1(Person ps1, Person ps2){
        int tempAge = ps1.age;
        String tempName = ps1.name;

        ps1.age = ps2.age;
        ps1.name = ps2.name;

        ps2.age = tempAge;  
        ps2.name = tempName;
        
        System.out.println("After swapping:");
    }
}
