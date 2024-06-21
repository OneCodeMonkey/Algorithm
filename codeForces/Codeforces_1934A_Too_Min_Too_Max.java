// AC: 358 ms 
// Memory: 700 KB
// Greedy: find largest two elements and least two elements, and calculate the expression.
// T:O(sum(ni)), S:O(1)
//
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Codeforces_1934A_Too_Min_Too_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            PriorityQueue<Integer> bottomTwo = new PriorityQueue<>(), topTwo = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                bottomTwo.offer(a);
                topTwo.offer(a);
            }
            int max1 = topTwo.poll(), max2 = topTwo.poll(), min1 = bottomTwo.poll(), min2 = bottomTwo.poll();
            ret += (max1 - min1) + (max1 - min2) + (max2 - min2) + (max2 - min1);
            System.out.println(ret);
        }
    }
}
