// AC: 374 ms 
// Memory: 2000 KB
// Game & Strategy: 前提一开始是一个回文的 01 字符串，那么 
// 1.如果是偶数个 0，简化的只有两个0时，Alice 一开始只能翻转一个 0 到 1，那么 Bob 只需做一个整体翻转，第三轮 Alice 又需要翻转一个 0 到 1， 花费 2:0，Alice 输。
// 如果 2 个以上的偶数个 0 ，则在前 n-2 个 0 的时候，每次 Alice 翻一个 0 ，Bob 翻一个对称的 0，等到最后2个0，执行上面的逻辑，最后分数比 Alice 会少 2，Alice输。
// 2. 如果是奇数个 0，只有一个时，Alice 输。 大于 1 的奇数时，只需一开始占据中间的 0，剩下的情形简化为 偶数个 0 的情况，由于偶数个 0 的情况 先手会 输 2 分，
// 占据中间的 0 输一分，最终还能赢 1 分，所以 Alice 赢。
//
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1527B1_Palindrome_Game_easy_version {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), countZero = 0;
            String s = sc.next();
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    countZero++;
                }
            }

            System.out.println((countZero != 1 && countZero % 2 == 1) ? "ALICE" : "BOB");
        }
    }
}
