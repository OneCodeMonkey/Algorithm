// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1538A_Stone_Game {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), pos = 0, minVal = Integer.MAX_VALUE, minValIndex = -1, maxVal = 0, maxValIndex = -1;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                pos++;
                if (a < minVal) {
                    minVal = a;
                    minValIndex = pos;
                }
                if (a > maxVal) {
                    maxVal = a;
                    maxValIndex = pos;
                }
            }
            List<Integer> alternatives = new LinkedList<>();
            alternatives.add(Math.max(minValIndex, maxValIndex));
            alternatives.add(n - Math.min(minValIndex, maxValIndex) + 1);
            alternatives.add(Math.min(minValIndex, maxValIndex) + n - Math.max(minValIndex, maxValIndex) + 1);
            Collections.sort(alternatives);
            System.out.println(alternatives.get(0));
        }
    }
}
