// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(t * n), S:O(max(n))
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1520A_Do_Not_Be_Distracted {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String str = sc.next();
            HashSet<Character> record = new HashSet<>();
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                char c = str.charAt(j);
                if (record.contains(c) && (j > 0 && str.charAt(j - 1) != c)) {
                    flag = false;
                    System.out.println("NO");
                    break;
                }
                record.add(c);
            }
            if (flag) {
                System.out.println("YES");
            }
        }
    }
}
