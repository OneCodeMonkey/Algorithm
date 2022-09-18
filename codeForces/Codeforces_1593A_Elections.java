// AC: 358 ms 
// Memory: 200 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1593A_Elections {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            List<Integer> record = Arrays.asList(a, b, c);
            Collections.sort(record);
            if (record.get(2) > record.get(1)) {
                System.out.println((a < record.get(2) ? (record.get(2) - a + 1) : 0) + " " + (b < record.get(2) ? (record.get(2) - b + 1) : 0) + " " + (c < record.get(2) ? (record.get(2) - c + 1) : 0));
            } else {
                System.out.println((a < record.get(1) ? (record.get(1) - a + 1) : 1) + " " + (b < record.get(1) ? (record.get(1) - b + 1) : 1) + " " + (c < record.get(1) ? (record.get(1) - c + 1) : 1));
            }
        }
    }
}
