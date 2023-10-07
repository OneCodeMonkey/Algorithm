// AC: 342 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0463B_Caisa_and_Pylons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), prev = 0, cur = 0, ret = 0;
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            cur -= h - prev;
            if (cur < 0) {
                ret = Math.max(ret, -cur);
            }
            prev = h;
        }

        System.out.println(ret);
    }
}
