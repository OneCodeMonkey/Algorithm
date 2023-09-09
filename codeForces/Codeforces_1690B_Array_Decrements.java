// AC: 623 ms 
// Memory: 0 KB
// If arrB[i] is 0, then record the diff between arrA[i], it cannot be larger than the diff when both are non-zero.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1690B_Array_Decrements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            boolean ret = true;
            int n = sc.nextInt(), diffNonZero = -1, maxDiffWhenZero = 0;
            int[] arrA = new int[n], arrB = new int[n];
            for (int j = 0; j < n; j++) {
                arrA[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                arrB[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if (arrA[j] < arrB[j]) {
                    ret = false;
                    break;
                }
                if (arrB[j] == 0) {
                    maxDiffWhenZero = Math.max(maxDiffWhenZero, arrA[j]);
                    if (diffNonZero != -1 && maxDiffWhenZero > diffNonZero) {
                        ret = false;
                        break;
                    }
                } else {
                    if (diffNonZero == -1) {
                        diffNonZero = arrA[j] - arrB[j];
                    } else if (arrA[j] - arrB[j] != diffNonZero) {
                        ret = false;
                        break;
                    }
                }
            }
            if (diffNonZero != -1 && maxDiffWhenZero > diffNonZero) {
                ret = false;
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
