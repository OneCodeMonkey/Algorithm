// AC: 328 ms 
// Memory: 5900 KB
// Greedy.
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_1722D_Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            long sum = 0, maxSum = n % 2 == 0 ? (n * (3L * n - 2) / 4) : (n / 2 + (3L * n - 1) * (n - 1) / 4);
            int[] arr = new int[n];
            StringBuilder ret = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'L') {
                    arr[j] = j;
                } else {
                    arr[j] = n - 1 - j;
                }
                sum += arr[j];
            }
            int distance = 0;
            for (int j = 0; j < n; j++) {
                if (sum == maxSum) {
                    ret.append(sum);
                    if (j != n - 1) {
                        ret.append(" ");
                    }
                } else {
                    // greedy. Find first char which can change to get more value.
                    while (distance / 2 <= n / 2 - 1) {
                        if (distance % 2 == 0) {
                            if (s.charAt(distance / 2) == 'L') {
                                sum += n - 1 - distance / 2;
                                sum -= distance / 2;
                                distance++;
                                break;
                            }
                            distance++;
                        } else {
                            if (s.charAt(n - 1 - distance / 2) == 'R') {
                                sum += n - 1 - distance / 2;
                                sum -= distance / 2;
                                distance++;
                                break;
                            }
                            distance++;
                        }
                    }
                    ret.append(sum);
                    if (j != n - 1) {
                        ret.append(" ");
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
