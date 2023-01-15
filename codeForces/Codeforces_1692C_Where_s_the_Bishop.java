// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(8*8)
// 
import java.util.Scanner;

public class Codeforces_1692C_Where_s_the_Bishop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            char[][] board = new char[8][8];
            for (int j = 0; j < 8; j++) {
                String row = sc.next();
                for (int k = 0; k < 8; k++) {
                    board[j][k] = row.charAt(k);
                }
            }
            boolean flag = false;
            for (int j = 1; !flag && j <= 6; j++) {
                for (int k = 1; !flag && k <= 6; k++) {
                    if (board[j][k] == '#' && board[j - 1][k - 1] == '#' && board[j + 1][k - 1] == '#'
                            && board[j - 1][k + 1] == '#' && board[j + 1][k + 1] == '#') {
                        System.out.printf("%d %d\n", j + 1, k + 1);
                        flag = true;
                    }
                }
            }
        }
    }
}
