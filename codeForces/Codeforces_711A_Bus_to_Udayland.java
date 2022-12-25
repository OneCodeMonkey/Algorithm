// AC: 233 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_711A_Bus_to_Udayland {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), pos = 0;
        boolean flag = false;
        String[] rows = new String[n];
        for (int i = 0; i < n; i++) {
            String row = sc.next();
            rows[pos++] = row;
            String[] arr = row.split("\\|");
            if (flag) {
                continue;
            }
            if ("OO".equals(arr[0]) || "OO".equals(arr[1])) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("YES");
            for (String row : rows) {
                if (!flag) {
                    System.out.println(row);
                    continue;
                }
                if (row.startsWith("OO")) {
                    flag = false;
                    System.out.println("++" + row.substring(2));
                } else if (row.endsWith("OO")) {
                    flag = false;
                    System.out.println(row.substring(0, 3) + "++");
                } else {
                    System.out.println(row);
                }
            }
        } else {
            System.out.println("NO");
        }
    }
}
