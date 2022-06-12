// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_1560A_Dislike_of_Threes {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt(), pos = 0, start = 1;
        int[] record = new int[1000];
        while (pos < 1000) {
            record[pos++] = start;
            start++;
            while (start % 3 == 0 || start % 10 == 3) {
                start++;
            }
        }
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            System.out.println(record[k - 1]);
        }
    }
}
