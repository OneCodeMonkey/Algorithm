// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n), n = name.length
// 
import java.util.Scanner;

public class Codeforces_731A_Night_at_the_Museum {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name = sc.next();
        int cur = 1, ret = 0;
        for (int i = 0; i < name.length(); i++) {
            int target = name.charAt(i) - 'a' + 1;
            if (target > cur) {
                ret += Math.min(target - cur, cur + 26 - target);
            } else {
                ret += Math.min(cur - target, target + 26 - cur);
            }
            cur = target;
        }
        System.out.println(ret);
    }
}
