// AC: 405 ms 
// Memory: 400 KB
// Hashmap. Check odd count char occurence, must be  >= oddCount - 1.
// T:O(sum(ni)), S:O(1)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1883B_Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> record = new HashMap<>();
            for (char c : s.toCharArray()) {
                record.merge(c, 1, Integer::sum);
            }
            int countOdd = 0;
            for (char c : record.keySet()) {
                if (record.get(c) % 2 == 1) {
                    countOdd++;
                }
            }

            System.out.println(k < countOdd - 1 ? "NO" : "YES");
        }
    }
}
