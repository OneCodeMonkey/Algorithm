// AC: 296 ms 
// Memory: 0 KB
// .
// T:O(sum(si.length())), S:O(max(si.length()))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1633B_Minority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), ret = 0;
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            HashMap<Character, Integer> record = new HashMap<>();
            for (char c : s.toCharArray()) {
                record.merge(c, 1, Integer::sum);
            }
            int countOne = record.getOrDefault('1', 0), countZero = record.getOrDefault('0', 0);
            if (countZero == countOne) {
                ret = countOne - 1;
            } else {
                ret = Math.min(countOne, countZero);
            }

            System.out.println(ret);
        }
    }
}
