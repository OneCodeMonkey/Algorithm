// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1709A_Three_Doors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int[] arr = new int[3];
            arr[x - 1] = 1;
            int currentKey = x, nextKey = 0;
            do {
                if (currentKey == 1) {
                    if (a != 0) {
                        arr[a - 1] = 1;
                    }
                    currentKey = a;
                } else if (currentKey == 2) {
                    if (b != 0) {
                        arr[b - 1] = 1;
                    }
                    currentKey = b;
                } else {
                    if (c != 0) {
                        arr[c - 1] = 1;
                    }
                    currentKey = c;
                }

                if (currentKey == 1) {
                    nextKey = a;
                } else if (currentKey == 2) {
                    nextKey = b;
                } else {
                    nextKey = c;
                }
            } while (currentKey != 0 && nextKey != 0);

            System.out.println(arr[0] + arr[1] + arr[2] == 3 ? "YES" : "NO");
        }
    }
}
