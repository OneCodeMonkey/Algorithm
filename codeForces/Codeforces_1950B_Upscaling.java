// AC: 281 ms 
// Memory: 200 KB
// Implementation.
// T:O(sum(ni ^ 2)), S:O(max(ni ^ 2))
// 
import java.util.Scanner;

public class Codeforces_1950B_Upscaling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            StringBuilder ret = new StringBuilder();
            for (int j = 0; j < 2 * n; j++) {
                StringBuilder row = new StringBuilder();
                if ((j / 2) % 2 == 0) {
                    for (int k = 0; k < 2 * n; k++) {
                        if ((k / 2) % 2 == 0) {
                            row.append("#");
                        } else {
                            row.append(".");
                        }
                    }
                } else {
                    for (int k = 0; k < 2 * n; k++) {
                        if ((k / 2) % 2 == 0) {
                            row.append(".");
                        } else {
                            row.append("#");
                        }
                    }
                }
                ret.append(row);
                if (j != 2 * n - 1) {
                    ret.append("\n");
                }
            }

            System.out.println(ret);
        }
    }
}
