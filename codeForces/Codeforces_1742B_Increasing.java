// Time: 187 ms 
// Memory: 0 KB
// hashset
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1742B_Increasing {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            boolean flag = true;
            HashSet<Integer> record = new HashSet<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (!record.add(a)) {
                    flag = false;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
