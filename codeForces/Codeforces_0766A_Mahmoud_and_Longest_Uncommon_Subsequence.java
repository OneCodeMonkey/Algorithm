// AC: 233 ms 
// Memory: 0 KB
// greedy.
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0766A_Mahmoud_and_Longest_Uncommon_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();

        System.out.println(a.equals(b) ? -1 : Math.max(a.length(), b.length()));
    }
}
