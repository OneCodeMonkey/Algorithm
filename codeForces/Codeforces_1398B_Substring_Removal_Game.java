// AC: 233 ms 
// Memory: 0 KB
// .
// T:O(sum(si.length())), S:O(max(si.length()))
// 
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1398B_Substring_Removal_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int ret = 0, cur = 0;
            List<Integer> countContOneList = new LinkedList<>();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '0') {
                    if (cur != 0) {
                        countContOneList.add(cur);
                        cur = 0;
                    }
                } else {
                    cur++;
                    if (j == s.length() - 1) {
                        countContOneList.add(cur);
                    }
                }
            }
            Collections.sort(countContOneList);
            for (int j = countContOneList.size() - 1; j >= 0; j--) {
                if ((countContOneList.size() - 1 - j) % 2 == 0) {
                    ret += countContOneList.get(j);
                }
            }

            System.out.println(ret);
        }
    }
}
