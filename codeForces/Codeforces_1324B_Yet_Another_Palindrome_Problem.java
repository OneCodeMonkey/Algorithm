// AC: 374 ms 
// Memory: 0 KB
// Hashmap: If exists such palindromes with length >= 3, then must exist same elements and 
// their indexs i and j must have |i - j| > 1.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1324B_Yet_Another_Palindrome_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            boolean flag = false;
            HashMap<Integer, Integer> record = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (!flag) {
                    if (record.containsKey(a) && j - record.get(a) > 1) {
                        flag = true;
                    } else {
                        record.putIfAbsent(a, j);
                    }
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
