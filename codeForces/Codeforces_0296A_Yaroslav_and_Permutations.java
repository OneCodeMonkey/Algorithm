// Time: 624 ms 
// Memory: 900 KB
// .
// T:O(n), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_0296A_Yaroslav_and_Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            freq.merge(a, 1, Integer::sum);
        }
        int maxFreq = 0, half = n % 2 == 0 ? n / 2 : (n / 2 + 1);
        for (int key : freq.keySet()) {
            maxFreq = Math.max(maxFreq, freq.get(key));
        }

        System.out.println(maxFreq <= half ? "YES" : "NO");
    }
}
