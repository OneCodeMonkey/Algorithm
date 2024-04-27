// AC: 280 ms 
// Memory: 100 KB
// Greedy: starting with 98, and 9,0,1,2,3,4,5,6,7,8,9,0,1,...  in loop.
// T:O(sum(ni)), S:O(max(ni))
//
import java.util.Scanner;

public class Codeforces_1467A_Wizard_of_Orz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), curDigit = 9;
            StringBuilder ret = new StringBuilder();
            if (n == 1) {
                ret.append(curDigit);
            } else if (n == 2) {
                ret.append(curDigit--);
                ret.append(curDigit);
            } else {
                ret.append(98);
                curDigit = 9;
                for (int j = 2; j < n; j++) {
                    ret.append(curDigit);
                    curDigit = (curDigit + 1) % 10;
                }
            }

            System.out.println(ret);
        }
    }
}
