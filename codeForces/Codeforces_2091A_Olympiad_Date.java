// Time: 593 ms 
// Memory: 1000 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_2091A_Olympiad_Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Integer, Integer> answer = new HashMap<>(), cur = new HashMap<>();
        answer.put(0, 3);
        answer.put(1, 1);
        answer.put(2, 2);
        answer.put(3, 1);
        answer.put(5, 1);
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), count = 0, ret = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (ret == 0 && cur.getOrDefault(a, 0) + 1 <= answer.getOrDefault(a, 0)) {
                    cur.merge(a, 1, Integer::sum);
                    count++;
                    if (count == 8) {
                        ret = j + 1;
                    }
                }
            }
            cur.clear();

            System.out.println(ret);
        }
    }
}
