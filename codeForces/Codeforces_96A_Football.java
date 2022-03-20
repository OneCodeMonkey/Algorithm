// AC: Time: 404 ms 
// Memory: 0 KB
// 
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_96A_Football {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int maxCount = 0, count = 1;
        String str = sc.next();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }

        System.out.println(maxCount >= 7 ? "YES" : "NO");
    }
}
