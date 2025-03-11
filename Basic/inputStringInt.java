import java.util.*;

public class inputStringInt {

public static void main(String[] args){

        System.out.println("Enter input:");
        System.out.println("Enter name:");
        
        Scanner inp = new Scanner(System.in);     //inp is a variable of datatype scanner, initialised here
        //The entered input will be saved in the system by System.in

        int n = Integer.parseInt(inp.nextLine());   //integer will also be stored as nextLine

        String name=inp.nextLine();            //string will be stored in name

        System.out.println("Dear "+name+" Here is the counting");

        for(int i=0;i<=n;i++){
            System.out.println(i);

            inp.close();         //close() is imp for resource leak warning
        }
    }
}


