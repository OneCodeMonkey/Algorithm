// AC: 217 ms 
// Memory: 100 KB
// count the continous equal sequence max length.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1478A_Nezzar_and_Colorful_Balls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), prev = -1, sameCount = 0, ret = 1;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (prev == a) {
                    sameCount++;
                    ret = Math.max(ret, sameCount);
                } else {
                    sameCount = 1;
                }
                prev = a;
            }

            System.out.println(ret);
        }
    }
}
