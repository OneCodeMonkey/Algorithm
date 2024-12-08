// AC: 687 ms 
// Memory: 1200 KB
// Greedy.
// T:O(sum(n + m * logni)), S:O(max(ni))
// 
import java.util.PriorityQueue;
import java.util.Scanner;

public class Codeforces_1770A_Koxia_and_Whiteboards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt();
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                minHeap.offer(a);
            }
            for (int j = 0; j < m; j++) {
                int b = sc.nextInt();
                minHeap.poll();
                minHeap.offer(b);
            }
            long sum = 0;
            while (!minHeap.isEmpty()) {
                sum += minHeap.poll();
            }

            System.out.println(sum);
        }
    }
}
