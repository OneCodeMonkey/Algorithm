// AC: 546 ms 
// Memory: 1800 KB
// Bitmask: It can be proved that only when A and B's binary length is equal, we have `A & B >= A ^ B`, so just group elements by its binary length,
// and calculate combinations in each binary length group.
// T:O(sum(ni)), S:O(max(log(ni)))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1420B_Rock_and_Lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long ret = 0;
            HashMap<Integer, Integer> binaryLengthCount = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                binaryLengthCount.merge(getBinaryLength(a), 1, Integer::sum);
            }
            for (int length : binaryLengthCount.keySet()) {
                int count = binaryLengthCount.get(length);
                ret += (long) count * (count - 1) / 2;
            }

            System.out.println(ret);
        }
    }

    private static int getBinaryLength(int n) {
        int digit = 0;
        while (n > 0) {
            digit++;
            n /= 2;
        }
        return digit;
    }
}
