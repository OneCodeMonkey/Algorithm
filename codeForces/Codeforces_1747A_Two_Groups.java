// AC: 639 ms 
// Memory: 0 KB
// Greedy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1747A_Two_Groups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long sumPosi = 0, sumNega = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a > 0) {
                    sumPosi += a;
                } else {
                    sumNega += -a;
                }
            }

            System.out.println(Math.abs(sumPosi - sumNega));
        }
    }
}
