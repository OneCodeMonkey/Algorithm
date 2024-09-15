// AC: 531 ms 
// Memory: 1100 KB
// Greedy: Merge a smaller piece to bigger. And except the max piece, all other piece with length a will cost (2*a-1) operations.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1992B_Angry_Monk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), maxVal = 0;
            long ret = 0;
            for (int j = 0; j < k; j++) {
                int a = sc.nextInt();
                ret += 2L * a - 1;
                maxVal = Math.max(maxVal, a);
            }
            ret -= 2L * maxVal - 1;

            System.out.println(ret);
        }
    }
}
