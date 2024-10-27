// AC: 312 ms 
// Memory: 700 KB
// Greedy.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_2001A_Make_All_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> record = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                record.merge(a, 1, Integer::sum);
            }
            int maxTime = 1;
            for (int key : record.keySet()) {
                maxTime = Math.max(maxTime, record.get(key));
            }

            System.out.println(n - maxTime);
        }
    }
}
