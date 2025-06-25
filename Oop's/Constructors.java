public class Constructors {
    public static class Person{
        int age;
        String name;

        void saysHi(){
            System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
        }

       /*  Person() {
            // Default constructor
            // This will be called when we create a new Person object without parameters.
            this.age = 0; // Default age
            this.name = "Unknown"; // Default name
        }  */
        // If we forget to initialize the age and name, java will provide default constructor.

        // Parameterized constructor
        Person(int age, String name) {
            this.age = age;
            this.name = name;    // This constructor allows us to create a Person object with specific age and name.
            // 'this' keyword is used to refer to the current object.
            // It helps to distinguish between instance variables and parameters with the same name.
        }
    }
}
    public static void main(String[] args){
        Person p1 = new Person(25, "John");
        p1.saysHi(); // Output: Hi, my name is John and I am 25 years old.
       
        Person p2 = new Person(30, "Alice");
        p2.saysHi(); // Output: Hi, my name is Alice and I am 30 years old.
}
