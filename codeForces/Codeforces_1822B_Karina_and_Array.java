// AC: 842 ms 
// Memory: 2800 KB
// Sort.
// T:O(sum(ni * logni)), S:O(max(ni))
// 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1822B_Karina_and_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            List<Integer> posi = new ArrayList<>(), nega = new ArrayList<>();
            boolean hasZero = false;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a > 0) {
                    posi.add(a);
                } else if (a == 0) {
                    hasZero = true;
                } else {
                    nega.add(a);
                }
            }
            long ret = hasZero ? 0 : Long.MIN_VALUE;
            if (posi.size() > 0) {
                Collections.sort(posi, Collections.reverseOrder());
                if (posi.size() > 1) {
                    ret = Math.max(ret, (long) posi.get(0) * posi.get(1));
                }
            }
            if (nega.size() > 0) {
                Collections.sort(nega);
                if (nega.size() > 1) {
                    ret = Math.max(ret, (long) nega.get(0) * nega.get(1));
                }
            }
            if (posi.size() == 1 && nega.size() == 1) {
                ret = Math.max(ret, (long) posi.get(0) * nega.get(0));
            }

            System.out.println(ret);
        }
    }
}
