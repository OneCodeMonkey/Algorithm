// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1872A_Two_Vessels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), ret = 0;
            if (a != b) {
                int base = Math.abs(a - b) % c == 0 ? Math.abs(a - b) / c : (Math.abs(a - b) / c + 1);
                ret = base % 2 == 0 ? base / 2 : (base / 2 + 1);
            }
            System.out.println(ret);
        }
    }
}
