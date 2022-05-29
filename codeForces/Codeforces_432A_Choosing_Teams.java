// AC: 202 ms 
// Memory: 24700 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_432A_Choosing_Teams {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt(), ret = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() + k <= 5) {
                ret++;
            }
        }
        System.out.println(ret / 3);
    }
}
