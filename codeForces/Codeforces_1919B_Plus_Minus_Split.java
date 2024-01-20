// AC: 421 ms 
// Memory: 0 KB
// Greedy: if a sequence + and - are equal, then make it continous, thus its sum is minimum. The remain count independently.
// T:O(sum(ni)), S:O(max(ni)
// 
import java.util.Scanner;

public class Codeforces_1919B_Plus_Minus_Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), countPlus = 0;
            String s = sc.next();
            for (char c : s.toCharArray()) {
                if (c == '+') {
                    countPlus++;
                }
            }
            int ret = Math.abs(countPlus - (n - countPlus));
            System.out.println(ret);
        }
    }
}
