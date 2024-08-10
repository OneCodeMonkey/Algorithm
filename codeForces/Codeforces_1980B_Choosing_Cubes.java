// AC: 499 ms 
// Memory: 1300 KB
// Sort.
// T:O(sum(ni*logni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1980B_Choosing_Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), f = sc.nextInt(), k = sc.nextInt(), target = 0, ret = 0;
            Integer[] arr = new Integer[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
            }
            target = arr[f - 1];
            Arrays.sort(arr, (o1, o2) -> o2 - o1);
            if (arr[k - 1] < target) {
                System.out.println("YES");
            } else if (arr[k - 1] == target) {
                if (k < n && arr[k] == target) {
                    System.out.println("MAYBE");
                } else {
                    System.out.println("YES");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
