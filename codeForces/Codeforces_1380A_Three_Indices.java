// AC: 577 ms 
// Memory: 1000 KB
// Check if there exist a increasing pair, after it exist a decreasing pair.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1380A_Three_Indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), prev = -1, index1 = -1, index2 = -1, index3 = -1;
            boolean hasIncr1 = false, hasDecrAfterIncr = false;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (hasDecrAfterIncr) {
                    continue;
                }
                if (prev != -1) {
                    if (a > prev) {
                        hasIncr1 = true;
                        index1 = j;
                    } else {
                        if (hasIncr1) {
                            index2 = j;
                            index3 = j + 1;
                            hasDecrAfterIncr = true;
                        }
                    }
                }
                prev = a;
            }

            if (hasIncr1 && hasDecrAfterIncr) {
                System.out.println("YES");
                System.out.println(index1 + " " + index2 + " " + index3);
            } else {
                System.out.println("NO");
            }
        }
    }
}
