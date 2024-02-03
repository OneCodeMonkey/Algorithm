// AC: 608 ms 
// Memory: 500 KB
// do as it say.
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_1352D_Alice_Bob_and_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), cur = 0, round = 0, sum1 = 0, sum2 = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            for (int left = 0, right = n - 1; left <= right; round++) {
                int sum = 0;
                if (round % 2 == 0) {
                    sum = arr[left++];
                    while (sum <= cur) {
                        if (left > right) {
                            break;
                        }
                        sum += arr[left++];
                    }
                    cur = Math.max(cur, sum);
                    sum1 += sum;
                } else {
                    sum = arr[right--];
                    while (sum <= cur) {
                        if (left > right) {
                            break;
                        }
                        sum += arr[right--];
                    }
                    cur = Math.max(cur, sum);
                    sum2 += sum;
                }
            }
            System.out.println(round + " " + sum1 + " " + sum2);
        }
    }
}
