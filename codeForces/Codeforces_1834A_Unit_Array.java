// AC: 328 ms 
// Memory: 900 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1834A_Unit_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0, countNega = 0, sum = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                countNega += a == -1 ? 1 : 0;
                sum += a;
            }
            if (sum >= 0 && countNega % 2 == 0) {
                ret = 0;
            } else if (sum < 0) {
                int countPosi = n - countNega;
                if ((countNega - countPosi) % 2 == 1) {
                    ret = (countNega - countPosi) / 2 + 1;
                } else {
                    ret = (countNega - countPosi) / 2;
                }
                if ((countNega - ret) % 2 == 1) {
                    ret++;
                }
            } else {
                ret = 1;
            }

            System.out.println(ret);
        }
    }
}
