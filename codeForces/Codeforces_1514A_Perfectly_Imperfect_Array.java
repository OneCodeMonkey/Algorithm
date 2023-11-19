// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1514A_Perfectly_Imperfect_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (flag) {
                    int sqrtNum = (int) Math.sqrt(a);
                    if (sqrtNum * sqrtNum != a) {
                        flag = false;
                    }
                }
            }

            System.out.println(flag ? "NO" : "YES");
        }
    }
}
