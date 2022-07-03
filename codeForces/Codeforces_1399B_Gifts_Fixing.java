// AC: 249 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1399B_Gifts_Fixing {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), pos = 0, aMin = Integer.MAX_VALUE, bMin = Integer.MAX_VALUE;
            long ret = 0;
            int[] aRecord = new int[n], bRecord = new int[n];
            for (int j = 0; j < n; j++) {
                int aI = sc.nextInt();
                aRecord[pos++] = aI;
                aMin = Math.min(aMin, aI);
            }
            pos = 0;
            for (int j = 0; j < n; j++) {
                int bI = sc.nextInt();
                bRecord[pos++] = bI;
                bMin = Math.min(bMin, bI);
            }
            for (int j = 0; j < n; j++) {
                ret += Math.max(aRecord[j] - aMin, bRecord[j] - bMin);
            }
            System.out.println(ret);
        }
    }
}
