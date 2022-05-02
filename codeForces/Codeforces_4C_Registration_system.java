// AC: 2028 ms
// Memory: 0 KB
// hashmap.
// T:O(1), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_4C_Registration_system {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        HashMap<String, Integer> record = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (!record.containsKey(str)) {
                System.out.println("OK");
            } else {
                System.out.println(str + record.get(str));
            }
            record.merge(str, 1, Integer::sum);
        }
    }
}
