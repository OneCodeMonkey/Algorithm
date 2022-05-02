// AC: Time: 374 ms 
// Memory: 0 KB
// .
// T:O(sum(length[i])), S:O(1)
//
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_141A_Amusing_Joke {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = sc.next(), str2 = sc.next(), str3 = sc.next();
        if (str1.length() + str2.length() == str3.length()) {
            HashMap<Character, Integer> record = new HashMap<>();
            for (char c:str1.toCharArray()) {
                record.merge(c, 1, Integer::sum);
            }
            for (char c:str2.toCharArray()) {
                record.merge(c, 1, Integer::sum);
            }
            for (char c:str3.toCharArray()) {
                if (!record.containsKey(c) || record.get(c) <= 0) {
                    System.out.println("NO");
                    return;
                }
                record.merge(c, -1, Integer::sum);
            }
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
