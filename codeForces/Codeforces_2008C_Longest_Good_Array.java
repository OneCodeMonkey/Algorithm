// AC: 374 ms 
// Memory: 900 KB
// Math.
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2008C_Longest_Good_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt(), r = sc.nextInt(), range = r - l, ret = 1;
            if (range > 0) {
                int sqrtN = (int) Math.sqrt(2 * range);
                if (sqrtN * (sqrtN + 1) / 2 <= range) {
                    ret = sqrtN + 1;
                } else {
                    ret = sqrtN;
                }
            }

            System.out.println(ret);
        }
    }
}
