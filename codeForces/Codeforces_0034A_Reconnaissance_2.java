// AC: 404 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0034A_Reconnaissance_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), prev = 0, ret = 0, minDiff = Integer.MAX_VALUE, startElem = -1, endElem = -1;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (i == 0) {
                prev = a;
                startElem = a;
                continue;
            }
            if (i == n - 1) {
                endElem = a;
            }
            if (Math.abs(a - prev) < minDiff) {
                minDiff = Math.abs(a - prev);
                ret = i;
            }
            prev = a;
        }
        if (Math.abs(startElem - endElem) < minDiff) {
            ret = n;
        }
        System.out.println(ret == n ? (n + " " + 1) : (ret + " " + (ret + 1)));
    }
}
