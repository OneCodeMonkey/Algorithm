// AC: 280 ms 
// Memory: 200 KB
// Greedy. To Cover all possible k-alphabet character formed strings, just repeat "abc..." substring with length k, 
// repeat N times, this string can meets the requirement.
// T:O(sum(ni * ki)), S:O(max(ni * ki))
// 
import java.util.Scanner;

public class Codeforces_1925A_We_Got_Everything_Covered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            String alphabetStr = "abcdefghijklmnopqrstuvwxyz";

            System.out.println(alphabetStr.substring(0, k).repeat(n));
        }
    }
}
