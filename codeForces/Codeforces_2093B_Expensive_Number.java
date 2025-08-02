// Time: 265 ms 
// Memory: 1300 KB
// Greedy.
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2093B_Expensive_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String n = sc.next();
            int lastNonZeroIndex = -1, countPrefixNonZero = 0, countSuffix = 0;
            for (int j = n.length() - 1; j >= 0; j--) {
                if (n.charAt(j) != '0') {
                    lastNonZeroIndex = j;
                    break;
                }
                countSuffix++;
            }
            for (int j = 0; j < lastNonZeroIndex; j++) {
                if (n.charAt(j) != '0') {
                    countPrefixNonZero++;
                }
            }

            System.out.println(countPrefixNonZero + countSuffix);
        }
    }
}
