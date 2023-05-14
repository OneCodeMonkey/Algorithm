// AC: 732 ms 
// Memory: 0 KB
// Greedy: find the largest and has a lower adjacent element, it's an answer.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1433C_Dominant_Piranha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), prev = 0, maxVal = 0, retIndex = -1;
            boolean hasDifferentElement = false;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                maxVal = Math.max(maxVal, a);
                if (prev != 0 && a != prev) {
                    hasDifferentElement = true;
                    if (a == maxVal || prev == maxVal) {
                        retIndex = a == maxVal ? j + 1 : j;
                    }
                }
                prev = a;
            }

            System.out.println(!hasDifferentElement ? -1 : retIndex);
        }
    }
}



// todo
// 如果要找有多少个这样的满足条件食人鱼个数呢？
// 值得思考