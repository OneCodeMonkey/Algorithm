// AC: 218 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1759A_Yes_Yes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Character, Character> record = new HashMap<>() {{
            put('Y', 'e');
            put('e', 's');
            put('s', 'Y');
        }};
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            boolean flag = record.containsKey(s.charAt(0));
            for (int j = 0; flag && j < s.length() - 1; j++) {
                if (!record.containsKey(s.charAt(j)) || s.charAt(j + 1) != record.get(s.charAt(j))) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
