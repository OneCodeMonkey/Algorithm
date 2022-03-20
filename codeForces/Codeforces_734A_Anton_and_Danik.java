// AC: Time: 217 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_734A_Anton_and_Danik {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), countA = 0;
        String str = sc.next();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'A') {
                countA++;
            }
        }

        System.out.println(2 * countA == n ? "Friendship" : (countA > n - countA ? "Anton" : "Danik"));
    }
}
