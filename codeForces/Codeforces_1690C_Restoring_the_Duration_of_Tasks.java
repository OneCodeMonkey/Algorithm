// AC: 1981 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1690C_Restoring_the_Duration_of_Tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), prevFinishTime = -1;
            int[] sn = new int[n], fn = new int[n];
            for (int j = 0; j < n; j++) {
                sn[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                fn[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                int s = sn[j], f = fn[j];
                if (j == 0) {
                    System.out.print(f - s);
                } else {
                    if (prevFinishTime >= s) {
                        System.out.print(f - prevFinishTime);
                    } else {
                        System.out.print(f - s);
                    }
                }
                if (j != n - 1) {
                    System.out.print(" ");
                }
                prevFinishTime = f;
            }

            System.out.println();
        }
    }
}
