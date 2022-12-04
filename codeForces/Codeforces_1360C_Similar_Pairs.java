// Time: 265 ms 
// Memory: 0 KB
// if even and odd numbers count are even, then true. or we can find an odd and an even that diff 1 or -1.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1360C_Similar_Pairs {
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            int n = SC.nextInt(), pos = 0, countEven = 0;
            int[] arr = new int[n];
            HashSet<Integer> record = new HashSet<>();
            for (int j = 0; j < n; j++) {
                int a = SC.nextInt();
                arr[pos++] = a;
                record.add(a);
                if (a % 2 == 0) {
                    countEven++;
                }
            }
            if (countEven % 2 == 0) {
                System.out.println("YES");
            } else {
                boolean flag = false;
                for (int j = 0; j < n; j++) {
                    int a = arr[j];
                    if (a % 2 == 1 && (record.contains(a + 1) || record.contains(a - 1))) {
                        flag = true;
                        break;
                    }
                }
                System.out.println(flag ? "YES" : "NO");
            }
        }
    }
}
