// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1850C_Word_on_the_Paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            StringBuilder ret = new StringBuilder();
            for (int j = 0; j < 8; j++) {
                String line = sc.next();
                if ("........".equals(line)) {
                    continue;
                }
                for (int k = 0; k < 8; k++) {
                    if (line.charAt(k) != '.') {
                        ret.append(line.charAt(k));
                        break;
                    }
                }
            }
            System.out.println(ret);
        }
    }
}
