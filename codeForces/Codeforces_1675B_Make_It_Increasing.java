// AC: 952 ms 
// Memory: 800 KB
// .
// T:O(nlog(max(ai))), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_1675B_Make_It_Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            int[] arr = new int[n];
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
            }
            for (int j = n - 2; j >= 0; j--) {
                if (arr[j + 1] < 1) {
                    flag = false;
                    break;
                }
                while (arr[j] >= arr[j + 1]) {
                    arr[j] /= 2;
                    ret++;
                }
                if (arr[j] < j) {
                    flag = false;
                    break;
                }
            }

            System.out.println(flag ? ret : -1);
        }
    }
}
