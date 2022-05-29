// AC: 264 ms 
// Memory: 25400 KB
// .
// T:O(n), S:O(n)
// 
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Codeforces_490A_Team_Olympiad {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), pos = 0;
        Stack<Integer> t1 = new Stack<>(), t2 = new Stack<>(), t3 = new Stack<>();
        List<String> ans = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            pos++;
            if (t == 1) {
                t1.push(pos);
            } else if (t == 2) {
                t2.push(pos);
            } else if (t == 3) {
                t3.push(pos);
            }
            if (!t1.empty() && !t2.empty() && !t3.empty()) {
                String ansItem = t1.pop() + " " + t2.pop() + " " + t3.pop();
                ans.add(ansItem);
            }
        }
        System.out.println(ans.size());
        if (ans.size() > 0) {
            for (String ansItem : ans) {
                System.out.println(ansItem);
            }
        }
    }
}
