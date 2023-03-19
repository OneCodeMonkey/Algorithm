// AC: 576 ms 
// Memory: 0 KB
// There are two groups, send downvotes to another group, the remain is upvote and type 3.
// T:O(sum(ni)), S:O(1)
//
import java.util.Scanner;

public class Codeforces_1511A_Review_Site {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), upCount = 0;
            for (int j = 0; j < n; j++) {
                int r = sc.nextInt();
                if (r == 1 || r == 3) {
                    upCount++;
                }
            }

            System.out.println(upCount);
        }
    }
}
