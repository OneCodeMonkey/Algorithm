// AC: 171 ms 
// Memory: 0 KB
// .
// T:O(sum(logn)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1651A_Playoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            System.out.println((int) Math.pow(2, n) - 1);
        }
    }
}
