// AC: Time: 171 ms 
// Memory: 0 KB
// hashset
// T:O(n), S:O(1)
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_443A_Anton_and_Letters {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashSet<Character> record = new HashSet<>();
        while (sc.hasNext()) {
            String str = sc.next();
            for (char c : str.toCharArray()) {
                if (c != '{' && c != '}' && c != ',' && c != ' ') {
                    record.add(c);
                }
            }
        }
        System.out.println(record.size());
    }
}
