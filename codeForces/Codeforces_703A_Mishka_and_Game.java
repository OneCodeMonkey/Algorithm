// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_703A_Mishka_and_Game {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), mCount = 0, cCount = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt(), c = sc.nextInt();
            if (m > c) {
                mCount++;
            } else if (m < c) {
                cCount++;
            }
        }
        System.out.println(mCount > cCount ? "Mishka" : (mCount < cCount ? "Chris" : "Friendship is magic!^^"));
    }
}
