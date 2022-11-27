// AC: 217 ms 
// Memory: 0 KB
// hashmap.
// T:O(n), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_977B_Two_gram {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), maxCount = 0;
        String s = sc.next(), maxCountStr = "";
        HashMap<String, Integer> record = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            String subStr = String.valueOf(s.charAt(i)) + s.charAt(i + 1);
            record.merge(subStr, 1, Integer::sum);
        }
        for (String key : record.keySet()) {
            if (record.get(key) > maxCount) {
                maxCount = record.get(key);
                maxCountStr = key;
            }
        }
        System.out.println(maxCountStr);
    }
}
