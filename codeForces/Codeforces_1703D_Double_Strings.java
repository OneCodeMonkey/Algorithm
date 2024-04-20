// AC: 608 ms 
// Memory: 14100 KB
// Hashset.
// T:O(sum(ni * k)), S:O(max(ni * k)), k = string length.
//
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1703D_Double_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            HashSet<String> record = new HashSet<>();
            String[] arr = new String[n];
            for (int j = 0; j < n; j++) {
                String s = sc.next();
                record.add(s);
                arr[j] = s;
            }
            StringBuilder ret = new StringBuilder();
            for (int j = 0; j < n; j++) {
                String item = arr[j];
                boolean flag = false;
                for (int k = 0; k < item.length() - 1; k++) {
                    String s1 = item.substring(0, k + 1), s2 = item.substring(k + 1);
                    if (record.contains(s1) && record.contains(s2)) {
                        flag = true;
                        break;
                    }
                }
                ret.append(flag ? 1 : 0);
            }

            System.out.println(ret);
        }
    }
}
