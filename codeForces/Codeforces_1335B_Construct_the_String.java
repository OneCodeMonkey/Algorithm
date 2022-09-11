// AC: 186 ms 
// Memory: 0 KB
// Thought: construct the string as the problem says.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1335B_Construct_the_String {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
            StringBuilder ret = new StringBuilder();
            HashMap<Character, Integer> record = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (j >= a) {
                    char c = ret.charAt(j - a);
                    if (record.get(c) == 1) {
                        record.remove(c);
                    } else {
                        record.merge(c, -1, Integer::sum);
                    }
                }
                if (record.size() < b) {
                    for (int k = 0; k < 26; k++) {
                        char c = (char) (k + 'a');
                        if (!record.containsKey(c)) {
                            ret.append(c);
                            record.merge(c, 1, Integer::sum);
                            break;
                        }
                    }
                } else {
                    char c = ret.charAt(j - 1);
                    ret.append(c);
                    record.merge(c, 1, Integer::sum);
                }
            }

            System.out.println(ret);
        }
    }
}
