// AC: 328 ms 
// Memory: 900 KB
// Greedy.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1702D_Not_a_Cheap_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String w = sc.next();
            int p = sc.nextInt(), curSum = 0;
            HashMap<Character, Integer> total = new HashMap<>(), ret = new HashMap<>();
            for (char c : w.toCharArray()) {
                total.merge(c, 1, Integer::sum);
            }
            for (int c = 0; c < 26; c++) {
                char c1 = (char) ('a' + c);
                if (!total.containsKey(c1)) {
                    continue;
                }
                int num = c + 1, count = total.get(c1);
                if (num * count + curSum < p) {
                    curSum += num * count;
                    ret.put(c1, count);
                } else if (num * count + curSum == p) {
                    ret.put(c1, count);
                    break;
                } else {
                    ret.put(c1, (int) Math.floor((p - curSum) * 1.0 / num));
                    break;
                }
            }
            StringBuilder retStr = new StringBuilder();
            for (int j = 0; j < w.length(); j++) {
                char c = w.charAt(j);
                if (ret.getOrDefault(c, 0) > 0) {
                    retStr.append(c);
                    ret.merge(c, -1, Integer::sum);
                }
            }

            System.out.println(retStr);
        }
    }
}
