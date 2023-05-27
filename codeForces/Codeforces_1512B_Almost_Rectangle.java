// AC: 218 ms 
// Memory: 0 KB
// constructive
// T:O(sum(ni^2)), S:O(max(ni^2))
// 
import java.util.Scanner;

public class Codeforces_1512B_Almost_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), x1 = -1, x2 = -1, y1 = -1, y2 = -1;
            String[] table = new String[n];
            for (int j = 0; j < n; j++) {
                String row = sc.next();
                table[j] = row;
                if (row.contains("*")) {
                    int index = row.indexOf("*"), lastIndex = row.lastIndexOf("*");
                    // single *
                    if (index == lastIndex) {
                        if (x1 == -1) {
                            x1 = j;
                            y1 = index;
                        } else {
                            x2 = j;
                            y2 = index;
                        }
                    } else {    // double * in a row
                        x1 = j;
                        x2 = j;
                        y1 = index;
                        y2 = lastIndex;
                    }
                }
            }

            int x3, y3, x4, y4;
            if (x1 == x2) {
                if (x1 < n - 1) {
                    x3 = n - 1;
                    x4 = n - 1;
                    y3 = y1;
                    y4 = y2;
                } else {
                    x3 = n - 2;
                    x4 = n - 2;
                    y3 = y1;
                    y4 = y2;
                }
            } else if (y1 == y2) {
                if (y1 < n - 1) {
                    y3 = n - 1;
                    y4 = n - 1;
                    x3 = x1;
                    x4 = x2;
                } else {
                    y3 = n - 2;
                    y4 = n - 2;
                    x3 = x1;
                    x4 = x2;
                }
            } else {
                x3 = x2;
                y3 = y1;
                x4 = x1;
                y4 = y2;
            }
            table[x3] = table[x3].substring(0, y3) + "*" + table[x3].substring(y3 + 1, n);
            table[x4] = table[x4].substring(0, y4) + "*" + table[x4].substring(y4 + 1, n);

            for (String row : table) {
                System.out.println(row);
            }
        }
    }
}