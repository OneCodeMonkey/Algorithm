// AC: 374 ms 
// Memory: 0 KB
// hashmap
// T:O(n), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_43A_Football {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), maxScore = 0;
        HashMap<String, Integer> record = new HashMap();

        for (int i = 0; i < n; i++) {
            record.merge(sc.next(), 1, Integer::sum);
        }
        String ret = "";
        for (String name : record.keySet()) {
            int score = record.get(name);
            if (score > maxScore) {
                ret = name;
                maxScore = score;
            }
        }

        System.out.println(ret);
    }
}
