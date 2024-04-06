// AC: 311 ms 
// Memory: 1100 KB
// Greedy. Implementation.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1935A_Entertainment_in_MAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next(), reverse = new StringBuilder(s).reverse().toString(), ret = s;
            int compare = s.compareTo(reverse);
            if (compare < 0) {
                if (n % 2 == 1) {
                    ret = s + reverse;
                }
            } else if (compare > 0) {
                if (n % 2 == 0) {
                    ret = reverse + s;
                }
            }

            System.out.println(ret);
        }
    }
}
