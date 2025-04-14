// Permutation
// nPr = n! / (n - r)!
 
import java.util.*;

public class basicEg {

    public static void display(int n, int r, int nPr){
        System.out.println(n + "P" + r + "=" + nPr);
    }

    public static int fact(int x){           
        int rv = 1;
        for(int i = 1; i <= x; i++){        
            rv = rv * i;
        }
        return rv;
    }
    public static void main(String[] args){
        System.out.println("Enter n and r:");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int r = scn.nextInt();

    /*int nfact = 1;
    for(int i = 1; i <= n; i++){
        nfact *= i;
    }
                                           CODE WITHOUT FUNCTION
    int nmrfact = 1;
    for(int i = 1; i <= n - r; i++){
        nmrfact *= i;
    }*/
    int nfact = fact(n);
    int nmrfact = fact(n - r);

    int nPr = nfact / nmrfact;
    display(n, r , nPr);
    }
}

// Functions make maintainability easier.
// functions provide modularity.
// helps to follow DRY(Do not Repeat Yourself) principle.