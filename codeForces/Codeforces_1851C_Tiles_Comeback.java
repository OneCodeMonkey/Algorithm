// AC: 608 ms 
// Memory: 900 KB
// Greedy.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1851C_Tiles_Comeback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), headColor = -1, tailColor = -1, countHeadColor = 0;
            boolean flag = false;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int c = sc.nextInt();
                if (j == 0) {
                    headColor = c;
                }
                if (j == n - 1) {
                    tailColor = c;
                }
                if (c == headColor) {
                    countHeadColor++;
                }
                arr[j] = c;
            }
            if (headColor == tailColor) {
                flag = countHeadColor >= k;
            } else {
                if (countHeadColor < k) {
                    flag = false;
                } else {
                    int index1 = -1, count = 0, index2 = -1;
                    for (int j = 0; j < n; j++) {
                        if (arr[j] == headColor) {
                            count++;
                            if (count == k) {
                                index1 = j;
                                break;
                            }
                        }
                    }
                    count = 0;
                    for (int j = n - 1; j >= 0; j--) {
                        if (arr[j] == tailColor) {
                            count++;
                            if (count == k) {
                                index2 = j;
                                break;
                            }
                        }
                    }
                    flag = index2 != -1 && index1 < index2;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
