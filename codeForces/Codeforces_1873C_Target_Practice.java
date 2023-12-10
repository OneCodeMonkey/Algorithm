// AC: 217 ms 
// Memory: 0 KB
// .
// T:O(t * k^2), S:O(k),  k = 10
// 
import java.util.Scanner;

public class Codeforces_1873C_Target_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int ret = 0;
            for (int j = 0; j < 10; j++) {
                String row = sc.next();
                for (int k = 0; k < 10; k++) {
                    if (row.charAt(k) == 'X') {
                        if (j == 0 || j == 9 || k == 0 || k == 9) {
                            ret += 1;
                        } else if (j == 1 || j == 8 || k == 1 || k == 8) {
                            ret += 2;
                        } else if (j == 2 || j == 7 || k == 2 || k == 7) {
                            ret += 3;
                        } else if (j == 3 || j == 6 || k == 3 || k == 6) {
                            ret += 4;
                        } else {
                            ret += 5;
                        }
                    }
                }
            }
            System.out.println(ret);
        }
    }
}
