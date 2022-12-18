// AC: 295 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)). S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1567A_Domino_Disaster {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                char c = s.charAt(j);
                if (c == 'L' || c == 'R') {
                    sb.append(c);
                } else if (c == 'U') {
                    sb.append('D');
                } else {
                    sb.append('U');
                }
            }

            System.out.println(sb.toString());
        }
    }
}
