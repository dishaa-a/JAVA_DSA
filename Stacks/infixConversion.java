import java.beans.Expression;
import java.util.Scanner;
import java.util.Stack;

public class infixConversion {
    public static void main(String[] args){
        System.out.println("Infix Conversion");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String Expression = sc.nextLine();

        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i < Expression.length(); i++){
            char ch = Expression.charAt(i);
            if(ch == '('){
                op.push(ch);
            } else if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z')){
                post.push(ch + "");
                pre.push(ch + "");     // character to string conversion by concatenation
            } else if(ch ==')'){
                while(op.peek() != '('){
                    char operator = op.pop();

                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postValue = postv1 + postv2 + operator;
                    post.push(postValue);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String preValue = operator + prev1 + prev2 ;
                    pre.push(preValue);
                }

                op.pop(); // pop the '('
            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                    while(op.size() > 0 && op.peek() != '(' && precedence(ch) <= precedence(op.peek())){
                    char operator = op.pop();

                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postValue = postv1 + postv2 + operator;
                    post.push(postValue);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String preValue = prev1 + prev2 + operator;
                    pre.push(preValue);
                }
                op.push(ch);
            }
        }
         while(op.size() > 0){
                    char operator = op.pop();

                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postValue = postv1 + postv2 + operator;
                    post.push(postValue);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String preValue = prev1 + prev2 + operator;
                    pre.push(preValue);
                }
        System.out.println("Postfix: " + post.peek());
        System.out.println("Prefix: " + pre.peek());    
        
    }

     public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else {
            return 0; // For '(' or unknown
        }
    }

}
