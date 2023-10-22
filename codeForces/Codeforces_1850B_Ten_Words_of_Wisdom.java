// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1850B_Ten_Words_of_Wisdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), maxVal = 0;
            HashMap<Integer, Integer> valToIndex = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt(), b = sc.nextInt();
                if (a <= 10) {
                    maxVal = Math.max(maxVal, b);
                    valToIndex.put(b, j + 1);
                }
            }

            System.out.println(valToIndex.get(maxVal));
        }
    }
}
