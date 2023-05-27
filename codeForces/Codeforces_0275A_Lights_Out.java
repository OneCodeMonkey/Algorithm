// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(n^2), S:O(n^2)
// 
import java.util.Scanner;

public class Codeforces_0275A_Lights_Out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] table = new int[3][3], result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int a = sc.nextInt();
                table[i][j] = a % 2;
                result[i][j] = 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == 1) {
                    result[i][j] = (result[i][j] + 1) % 2;
                    if (i - 1 >= 0) {
                        result[i - 1][j] = (result[i - 1][j] + 1) % 2;
                    }
                    if (i + 1 < 3) {
                        result[i + 1][j] = (result[i + 1][j] + 1) % 2;
                    }
                    if (j - 1 >= 0) {
                        result[i][j - 1] = (result[i][j - 1] + 1) % 2;
                    }
                    if (j + 1 < 3) {
                        result[i][j + 1] = (result[i][j + 1] + 1) % 2;
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
