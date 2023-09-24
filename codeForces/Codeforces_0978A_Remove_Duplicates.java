// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_0978A_Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (!ret.contains(arr[i])) {
                ret.add(arr[i]);
            }
        }

        System.out.println(ret.size());
        for (int i = ret.size() - 1; i >= 0; i--) {
            System.out.print(ret.get(i));
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
