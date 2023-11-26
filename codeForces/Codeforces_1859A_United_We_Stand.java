// AC: 529 ms 
// Memory: 0 KB
// Constructive: make the smallest element come into array b, the remaining come into array c.
// T:O(sum(ni logni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1859A_United_We_Stand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
                count.merge(a, 1, Integer::sum);
            }
            Arrays.sort(arr);
            if (arr[0] == arr[n - 1]) {
                System.out.println(-1);
            } else {
                int minCount = count.get(arr[0]);
                System.out.println(minCount + " " + (n - minCount));
                for (int j = 0; j < minCount; j++) {
                    System.out.print(arr[0]);
                    if (j != minCount - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.println();
                    }
                }
                for (int j = minCount; j < n; j++) {
                    System.out.print(arr[j]);
                    if (j != n - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.println();
                    }
                }
            }
        }
    }
}
