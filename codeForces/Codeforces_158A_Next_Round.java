// AC: Time: 374 ms   
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1B_SpreadSheet {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt(), pivot = 0, ret = 0;
        for (int i = 0; i < n; i++) {
            int item = sc.nextInt();
            if (item > 0) {
                if (i == k - 1) {
                    pivot = item;
                }
                if (i <= k - 1 || (i > k - 1 && item >= pivot)) {
                    ret++;
                }
            } else {
                break;
            }
        }
        System.out.println(ret);
    }
}