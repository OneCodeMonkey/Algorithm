// AC: 312 ms 
// Memory: 1100 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2184A_Social_Experiment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            if (n == 2 || n == 3) {
                ret = n;
            } else {
                ret = n % 2;
            }

            System.out.println(ret);
        }
    }
}
