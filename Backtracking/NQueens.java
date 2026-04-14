import java.util.*;
/*
The N-Queens problem is a classic where you place N queens on an N×N chessboard such that no two queens attack each other
A queen can attack:
    Same column
    Same left diagonal (\)
    Same right diagonal (/)
So instead of checking the whole board every time, we use Branch and Bound to optimize.

col[]        → tracks used columns
diag1[]      → tracks (row + col)  → "/" diagonal
diag2[]      → tracks (row - col + n - 1) → "\" diagonal

*/

public class NQueens{

    public static void solve(boolean[][] board, int row, boolean[] cols, boolean[] diag1, boolean[] diag2, String asf){
        for(int col = 0; col < board[0].length; col++){
            if(cols[col] == false && diag1[row + col] == false && 
                diag2[row - col + board.length - 1] == false){

                // Place the queen
                board[row][col] = true;
                cols[col] = true;
                diag1[row + col] = true;
                diag2[row - col + board.length - 1] = true;

                if(row == board.length - 1){
                    System.out.println(asf + row + "-" + col);
                } else {
                    solve(board, row + 1, cols, diag1, diag2, asf + row + "-" + col + ", ");
                }

                // Backtrack
                board[row][col] = false;
                cols[col] = false;
                diag1[row + col] = false;
                diag2[row - col + board.length - 1] = false;
            }
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean[][] board = new boolean[n][n];

        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2*n - 1];
        boolean[] diag2 = new boolean[2*n - 1];

        solve(board, 0, cols, diag1, diag2, "");
        }
}
