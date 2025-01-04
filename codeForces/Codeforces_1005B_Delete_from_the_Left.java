// Time: 343 ms 
// Memory: 1100 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1005B_Delete_from_the_Left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        int len1 = s.length(), len2 = t.length(), minLen = Math.min(len1, len2), index = minLen;
        for (int i = 0; i < minLen; i++) {
            if (s.charAt(len1 - 1 - i) != t.charAt(len2 - 1 - i)) {
                index = i;
                break;
            }
        }

        System.out.println(len1 + len2 - 2 * index);
    }
}
