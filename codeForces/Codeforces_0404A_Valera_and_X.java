// AC: 359 ms 
// Memory: 1900 KB
// .
// T:O(n), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_0404A_Valera_and_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        HashMap<Character, Integer> record = new HashMap<>();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            arr[i] = s;
            if (flag) {
                for (char c : s.toCharArray()) {
                    record.merge(c, 1, Integer::sum);
                }
                if (record.size() > 2) {
                    flag = false;
                }
            }
        }
        if (record.size() != 2) {
            flag = false;
        }
        if (flag) {
            int c1 = 0, c2 = 0;
            for (char c : record.keySet()) {
                if (c1 == 0) {
                    c1 = record.get(c);
                } else {
                    c2 = record.get(c);
                }
            }
            if (c1 != 2 * n - 1 && c2 != 2 * n - 1) {
                flag = false;
            } else {
                for (int i = 0; i < n; i++) {
                    if (arr[i].charAt(i) != arr[0].charAt(0)) {
                        flag = false;
                        break;
                    }
                    if (arr[i].charAt(n - 1 - i) != arr[0].charAt(0)) {
                        flag = false;
                        break;
                    }
                }
            }
        }

        System.out.println(flag ? "YES" : "NO");
    }
}
