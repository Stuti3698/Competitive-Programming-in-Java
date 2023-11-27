

import java.util.HashSet;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[][] = new char[9][9];
        Solution s = new Solution();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.next().charAt(0); // Read characters instead of integers
            }
        }
        boolean res = s.isValidSudoku(arr);
        System.out.println(res);
    }

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!seen.add("row" + i + board[i][j]) || !seen.add("column" + j + board[i][j])) {
                        return false;
                    }
                    if (!seen.add("box" + (i / 3) * 3 + j / 3 + board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

