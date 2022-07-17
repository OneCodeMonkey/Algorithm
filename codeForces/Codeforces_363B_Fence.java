// AC: 343 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(k)
// 
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Codeforces_363B_Fence {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt(), ret = -1, sum = 0, maxSum = Integer.MAX_VALUE;
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            queue.offerLast(h);
            if (i + 1 >= k) {
                sum += h;
                if (sum < maxSum) {
                    ret = i + 2 - k;
                    maxSum = sum;
                }
                sum -= queue.pollFirst();
            } else {
                sum += h;
            }
        }
        System.out.println(ret);
    }
}
