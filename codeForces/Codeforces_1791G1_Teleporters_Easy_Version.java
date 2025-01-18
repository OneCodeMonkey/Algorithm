// Time: 686 ms	
// Memory: 1200 KB
// Greedy & sort.
// T:O(sum(ni * logni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1791G1_Teleporters_Easy_Version {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), c = sc.nextInt(), ret = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a + j + 1;
            }
            Arrays.sort(arr);
            for (int j = 0; j < n; j++) {
                if (arr[j] > c) {
                    break;
                }
                c -= arr[j];
                ret++;
            }

            System.out.println(ret);
        }
    }
}
