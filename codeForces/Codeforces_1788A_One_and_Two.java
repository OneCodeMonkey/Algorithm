// AC: 280 ms  
// Memory: 0 KB
// One pass.
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_1788A_One_and_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = -1, countTwo = 0, curCountTwo = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
                if (a == 2) {
                    countTwo++;
                }
            }
            if (countTwo == 0) {
                ret = 1;
            } else if (countTwo % 2 == 1) {
                ret = -1;
            } else {
                for (int j = 0; j < n - 1; j++) {
                    if (arr[j] == 2) {
                        curCountTwo++;
                        if (2 * curCountTwo == countTwo) {
                            ret = j + 1;
                            break;
                        }
                    }
                }
            }
            System.out.println(ret);
        }
    }
}