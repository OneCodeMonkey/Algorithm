// Time: 265 ms 
// Memory: 100 KB
// Game: 偶数距离，先手必赢。只需先将距离缩小，后跟着对手的方向走即可。
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2055A_Two_Frogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
            System.out.println((a - b) % 2 == 0 ? "YES" : "NO");
        }
    }
}
