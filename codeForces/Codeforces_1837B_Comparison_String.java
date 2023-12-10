// AC: 202 ms 
// Memory: 100 KB
// Greedy: Count continous sign < or >.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1837B_Comparison_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), countContinousLess = 0, countContinousGreater = 0, ret = 1;
            String s = sc.next();
            for (char c : s.toCharArray()) {
                if (c == '<') {
                    countContinousLess++;
                    countContinousGreater = 0;
                    ret = Math.max(ret, countContinousLess + 1);
                } else {
                    countContinousGreater++;
                    countContinousLess = 0;
                    ret = Math.max(ret, countContinousGreater + 1);
                }
            }
            System.out.println(ret);
        }
    }
}
