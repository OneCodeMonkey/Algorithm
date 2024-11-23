// AC: 264 ms 
// Memory: 700 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1552A_Subsequence_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            String s = sc.next();
            char[] arr = s.toCharArray(), arr2 = s.toCharArray();
            Arrays.sort(arr2);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != arr2[j]) {
                    ret++;
                }
            }

            System.out.println(ret);
        }
    }
}
