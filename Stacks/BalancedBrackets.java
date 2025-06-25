import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args){
        System.out.println(("Enter the string :"));
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>(); // Stack declared
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else if (ch == ')'){
                boolean val = handleClosing(st, '(');
                if (val == false){
                    System.out.println(val);
                    return;
                }
            } else if (ch == '}'){
               boolean val = handleClosing(st, '{');
                if (val == false){
                    System.out.println(val);
                    return;
                }
            } else if (ch ==']'){
                boolean val = handleClosing(st, '[');
                if (val == false){
                    System.out.println(val);
                    return;
                }
            }
        }
        if (st.size() == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

        public static boolean handleClosing(Stack<Character> st, char correspoch){
            if(st.size() == 0){
                return false;
            } else if (st.peek() != correspoch){
                return false;
            } else {
                st.pop();
                return true;
            }
        }
    }
