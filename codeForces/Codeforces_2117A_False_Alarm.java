// Time: 280 ms 
// Memory: 700 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2117A_False_Alarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), x = sc.nextInt(), firstCloseIndex = -1, lastCloseIndex = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a == 1) {
                    if (firstCloseIndex == -1) {
                        firstCloseIndex = j;
                    }
                    lastCloseIndex = j;
                }
            }
            boolean ret = false;
            if (firstCloseIndex == -1) {
                ret = true;
            } else {
                ret = lastCloseIndex - firstCloseIndex < x;
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
