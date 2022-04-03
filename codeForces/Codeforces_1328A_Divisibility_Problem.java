// AC: Time: 295 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1328A_Divisibility_Problem {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), a, b;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            int remain = a % b;
            System.out.println(remain == 0 ? 0 : (b - remain));
        }
    }
}
