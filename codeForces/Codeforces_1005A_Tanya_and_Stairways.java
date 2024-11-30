// AC: 328 ms 
// Memory: 1000 KB
// .
// T:O(n), S:O(n)
// 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1005A_Tanya_and_Stairways {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cur = 0;
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                if (cur > 0) {
                    ret.add(cur);
                }
                cur = 1;
            } else {
                cur++;
            }
            if (i == n - 1) {
                ret.add(cur);
                cur = 0;
            }
        }
        System.out.println(ret.size());
        StringBuilder retStr = new StringBuilder();
        for (int i = 0; i < ret.size(); i++) {
            retStr.append(ret.get(i));
            if (i != ret.size() - 1) {
                retStr.append(" ");
            }
        }
        System.out.println(retStr);
    }
}
