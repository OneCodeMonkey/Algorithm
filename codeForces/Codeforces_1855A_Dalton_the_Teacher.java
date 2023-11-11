// AC: 296 ms 
// Memory: 0 KB
// Greedy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1855A_Dalton_the_Teacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), count = 0;
            for (int j = 0; j < n; j++) {
                int p = sc.nextInt();
                if (p == j + 1) {
                    count++;
                }
            }

            System.out.println(count % 2 == 1 ? count / 2 + 1 : count / 2);
        }
    }
}
