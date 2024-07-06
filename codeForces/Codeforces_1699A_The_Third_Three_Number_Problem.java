// AC: 312 ms 
// Memory: 1200 KB
// Construct. Greedy.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1699A_The_Third_Three_Number_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = -1;
            if (n % 2 == 0) {
                System.out.println(0 + " " + n / 2 + " " + n / 2);
            } else {
                System.out.println(-1);
            }
        }
    }
}
