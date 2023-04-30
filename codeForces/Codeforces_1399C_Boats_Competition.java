// AC: 436 ms 
// Memory: 0 KB
// Sort & brute-force & two-pointer
// T:O(sum(n * k)), S:O(max(n)), k = 100;
//
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1399C_Boats_Competition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            int[] record = new int[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                record[j] = a;
            }
            Arrays.sort(record);
            for (int w = 2; w <= 100; w++) {
                int left = 0, right = n - 1, count = 0;
                while (left < right) {
                    int sum = record[left] + record[right];
                    if (sum == w) {
                        left++;
                        right--;
                        count++;
                    } else if (sum < w) {
                        left++;
                    } else {
                        right--;
                    }
                }
                ret = Math.max(ret, count);
            }

            System.out.println(ret);
        }
    }
}
