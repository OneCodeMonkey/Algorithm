// AC: 671 ms
// Memory: 1300 KB
// Brute-force.
// T:O(t * (10^3)), S:O(1)
// 
import java.util.Scanner;
import java.util.TreeMap;

public class Codeforces_1990A_Submission_Bait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            boolean flag = false;
            TreeMap<Integer, Integer> record = new TreeMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                record.merge(a % 10, 1, Integer::sum);
            }
            for (int key1 : record.keySet()) {
                for (int key2 : record.keySet()) {
                    if (key2 < key1 || (key2 == key1 && record.get(key1) == 1)) {
                        continue;
                    }
                    for (int key3 : record.keySet()) {
                        if (key3 < key2 || (key3 == key2 && record.get(key2) == 1) || (key3 == key2 && key2 == key1 && record.get(key1) == 2)) {
                            continue;
                        }
                        if ((key1 + key2 + key3) % 10 == 3) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
