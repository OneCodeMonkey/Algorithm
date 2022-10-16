// AC: 218 ms 
// Memory: 0 KB
// bitwise manipulation
// T:(n * m), S:O(m)
// 
import java.util.Scanner;

public class Codeforces_467B_Fedor_and_New_Game {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(), pos = 0, ret = 0;
        int[] record = new int[m + 1];
        for (int i = 0; i <= m; i++) {
            record[pos++] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int compare = record[i], compare2 = record[m], diffCount = 0;
            boolean flag = true;
            while (compare > 0 || compare2 > 0) {
                int bit1 = compare > 0 ? compare % 2 : 0, bit2 = compare2 > 0 ? compare2 % 2 : 0;
                if (bit1 != bit2) {
                    diffCount++;
                    if (diffCount > k) {
                        flag = false;
                        break;
                    }
                }
                compare >>= 1;
                compare2 >>= 1;
            }
            if (flag) {
                ret++;
            }
        }
        System.out.println(ret);
    }
}
