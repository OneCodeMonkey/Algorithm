// AC: 202 ms 
// Memory: 0 KB
// Hashmap.
// T:O(sum(si.length())), S:O(k), k <= 26
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1551B1_Wonderful_Coloring_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int contribution = 0;
            for (char c : s.toCharArray()) {
                count.merge(c, 1, Integer::sum);
            }
            for (char c : count.keySet()) {
                contribution += Math.min(2, count.get(c));
            }
            count.clear();
            System.out.println(contribution / 2);
        }
    }
}
