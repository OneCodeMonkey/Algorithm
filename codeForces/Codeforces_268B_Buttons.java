// AC: 404 ms 
// Memory: 0 KB
// Math: In the worst case, from i = 1 to n-1 you need to check (n - i) times to exclude the wrong option.
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_268B_Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ret = n;
        for (int i = 1; i <= n - 1; i++) {
            ret += i * (n - i);
        }

        System.out.println(ret);
    }
}
