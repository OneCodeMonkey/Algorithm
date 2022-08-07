// AC: 374 ms 
// Memory: 0 KB
// .
// T:O(nlogn), S:O(n)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_34B_Sale {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), pos = 0, ret = 0;
        int[] record = new int[n];
        for (int i = 0; i < n; i++) {
            record[pos++] = sc.nextInt();
        }
        Arrays.sort(record);
        pos = 0;
        for (int i : record) {
            if (i < 0 && pos < m) {
                ret += -i;
                pos++;
            } else {
                break;
            }
        }
        System.out.println(ret);
    }
}
