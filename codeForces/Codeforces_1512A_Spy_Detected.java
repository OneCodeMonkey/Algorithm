// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1512A_Spy_Detected {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> record = new HashMap<>();
            HashMap<Integer, Integer> recordIndex = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                record.merge(a, 1, Integer::sum);
                recordIndex.put(a, j + 1);
            }
            for (int item : record.keySet()) {
                if (record.get(item) == 1) {
                    System.out.println(recordIndex.get(item));
                    break;
                }
            }
        }
    }
}
