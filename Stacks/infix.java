import java.util.*;

public class infix {

    // Fix spelling of precedence
    public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else {
            return 0; // For '(' or unknown
        }
    }

    public static int operation(int v1, int v2, char operator) {
        switch (operator) {
            case '+':
                return v1 + v2;
            case '-':
                return v1 - v2;
            case '*':
                return v1 * v2;
            case '/':
                if (v2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return v1 / v2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Infix Evaluation");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String expression = sc.nextLine().replaceAll("\\s+", ""); // Remove all spaces

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                operators.push(ch);
            } else if (Character.isDigit(ch)) {
                // Handle multi-digit numbers
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--; // step back after extra increment
                operands.push(num);
            } else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    operands.push(operation(v1, v2, operator));
                }
                if (!operators.isEmpty()) {
                    operators.pop(); // remove '('
                }
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && operators.peek() != '(' &&
                        precedence(operators.peek()) >= precedence(ch)) {
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    operands.push(operation(v1, v2, operator));
                }
                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) {
            char operator = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();
            operands.push(operation(v1, v2, operator));
        }

        System.out.println("The result of the expression is: " + operands.pop());
        sc.close();
    }
}
