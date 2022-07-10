// AC: 342 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_270A_Fancy_Fence {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int angle = sc.nextInt();
            System.out.println(360 % (180 - angle) == 0 ? "YES" : "NO");
        }
    }
}
