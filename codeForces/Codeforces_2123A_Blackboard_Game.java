// Time: 280 ms 
// Memory: 500 KB
// Game: n < 3时，凑不成 0,1,2,3 的完整组，先手必赢。n >= 3 时。
// 如果最后取 4 的余数组为 模0，摸1，模2，那么取完四个一组的对称后，剩下的3个，先手的随便取一个，后手都无法凑成 a+b % 4 == 3 的组合。
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2106A_Dr_TC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            boolean ret = false;
            if (n < 3) {
                ret = true;
            } else if (n % 4 != 0) {
                ret = true;
            }

            System.out.println(ret ? "Alice" : "Bob");
        }
    }
}
