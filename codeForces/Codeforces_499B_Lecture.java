// AC: 234 ms 
// Memory: 0 KB
// Hashmap.
// T:O(m + n), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_499B_Lecture {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        HashMap<String, String> mapping = new HashMap<>();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String str1 = sc.next(), str2 = sc.next();
            if (str2.length() < str1.length()) {
                mapping.put(str1, str2);
            } else {
                mapping.put(str1, str1);
            }
        }
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            ret.append(mapping.get(word));
            if (i != n - 1) {
                ret.append(" ");
            }
        }

        System.out.println(ret);
    }
}
