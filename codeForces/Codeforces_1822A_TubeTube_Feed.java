// AC: 343 ms 
// Memory: 1100 KB
// brute-force.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1822A_TubeTube_Feed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int n = sc.nextInt(), t = sc.nextInt(), ret = -1, retIndex = -1;
            int[] arr1 = new int[n], arr2 = new int[n];
            for (int j = 0; j < n; j++) {
                arr1[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                arr2[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if (arr1[j] <= t && arr2[j] > ret) {
                    ret = Math.max(ret, arr2[j]);
                    retIndex = j + 1;
                }
                t--;
            }

            System.out.println(retIndex);
        }
    }
}
