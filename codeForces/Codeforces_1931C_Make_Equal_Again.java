// AC: 592 ms 
// Memory: 300 KB
// Greedy. Since can apply at most one operation, we must start from left side or right side and make all equal to one of them.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1931C_Make_Equal_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            if (n > 1) {
                if (arr[0] != arr[n - 1]) {
                    int count1 = 0, count2 = 0;
                    for (int j = 1; j < n - 1; j++) {
                        if (arr[j] == arr[0]) {
                            count1++;
                        } else {
                            break;
                        }
                    }
                    for (int j = n - 2; j >= 1; j--) {
                        if (arr[j] == arr[n - 1]) {
                            count2++;
                        } else {
                            break;
                        }
                    }

                    ret = n - Math.max(count1, count2) - 1;
                } else {
                    int count = 0, pos = 0;
                    for (pos = 1; pos < n - 1; pos++) {
                        if (arr[pos] == arr[0]) {
                            count++;
                        } else {
                            break;
                        }
                    }
                    for (int j = n - 2; j > pos; j--) {
                        if (arr[j] == arr[n - 1]) {
                            count++;
                        } else {
                            break;
                        }
                    }
                    ret = n - count - 2;
                }
            }

            System.out.println(ret);
        }
    }
}
