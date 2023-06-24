// AC: 249 ms 
// Memory: 0 KB
// greedy, constructive
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1388A_Captain_Flint_and_Crew_Recruitment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            boolean ret = true;
            String retStr = "";
            if (n < 31) {
                ret = false;
            } else if (n == 36 || n == 40 || n == 44) {
                retStr = "6 10 15 " + (n - 31);
            } else {
                retStr = "6 10 14 " + (n - 30);
            }

            System.out.println(ret ? "YES" : "NO");
            if (ret) {
                System.out.println(retStr);
            }
        }
    }
}
