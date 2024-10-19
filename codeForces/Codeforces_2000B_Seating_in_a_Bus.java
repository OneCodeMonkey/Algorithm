// AC: 624 ms 
// Memory: 1000 KB
// Two-pointers.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2000B_Seating_in_a_Bus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), left = -1, right = -1;
            boolean ret = true;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (!ret) {
                    continue;
                }
                if (left == -1) {
                    left = a;
                    right = a;
                } else {
                    if (a == left - 1) {
                        left = a;
                    } else if (a == right + 1) {
                        right = a;
                    } else {
                        ret = false;
                    }
                }
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
