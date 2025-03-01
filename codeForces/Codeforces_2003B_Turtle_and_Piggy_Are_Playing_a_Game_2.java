// Time: 405 ms 
// Memory: 1000 KB
// Game & Greedy: 最优情况下，先手的优先删最小的，后手的优先删最大的，那么最终会剩下中间的。
// T:O(sum(ni * logni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_2003B_Turtle_and_Piggy_Are_Playing_a_Game_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);

            System.out.println(arr[n / 2]);
        }
    }
}
