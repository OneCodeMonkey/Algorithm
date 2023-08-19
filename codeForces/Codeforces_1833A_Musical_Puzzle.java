// AC: 342 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1833A_Musical_Puzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            HashSet<String> record = new HashSet<>();
            for (int j = 0; j < n - 1; j++) {
                record.add(s.substring(j, j + 2));
            }

            System.out.println(record.size());
        }
    }
}
