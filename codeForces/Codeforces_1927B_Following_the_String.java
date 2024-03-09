// AC: 560 ms 
// Memory: 600 KB
// String & Hashmap.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1927B_Following_the_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            StringBuilder ret = new StringBuilder();
            HashMap<Character, Integer> record = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                char c = ' ';
                for (int k = 0; k < 26; k++) {
                    char temp = (char) ('a' + k);
                    if (record.getOrDefault(temp, 0) == a) {
                        c = temp;
                        break;
                    }
                }
                ret.append(c);
                record.merge(c, 1, Integer::sum);
            }

            System.out.println(ret);
        }
    }
}
