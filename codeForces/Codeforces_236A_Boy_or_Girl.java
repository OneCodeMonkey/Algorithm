// AC: Time: 404 ms 
// Memory: 0 KB
// count unique chars.
// T:O(n), S:(1)
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_236A_Boy_or_Girl {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        HashSet<Character> record = new HashSet<>();
        for (char c : str.toCharArray()) {
            record.add(c);
        }
        System.out.println(record.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}
