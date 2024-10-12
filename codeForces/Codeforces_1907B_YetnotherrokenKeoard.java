// AC: 655 ms 
// Memory: 56400 KB
// Two array record latest lower or upper chars.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1907B_YetnotherrokenKeoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            List<Integer> upIndex = new ArrayList<>(), loIndex = new ArrayList<>(), marked = new ArrayList<>();
            int pos = 0;
            for (char c : s.toCharArray()) {
                if (c == 'b') {
                    if (!loIndex.isEmpty()) {
                        marked.add(loIndex.get(loIndex.size() - 1));
                        loIndex.remove(loIndex.size() - 1);
                    }
                    marked.add(pos);
                } else if (c == 'B') {
                    if (!upIndex.isEmpty()) {
                        marked.add(upIndex.get(upIndex.size() - 1));
                        upIndex.remove(upIndex.size() - 1);
                    }
                    marked.add(pos);
                } else {
                    if (Character.isUpperCase(c)) {
                        upIndex.add(pos);
                    } else {
                        loIndex.add(pos);
                    }
                }
                pos++;
            }
            StringBuilder ret = new StringBuilder();
            HashSet<Integer> removed = new HashSet<>(marked);
            for (int j = 0; j < s.length(); j++) {
                if (removed.contains(j)) {
                    continue;
                }
                ret.append(s.charAt(j));
            }

            System.out.println(ret);
        }
    }
}
