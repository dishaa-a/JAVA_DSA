import java.util.Scanner;

public class takingInput {
    public static void main(String args[]){

        System.out.println("Enter input:");
        Scanner scn = new Scanner(System.in);     //inp is a variable of datatype scanner, initialised here
        //The entered input will be saved in the system by System.in

        int n = scn.nextInt();   //input number will get stored in n

        for(int i=0;i<=n;i++){
            System.out.println(i);
            scn.close();            //close() is imp for resource leak warning
        }
    }
}
