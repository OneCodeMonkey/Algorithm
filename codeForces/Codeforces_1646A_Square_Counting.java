// AC: 405 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1646A_Square_Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long s = sc.nextLong(), nSquare = (long) n * n;

            System.out.println(s / nSquare);
        }
    }
}
