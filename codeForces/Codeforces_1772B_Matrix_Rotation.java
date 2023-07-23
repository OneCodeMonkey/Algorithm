// AC: 249 ms 
// Memory: 100 KB
// Brute-force
// T:O(t * k^2), S:O(k^2)
// 
import java.util.Scanner;

public class Codeforces_1772B_Matrix_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] table = new int[2][2];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    table[j][k] = sc.nextInt();
                }
            }

            System.out.println(check(table) ? "YES" : "NO");
        }
    }

    public static boolean check(int[][] table) {
        if (table[0][0] < table[0][1] && table[1][0] < table[1][1] && table[0][0] < table[1][0] && table[0][1] < table[1][1]) {
            return true;
        }
        if (table[0][0] > table[0][1] && table[1][0] > table[1][1] && table[0][0] < table[1][0] && table[0][1] < table[1][1]) {
            return true;
        }
        if (table[0][0] > table[0][1] && table[1][0] > table[1][1] && table[0][0] > table[1][0] && table[0][1] > table[1][1]) {
            return true;
        }
        if (table[0][0] < table[0][1] && table[1][0] < table[1][1] && table[0][0] > table[1][0] && table[0][1] > table[1][1]) {
            return true;
        }

        return false;
    }
}
