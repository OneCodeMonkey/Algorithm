// AC: 296 ms 
// Memory: 0 KB
// Math & Greedy: if l <= (r-1)/2, then (r % (r + 1) / 2) will be the largest answer, Otherwise r % l is the largest.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1562A_The_Miracle_and_the_Sleeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt(), r = sc.nextInt(), ret = 0;
            if (l != r) {
                if ((r + 1) / 2 >= l) {
                    ret = (r - 1) / 2;
                } else {
                    ret = r % l;
                }
            }
            System.out.println(ret);
        }
    }
}
