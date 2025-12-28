package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nqueens {

    private static List<List<String>> solveNqueens(int n){

        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        nQueens(result, board, 0, n);
        return result;

    }

    private static void nQueens(List<List<String>> ans, char[][] board, int row, int n){
        if(row==n){
            ans.add(construct(board));
            return;
        }
        for(int col =0; col<n;col++){
            if(isSafe(board,row,col,n)){
                board[row][col] = 'Q';
                nQueens(ans,board,row+1,n);
                board[row][col] = '.';
            }
        }
    }
    private static List<String> construct(char[][] board) {
        List<String> path = new ArrayList<>();
        for (char[] row : board) {
            path.add(new String(row));
        }
        return path;
    }
    private static boolean isSafe(char[][] board, int row, int col, int n){
        // check column
        for (int i = 0; i < n; i++) {
            if (board[row][i] == 'Q') return false;
        }

        for (int j = 0; j < n; j++) {
            if (board[j][col] == 'Q') return false;
        }

        // check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
    public static void main(String[] main){
        Nqueens solver = new Nqueens();
        List<List<String>> solutions = solver.solveNqueens(4);
        for (List<String> sol : solutions) {
            for (String row : sol) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
