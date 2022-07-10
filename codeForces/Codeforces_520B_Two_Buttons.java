// AC: 187 ms 
// Memory: 0 KB
// greedy.
// T:O(log(m/n)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_520B_Two_Buttons {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        if (n >= m) {
            System.out.println(n - m);
        } else {
            int ret = 0;
            while (m != n) {
                if (m > n) {
                    if (m % 2 == 0) {
                        m /= 2;
                        ret++;
                    } else {
                        m = (m + 1) / 2;
                        ret += 2;
                    }
                } else {
                    ret += n - m;
                    break;
                }
            }
            System.out.println(ret);
        }
    }
}
