// AC: 217 ms 
// Memory: 0 KB
// Repeat the n-th character will be an answer to the requirement.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1400A_String_Similarity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(String.valueOf(s.charAt(n - 1)).repeat(n));
        }
    }
}
