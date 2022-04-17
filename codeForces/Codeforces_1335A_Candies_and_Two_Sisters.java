// AC: Time: 264 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1335A_Candies_and_Two_Sisters {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            System.out.println(t < 3 ? 0 : t - t / 2 - 1);
        }
    }
}
