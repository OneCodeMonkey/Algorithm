// AC: 234 ms 
// Memory: 800 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1977A_Little_Nikita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt();
            boolean ret = m <= n && ((n - m) % 2 == 0);

            System.out.println(ret ? "Yes" : "No");
        }
    }
}
