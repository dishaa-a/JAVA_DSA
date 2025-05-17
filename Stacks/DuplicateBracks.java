import java.util.*;
public class DuplicateBracks {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();           //Stack declared
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println(true + " Duplicacy found");
                    return;
                } else {
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }

        System.out.println(false + " No duplicacy found");
    }
}
