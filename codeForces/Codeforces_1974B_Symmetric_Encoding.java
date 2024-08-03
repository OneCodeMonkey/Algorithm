// AC: 405 ms 
// Memory: 2200 KB
// sort & map.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1974B_Symmetric_Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            HashSet<Character> record = new HashSet<>();
            for (char c : s.toCharArray()) {
                record.add(c);
            }
            List<Character> sorted = new ArrayList<>(record);
            Collections.sort(sorted);
            HashMap<Character, Character> mapping = new HashMap<>();
            for (int j = 0; j < sorted.size(); j++) {
                char c = sorted.get(sorted.size() - 1 - j);
                mapping.put(sorted.get(j), c);
            }
            StringBuilder ret = new StringBuilder();
            for (char c : s.toCharArray()) {
                ret.append(mapping.get(c));
            }

            System.out.println(ret.toString());
        }
    }
}
