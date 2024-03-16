// AC: 249 ms 
// Memory: 300 KB
// Greedy.
// T:O(t * k), S:O(k), k=3
// 
import java.util.Scanner;

public class Codeforces_1931A_Recovering_a_Small_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), cur = n - 3;
            StringBuilder ret = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                if (cur > 25) {
                    ret.append((char) ('a' + 25));
                    cur -= 25;
                } else {
                    ret.append((char) ('a' + cur));
                    cur = 0;
                }
            }

            System.out.println(ret.reverse());
        }
    }
}
