// AC: 359 ms 
// Memory: 900 KB
// Greedy: 从 0-indexed 开始看，如果当前位置是 1，但剩余的后面位置没有 0 用于替换（或当前 0，但后续没有 1 用于替换），
// ，那么从当前位置到末尾的整个子串，都只能被删掉（而无法通过交换解决。）
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1913B_Swap_and_Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int ret = 0, countZero = 0, countOne = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    countZero++;
                }
            }
            countOne = s.length() - countZero;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '0') {
                    if (countOne > 0) {
                        countOne--;
                    } else {
                        ret = s.length() - j;
                        break;
                    }
                } else {
                    if (countZero > 0) {
                        countZero--;
                    } else {
                        ret = s.length() - j;
                        break;
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
