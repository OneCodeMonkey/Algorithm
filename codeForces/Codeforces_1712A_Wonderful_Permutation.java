// AC: 202 ms 
// Memory: 0 KB
// Just find first K elements missing how many elements in permutation [1...k]
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1712A_Wonderful_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), maxScore = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), countOneToK = 0;
            for (int j = 0; j < n; j++) {
                int p = sc.nextInt();
                if (j < k && p <= k) {
                    countOneToK++;
                }
            }
            System.out.println(k - countOneToK);
        }
    }
}
