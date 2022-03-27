// AC: Time: 186 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_705A_Hulk {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String odd = "I hate ", even = "I love ", it = "it", that = "that ";
        StringBuilder ret = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            ret.append(i % 2 == 1 ? odd : even);
            if (i == n) {
                ret.append(it);
            } else {
                ret.append(that);
            }
        }

        System.out.println(ret.toString());
    }
}
