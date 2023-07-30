// AC: 514 ms 
// Memory: 0 KB
// constructive, greedy
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1790B_Taisia_and_Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), s = sc.nextInt(), r = sc.nextInt(), maxVal = s - r;
            List<Integer> ret = new LinkedList<>();
            ret.add(maxVal);
            int remain = r - (n - 1);
            for (int j = 0; j < n - 1; j++) {
                if (remain >= maxVal - 1) {
                    ret.add(maxVal);
                    remain -= maxVal - 1;
                } else {
                    ret.add(remain + 1);
                    remain = 0;
                }
            }

            for (int j = 0; j < n; j++) {
                System.out.print(ret.get(j));
                if (j != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
