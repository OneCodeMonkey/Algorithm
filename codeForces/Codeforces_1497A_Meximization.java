// AC: 280 ms 
// Memory: 1500 KB
// Sort & place duplicate elements behind.
// T:O(sum(ni * logni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1497A_Meximization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
            }
            Arrays.sort(arr);
            StringBuilder ret = new StringBuilder(), dup = new StringBuilder();
            int prev = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j] == prev) {
                    dup.append(arr[j]);
                    if (j != n - 1) {
                        dup.append(" ");
                    }
                } else {
                    ret.append(arr[j]);
                    if (j != n - 1) {
                        ret.append(" ");
                    }
                    prev = arr[j];
                }
            }
            if (!dup.toString().isEmpty()) {
                ret.append(" ");
                ret.append(dup);
            }
            System.out.println(ret);
        }
    }
}
