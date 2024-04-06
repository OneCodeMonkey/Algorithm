// AC: 281 ms 
// Memory: 1200 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1950A_Stair_Peak_or_Neither {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            String ret = "NONE";
            if (a < b) {
                if (b < c) {
                    ret = "STAIR";
                } else if (b > c) {
                    ret = "PEAK";
                }
            }
            System.out.println(ret);
        }
    }
}
