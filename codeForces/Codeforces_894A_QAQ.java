// AC: 187 ms 
// Memory: 0 KB
// Accumulated sum: we record the 'Q' time at the position i, then if we meet a 'A', multiple the former 'Q' time and the latter 'Q' time.
// T:O(n), S:O(n)
//
import java.util.Scanner;

public class Codeforces_894A_QAQ {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        int len = s.length(), curCountQ = 0, ret = 0;
        int[] countQ = new int[len];
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'Q') {
                curCountQ++;
            }
            countQ[i] = curCountQ;
        }
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'A') {
                ret += countQ[i] * (countQ[len - 1] - countQ[i]);
            }
        }

        System.out.println(ret);
    }
}
