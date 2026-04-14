/*
For each character, you have 2 choices:

1. Include the character
2. Abbreviate it (count it as a number)
Example: "word"
Possible outputs:
word
1ord
w1rd
wo1d
wor1
2rd
w2d
wo2
1o1d
...
4

*/

import java.util.*;

public class Abbreviations {

    public static void solution(String str, String asf, int count, int pos){
        if(pos == str.length()){
            if(count == 0){
                System.out.println(asf);
            } else {}
                System.out.println(asf + count);
            return;
        }

        if(count > 0){
            solution(str, asf + count + str.charAt(pos), 0, pos + 1);
        } else {
            solution(str, asf + str.charAt(pos), 0, pos + 1);
        }

        solution(str, asf, count + 1, pos + 1);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str, "", 0, 0);
    }
}