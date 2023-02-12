// AC: 186 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1791A_Codeforces_Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashSet<String> check = new HashSet<>();
        for (char c : "codeforces".toCharArray()) {
            check.add(String.valueOf(c));
        }

        for (int i = 1; i <= t; i++) {
            String s = sc.next();
            System.out.println(check.contains(s) ? "YES" : "NO");
        }
    }
}
