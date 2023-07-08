// AC: 374 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0139A_Petr_and_Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sumOfWeek = 0, lastNonZero = 0;
        int[] week = new int[7];
        for (int i = 0; i < 7; i++) {
            int a = sc.nextInt();
            sumOfWeek += a;
            week[i] = a;
            if (a != 0) {
                lastNonZero = i + 1;
            }
        }
        int remain = n % sumOfWeek, curSum = 0, ret = 0;
        if (remain == 0) {
            ret = lastNonZero;
        } else {
            for (int i = 0; i < 7; i++) {
                curSum += week[i];
                if (curSum >= remain) {
                    ret = i + 1;
                    break;
                }
            }
        }
        System.out.println(ret);
    }
}
