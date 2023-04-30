// AC: 295 ms 
// Memory: 0 KB
// .
// T:O(sum(si.length())), S:O(1)
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1702B_Polycarp_Writes_a_String_from_Memory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int step = 0;
            String s = sc.next();
            HashSet<Character> letters = new HashSet<>();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (!letters.contains(c)) {
                    letters.add(c);
                    while (j + 1 < s.length() && letters.contains(s.charAt(j + 1))) {
                        j++;
                    }
                    if (letters.size() == 3) {
                        step++;
                        letters.clear();
                    }
                }
            }
            if (!letters.isEmpty()) {
                step++;
            }

            System.out.println(step);
        }
    }
}
