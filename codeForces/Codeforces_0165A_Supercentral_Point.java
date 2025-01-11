// Time: 654 ms 
// Memory: 1100 KB
// Map.
// T:O(n), S:O(n)
// 
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Codeforces_0165A_Supercentral_Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ret = 0;
        HashMap<Integer, List<Integer>> xAxios = new HashMap<>(), yAxios = new HashMap<>();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            if (!xAxios.containsKey(y)) {
                xAxios.put(y, new ArrayList<>());
            }
            xAxios.get(y).add(x);
            if (!yAxios.containsKey(x)) {
                yAxios.put(x, new ArrayList<>());
            }
            yAxios.get(x).add(y);
            points[i] = new int[]{x, y};
        }
        for (int key : xAxios.keySet()) {
            Collections.sort(xAxios.get(key));
        }
        for (int key : yAxios.keySet()) {
            Collections.sort(yAxios.get(key));
        }
        for (int i = 0; i < n; i++) {
            int x = points[i][0], y = points[i][1];
            List<Integer> yLine = yAxios.get(x), xLine = xAxios.get(y);
            boolean y1 = false, y2 = false, x1 = false, x2 = false;
            if (yLine.get(0) < y) {
                y1 = true;
            }
            if (yLine.get(yLine.size() - 1) > y) {
                y2 = true;
            }
            if (xLine.get(0) < x) {
                x1 = true;
            }
            if (xLine.get(xLine.size() - 1) > x) {
                x2 = true;
            }

            if (x1 && x2 && y1 && y2) {
                ret++;
            }
        }

        System.out.println(ret);
    }
}
