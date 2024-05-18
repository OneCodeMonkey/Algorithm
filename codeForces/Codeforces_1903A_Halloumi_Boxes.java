// AC: 250 ms 
// Memory: 1000 KB
// Only k==1 and array is not sorted, the answer is NO.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1903A_Halloumi_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), prev = -1;
            boolean ret = true;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (k == 1 && ret) {
                    if (a >= prev) {
                        prev = a;
                    } else {
                        ret = false;
                    }
                }
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
