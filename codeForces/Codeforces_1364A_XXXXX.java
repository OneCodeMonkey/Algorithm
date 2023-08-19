// AC: 639 ms 
// Memory: 0 KB
// Two pointers.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1364A_XXXXX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), x = sc.nextInt(), sum = 0, ret = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
                sum += a;
            }
            if (x == 1) {
                ret = -1;
                System.out.println(ret);
                continue;
            }

            if (sum % x != 0) {
                ret = n;
            } else {
                boolean flag = false;
                int left = 0, right = n - 1;
                while (left <= right) {
                    if (arr[left] % x != 0 || arr[right] % x != 0) {
                        ret = right - left + left;
                        flag = true;
                        break;
                    }
                    left++;
                    right--;
                }
                if (!flag) {
                    ret = -1;
                }
            }

            System.out.println(ret);
        }
    }
}
