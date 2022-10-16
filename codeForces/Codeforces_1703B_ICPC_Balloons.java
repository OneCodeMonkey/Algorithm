// AC: 171 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1703B_ICPC_Balloons {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            HashSet<Character> record = new HashSet<>();
            for (char c : s.toCharArray()) {
                record.add(c);
            }
            System.out.println(n + record.size());
        }
    }
}
