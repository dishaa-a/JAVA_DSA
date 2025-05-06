import java.util.*;
public class Multiplication{

        // Multiply two numbers in base b
        public static int getProduct(int b, int n1, int n2) {
            int result = 0, power = 1;
            while (n2 > 0) {
                int d2 = n2 % 10;
                n2 /= 10;
                int partial = multiplySingleDigit(b, n1, d2);
                result = addInBase(b, result, partial * power);
                power *= 10;
            }
            return result;
        }
    
        // Multiply n1 with single digit d2 in base b
        public static int multiplySingleDigit(int b, int n1, int d2) {
            int result = 0, carry = 0, power = 1;
            while (n1 > 0 || carry > 0) {
                int d1 = n1 % 10;
                n1 /= 10;
                int product = d1 * d2 + carry;
                carry = product / b;
                int digit = product % b;
                result += digit * power;
                power *= 10;
            }
            return result;
        }
    
        // Add two base-b numbers
        public static int addInBase(int b, int n1, int n2) {
            int result = 0, carry = 0, power = 1;
            while (n1 > 0 || n2 > 0 || carry > 0) {
                int d1 = n1 % 10, d2 = n2 % 10;
                n1 /= 10; n2 /= 10;
                int sum = d1 + d2 + carry;
                carry = sum / b;
                int digit = sum % b;
                result += digit * power;
                power *= 10;
            }
            return result;
        }
        public static void main(String[] args) {
            System.out.println("Enter the numbers to be multipied:");
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.println("Enter base of the numbers:");
        int base = scn.nextInt();
            System.out.println("Product: " + getProduct(base, num1, num2));
        }
}
