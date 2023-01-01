// AC: 171 ms
// Memory: 0 KB
// Greedy.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class CodeForces_1462C_Unique_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), ret = 0;
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            if (x > 45) {
                ret = -1;
            } else if (x < 10) {
                ret = x;
            } else {
                StringBuilder sb = new StringBuilder();
                int pos = 9;
                while (x > 0) {
                    if (x >= pos) {
                        sb.append(pos);
                        x -= pos;
                        pos--;
                    } else {
                        sb.append(x);
                        break;
                    }
                }
                ret = Integer.parseInt(sb.reverse().toString());
            }

            System.out.println(ret);
        }
    }
}
