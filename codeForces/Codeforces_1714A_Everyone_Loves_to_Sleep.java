// AC: 233 ms 
// Memory: 0 KB
// .
// T:O(sum(nlogn)), S:O(max(n))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1714A_Everyone_Loves_to_Sleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), h = sc.nextInt(), m = sc.nextInt(), retH = -1, retM = -1;
            int[][] record = new int[n][2];
            for (int j = 0; j < n; j++) {
                int hi = sc.nextInt(), mi = sc.nextInt();
                record[j] = new int[]{hi, mi};
            }
            Arrays.sort(record, (a, b) -> (a[0] == b[0] ? (a[1] - b[1]) : (a[0] - b[0])));
            for (int[] row : record) {
                int hI = row[0], mI = row[1];
                if (hI > h || (hI == h && mI >= m)) {
                    retH = hI - h;
                    retM = mI - m;
                    if (retM < 0) {
                        retH -= 1;
                        retM += 60;
                    }
                    break;
                }
            }
            if (retH == -1) {
                retH = record[0][0] + 24 - h;
                retM = record[0][1] - m;
                if (retM < 0) {
                    retH -= 1;
                    retM += 60;
                }
            }

            System.out.println(retH + " " + retM);
        }
    }
}
