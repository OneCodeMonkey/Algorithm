// AC: Time: 202 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Codeforces_58A_Chat_room {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        int pos = 0;
        List<Character> record = Arrays.asList('h', 'e', 'l', 'l', 'o');
        for (char c : str.toCharArray()) {
            if (c == record.get(pos)) {
                pos++;
                if (pos == record.size()) {
                    break;
                }
            }
        }

        System.out.println(pos == record.size() ? "YES" : "NO");
    }
}
