package BackTracking;
import java.util.*;

public class N_Queens {

    public static void nQueens(char board[][], int row){
        // base case
        if(row == board.length){
            printBoard(board);
        }
        // column loop
        for (int j = 0; j< board.length; j++){
            board[row][j] = 'Q';
            nQueens(board, row+1);  // recursion
            board [row][j] = '.';   // backtracking :- removing Q giving empty place

        }
    }

    public static void printBoard(char board[][]){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of board : ");
        int n = sc.nextInt();
        char board [][] = new char[n][n];
        // initializing board
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = '.';        // board is initially empty (denoted by .)
            }
        }
    }
}
