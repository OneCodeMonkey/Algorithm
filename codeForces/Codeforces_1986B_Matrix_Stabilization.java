// AC: 1171 ms 
// Memory: 2300 KB
// Matrix implementation. 注意坐标下界，row 和 col 的边界变量。
// T:O(sum(ni * mi)), S:O(max(ni * mi))
// 
import java.util.Scanner;

public class Codeforces_1986B_Matrix_Stabilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] matrix = new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    matrix[j][k] = sc.nextInt();
                }
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    int maxAdjacentVal = 0;
                    if (j > 0) {
                        maxAdjacentVal = Math.max(maxAdjacentVal, matrix[j - 1][k]);
                    }
                    if (j < n - 1) {
                        maxAdjacentVal = Math.max(maxAdjacentVal, matrix[j + 1][k]);
                    }
                    if (k > 0) {
                        maxAdjacentVal = Math.max(maxAdjacentVal, matrix[j][k - 1]);
                    }
                    if (k < m - 1) {
                        maxAdjacentVal = Math.max(maxAdjacentVal, matrix[j][k + 1]);
                    }
                    if (matrix[j][k] > maxAdjacentVal) {
                        matrix[j][k] = maxAdjacentVal;
                    }
                }
            }

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    System.out.print(matrix[j][k]);
                    if (k != m - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
